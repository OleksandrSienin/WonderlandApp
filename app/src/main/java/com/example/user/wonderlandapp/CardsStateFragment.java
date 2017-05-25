package com.example.user.wonderlandapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 06.05.2017.
 */
public class CardsStateFragment extends Fragment {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	List<CardClass> cardsCollection;
	HashMap<String, List<CardClass>> listDataChild;
	List<CardClass> character = new ArrayList<CardClass>();

	List<CardClass> inventory = new ArrayList<CardClass>();
	List<CardClass> abilities = new ArrayList<CardClass>();
	List<CardClass> spells = new ArrayList<CardClass>();
	List<CardClass> tricks = new ArrayList<CardClass>();
	List<CardClass> friends = new ArrayList<CardClass>();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_cards_state, container, false);
		// get the listview
		expListView = (ExpandableListView) view.findViewById(R.id.cards_list);
		// preparing list data
		prepareListData();
		listAdapter = new ExpandableListAdapter(view.getContext(), listDataHeader, listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);
		int number =MessagesClass.AddCard(view.getContext(),R.string.choosecharacter);
		CardClass card= CardsStorage.FindCardById(number);
		if (!(card==null)){
			character.add(card);
		}
		return view;
	}

	public static View FillCardForm(View cardView, CardClass childData, Context context){
		TextView identChild = (TextView) cardView.findViewById(R.id.card_identifier);
		identChild.setText(childData.getId() + "\t" + childData.getCategory());

		ImageView imgChild = (ImageView) cardView.findViewById(R.id.card_image);
		imgChild.setImageResource(context.getResources().getIdentifier("com.example.user.wonderlandapp:drawable/" + childData.getImage(), null, null));

		TextView nameChild = (TextView) cardView.findViewById(R.id.card_name);
		nameChild.setText(childData.getName());

		TextView bonusChild = (TextView) cardView.findViewById(R.id.card_bonuses);
		bonusChild.setText(childData.getBonuses());

		TextView descrChild = (TextView) cardView.findViewById(R.id.card_description);
		descrChild.setText(childData.getDescription());

		return cardView;
	}

	private void prepareListData() {

		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<CardClass>>();

		// Adding child data
		listDataHeader.add("Character");
		listDataHeader.add("Inventory");
		listDataHeader.add("Abilities");
		listDataHeader.add("Spells");
		listDataHeader.add("Tricks");
		listDataHeader.add("Friends");

//		character.add(CardsStorage.cards[0]);

		// Adding child data
/*        top250.add("The Shawshank Redemption");
		top250.add("The Godfather");
		top250.add("The Godfather: Part II");
		top250.add("Pulp Fiction");
		top250.add("The Good, the Bad and the Ugly");
		top250.add("The Dark Knight");
		top250.add("12 Angry Men");

		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("The Conjuring");
		nowShowing.add("Despicable Me 2");
		nowShowing.add("Turbo");
		nowShowing.add("Grown Ups 2");
		nowShowing.add("Red 2");
		nowShowing.add("The Wolverine");

		List<String> comingSoon = new ArrayList<String>();
		comingSoon.add("2 Guns");
		comingSoon.add("The Smurfs 2");
		comingSoon.add("The Spectacular Now");
		comingSoon.add("The Canyons");
		comingSoon.add("Europa Report");*/

		listDataChild.put(listDataHeader.get(0), character); // Header, Child data
		listDataChild.put(listDataHeader.get(1), inventory);
		listDataChild.put(listDataHeader.get(2), abilities);
		listDataChild.put(listDataHeader.get(3), spells);
		listDataChild.put(listDataHeader.get(4), tricks);
		listDataChild.put(listDataHeader.get(5), friends);
	}
}
