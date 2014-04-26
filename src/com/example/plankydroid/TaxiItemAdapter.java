package com.example.plankydroid;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Adapter to bind a ToDoItem List to a view
 */
public class TaxiItemAdapter extends ArrayAdapter<TaxiItem> {

	/**
	 * Adapter context
	 */
	Context mContext;

	/**
	 * Adapter View layout
	 */
	int mLayoutResourceId;

	public TaxiItemAdapter(Context context, int layoutResourceId) {
		super(context, layoutResourceId);

		mContext = context;
		mLayoutResourceId = layoutResourceId;
	}

	/**
	 * Returns the view for a specific item on the list
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;

		final TaxiItem currentItem = getItem(position);

		if (row == null) {
			LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
			row = inflater.inflate(mLayoutResourceId, parent, false);
		}

		row.setTag(currentItem);
		//final CheckBox checkBox = (CheckBox) row.findViewById(R.id.checkToDoItem);
		//checkBox.setText(currentItem.getText());
		//checkBox.setChecked(false);
		//checkBox.setEnabled(true);
		
		final TextView text = (TextView) row.findViewById(R.id.textView1);
		text.setText(currentItem.getText());
		
		final TextView tel = (TextView) row.findViewById(R.id.textView3);
		tel.setText(currentItem.getTel());
		
		final TextView price1 = (TextView) row.findViewById(R.id.textView2);
		price1.setText(currentItem.getPrice1());

		/*
		checkBox.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if (checkBox.isChecked()) {
					checkBox.setEnabled(false);
					if (mContext instanceof ToDoActivity) {
						ToDoActivity activity = (ToDoActivity) mContext;
						activity.checkItem(currentItem);
					}
				}
			}
		});
		 */

		return row;
	}
}