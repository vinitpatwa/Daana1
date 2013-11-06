package com.vinit.daana.fragment;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.vinit.daana.EventDetailsActivity;
import com.vinit.daana.OrgResultArrayAdapter;
import com.vinit.daana.R;
import com.vinit.daana.model.Event;
import com.vinit.daana.model.OrgResults;

public class OrgListFragment extends Fragment {

	private OrgResultArrayAdapter adapter;
	private GridView gvOrgResults;

	@Override
	public View onCreateView(LayoutInflater inf, ViewGroup parent,
			Bundle savedInstanceState) {
		View v = inf.inflate(R.layout.fragment_org_list, parent, false);
		gvOrgResults = (GridView) v.findViewById(R.id.gvOrgResults);
		gvOrgResults.setAdapter(adapter);

		/*gvOrgResults.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View view, int position,
					long l) {
				OrgResults _companyResult = (OrgResults) gvOrgResults.getItemAtPosition(position);
				
				Intent i = new Intent(getActivity(), CompanyProfileActivity.class);
				i.putExtra("org", _companyResult);
				startActivity(i);
			}
		});*/
		
		return v;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ArrayList<OrgResults> _results = new ArrayList<OrgResults>();
		adapter = new OrgResultArrayAdapter(getActivity(), _results);
		
		ArrayList<OrgResults> results = new ArrayList<OrgResults>();
		
		OrgResults twitter = new OrgResults("http://www.prconversations.com/wp-content/uploads/2011/08/twitter_icon4.jpg","10");
		results.add(twitter);

		OrgResults zynga = new OrgResults("http://www.unleashthefanboy.com/wp-content/uploads/2013/06/zynga-banner.jpeg", "09");
		results.add(zynga);

		OrgResults facebook = new OrgResults("http://cdn2.insidermonkey.com/blog/wp-content/uploads/2012/12/facebook-e1355337496430.jpg", "15");
		results.add(facebook); 
		
		OrgResults msft = new OrgResults("http://pixabay.com/static/uploads/photo/2013/02/12/09/07/microsoft-80660_640.png?i", "29");
		results.add(msft);
		
		OrgResults google = new OrgResults("https://lh3.ggpht.com/7O3H3V0fEBumwJlqDLD03t1fmwl8fH9YoBsPwB2UQ_aiBilM7OAOe2gkFB3wrojJqbM=w300-rw", "22");
		results.add(google);
		
		OrgResults amazon = new OrgResults("http://sarahsfav.es/wp-content/uploads/2013/07/amzn_fb-tw_Icon-global.png", "14");
		results.add(amazon);
		
		OrgResults apple = new OrgResults("http://static.giantbomb.com/uploads/scale_small/0/316/520157-apple_logo_dec07.jpg", "21");
		results.add(apple);
		
		adapter.addAll(results);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	public OrgResultArrayAdapter getAdapter() {
		return adapter;
	}
}
