package com.example.user.wonderlandapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 06.05.2017.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {
	private Context _context;
	private List<String> _listDataHeader; // header titles
	// child data in format of header title, child title
	private HashMap<String, List<CardClass>> _listDataChild;

	public ExpandableListAdapter(Context context, List<String> listDataHeader,
	                             HashMap<String, List<CardClass>> listChildData) {
		this._context = context;
		this._listDataHeader = listDataHeader;
		this._listDataChild = listChildData;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return this._listDataChild.get(this._listDataHeader.get(groupPosition))
				.get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, final int childPosition,
	                         boolean isLastChild, View cardView, ViewGroup parent) {

		final CardClass childData = (CardClass) getChild(groupPosition, childPosition);

		if (cardView == null) {
			LayoutInflater infalInflater = (LayoutInflater) this._context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			cardView = infalInflater.inflate(R.layout.card_form, null);
		}

		TextView identChild=(TextView)cardView.findViewById(R.id.card_identifier);
		identChild.setText(childData.getId()+"\t"+childData.getCategory());

		ImageView imgChild = (ImageView) cardView.findViewById(R.id.card_image);
		imgChild.setImageResource(_context.getResources().getIdentifier("com.example.user.wonderlandapp:drawable/" +childData.getImage() , null, null) );

		TextView nameChild=(TextView)cardView.findViewById(R.id.card_name);
		nameChild.setText(childData.getName());

		TextView bonusChild=(TextView)cardView.findViewById(R.id.card_bonuses);
		bonusChild.setText(childData.getBonuses());

		TextView descrChild=(TextView)cardView.findViewById(R.id.card_description);
		descrChild.setText(childData.getDescription());

		return cardView;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return this._listDataChild.get(this._listDataHeader.get(groupPosition))
				.size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return this._listDataHeader.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return this._listDataHeader.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
	                         View cardGroupView, ViewGroup parent) {
		String headerTitle = (String) getGroup(groupPosition);
		if (cardGroupView == null) {
			LayoutInflater infalInflater = (LayoutInflater) this._context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			cardGroupView = infalInflater.inflate(R.layout.list_group_form, null);
		}

		TextView lblListHeader = (TextView) cardGroupView
				.findViewById(R.id.list_group_name);
		lblListHeader.setTypeface(null, Typeface.BOLD);
		lblListHeader.setText(headerTitle);

		return cardGroupView;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}
}
