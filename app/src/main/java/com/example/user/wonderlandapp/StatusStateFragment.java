package com.example.user.wonderlandapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

/**
 * Created by User on 06.05.2017.
 */
public class StatusStateFragment extends Fragment {

	View view;
	int currenthealth=5,
		limithealth=10,
		currentgold=1,
		currentinventory=0,
		limitinventory=5,
		currentmagic=0,
		limitmagic=25,
		currentmagicweaponmastery=1,
		currentspells=0,
		permanentspells=0,
		limitspells=0,
		spellsconcentration=1,
		currentmight=0,
		limitmight=25,
		currentmightweaponmastery=1,
		currentabilities=0,
		permanentabilities=0,
		limitabilities=0,
		abilitiesconcentration=1,
		currentreputation=-1,
		minreputation=-5,
		maxreputation=5,
		currentsupport=0,
		currenttricks=0,
		permanenttricks=0,
		limittricks=0,
		tricksconcentration=1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState){
		view =  inflater.inflate(R.layout.fragment_status_state, container, false);
		return view;
	}


		public void StatusStateFragmentSetText(){


		TextView healthvalue=(TextView)view.findViewById(R.id.health_value);
		healthvalue.setText(view.getResources().getString(R.string.health,currenthealth,limithealth));

		TextView goldvalue=(TextView)view.findViewById(R.id.gold_value);
		goldvalue.setText(view.getResources().getString(R.string.gold,currentgold));

		TextView inventoryvalue=(TextView)view.findViewById(R.id.inventory_value);
		inventoryvalue.setText(view.getResources().getString(R.string.inventory,currentinventory,limitinventory));

		TextView magicvalue=(TextView)view.findViewById(R.id.magic_value);
		magicvalue.setText(view.getResources().getString(R.string.magic,currentmagic,limitmagic));

		TextView magicweaponmasteryvalue=(TextView)view.findViewById(R.id.magicweaponmastery_value);
		magicweaponmasteryvalue.setText(view.getResources().getString(R.string.magicweaponmastery,currentmagicweaponmastery));

		TextView spellsvalue=(TextView)view.findViewById(R.id.spells_value);
		spellsvalue.setText(view.getResources().getString(R.string.spells,currentspells,permanentspells,limitspells,spellsconcentration));

		TextView mightvalue=(TextView)view.findViewById(R.id.might_value);
		mightvalue.setText(view.getResources().getString(R.string.might,currentmight,limitmight));

		TextView mightweaponmasteryvalue=(TextView)view.findViewById(R.id.mightweaponmastery_value);
		mightweaponmasteryvalue.setText(view.getResources().getString(R.string.mightweaponmastery,currentmightweaponmastery));

		TextView abilitiesvalue=(TextView)view.findViewById(R.id.abilities_value);
		abilitiesvalue.setText(view.getResources().getString(R.string.abilities,currentabilities,permanentabilities,limitabilities,abilitiesconcentration));

		TextView reputationvalue=(TextView) view.findViewById(R.id.reputation_value);
		reputationvalue.setText(view.getResources().getString(R.string.reputation,currentreputation,minreputation,maxreputation));

		TextView supportvalue=(TextView)view.findViewById(R.id.support_value);
		supportvalue.setText(view.getResources().getString(R.string.support,currentsupport));

		TextView tricksvalue=(TextView)view.findViewById(R.id.tricks_value);
		tricksvalue.setText(view.getResources().getString(R.string.tricks,currenttricks,permanenttricks,limittricks,tricksconcentration));
	}
}
