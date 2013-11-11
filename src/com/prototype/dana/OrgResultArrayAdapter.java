package com.prototype.dana;

import java.util.ArrayList;
import java.util.List;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.prototype.dana.model.Event;
import com.prototype.dana.model.OrgResults;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class OrgResultArrayAdapter extends ArrayAdapter<OrgResults> {

	private OrgResults result;
	private ImageView ivOrgIcon;
	private TextView tvOrgEventTracker;
	
	private Context baseContext;
	
	public OrgResultArrayAdapter(Context context, ArrayList<OrgResults> resource) {
		super(context, R.layout.org_result_item, resource);
		baseContext = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;

		if (view == null) {
			LayoutInflater inflator = (LayoutInflater) getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflator.inflate(R.layout.org_result_item, null);
		}

		result = getItem(position);
		
		tvOrgEventTracker = (TextView) view.findViewById(R.id.tvOrgEventTracker);
		tvOrgEventTracker.setText(result.getNumEvents());

		ivOrgIcon = (ImageView) view.findViewById(R.id.ivOrgIcon);
		ImageLoader.getInstance().displayImage(result.getIcon(), ivOrgIcon);
		
		/*ivOrgIcon.setTag(result.getUser().getScreenName());
		ivOrgIcon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(baseContext, ProfileActivity.class);
				i.putExtra("screen_name", v.getTag().toString());
				baseContext.startActivity(i);
			}
		});*/
		
		return view;
	}
}
