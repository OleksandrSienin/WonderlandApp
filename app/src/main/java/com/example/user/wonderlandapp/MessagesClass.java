package com.example.user.wonderlandapp;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by User on 25.05.2017.
 */

public class MessagesClass {
	static int number=0;

	public static int AddCard(final Context context, int messagetext){
		final Dialog dialog=new Dialog(context);
		dialog.setContentView(R.layout.add_card_dialog);

		TextView message=(TextView)dialog.findViewById(R.id.message);
		message.setText(messagetext);

		final EditText cardnumber=(EditText) dialog.findViewById(R.id.card_number_select);
		cardnumber.addTextChangedListener(new TextWatcher() {
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {

			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				//TODO optimize this condition and code inside
				if(cardnumber.getText().toString().isEmpty()) {
					LinearLayout preview=(LinearLayout) dialog.findViewById(R.id.card_preview);
					preview.addView(LayoutInflater.from(context).inflate(R.layout.card_not_found, null));
				}else {
					int number=Integer.parseInt(cardnumber.getText().toString());
					CardClass card =CardsStorage.FindCardById(number);
					LinearLayout preview=(LinearLayout) dialog.findViewById(R.id.card_preview);
					preview.addView(card.equals(null)?LayoutInflater.from(context).inflate(R.layout.card_not_found, null):CardsStateFragment.FillCardForm(LayoutInflater.from(context).inflate(R.layout.card_form, null),card,context));
				}
			}

			@Override
			public void afterTextChanged(Editable s) {

			}
		});

		Button buttonok=(Button)dialog.findViewById(R.id.add_card_ok);
		buttonok.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				SetCardNumber(Integer.parseInt(cardnumber.getText().toString()));
				dialog.dismiss();
			}
		});

		Button buttoncancel=(Button)dialog.findViewById(R.id.add_card_cancel);
		buttoncancel.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				SetCardNumber(0);
				dialog.dismiss();
			}
		});
		dialog.show();
		return number;
	}

	static void SetCardNumber(int cardnumber){
		number=cardnumber;
	}
}
