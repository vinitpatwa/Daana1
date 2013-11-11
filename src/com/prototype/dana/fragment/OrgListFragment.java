package com.prototype.dana.fragment;

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

import com.prototype.dana.EventDetailsActivity;
import com.prototype.dana.OrgResultArrayAdapter;
import com.prototype.dana.R;
import com.prototype.dana.model.Event;
import com.prototype.dana.model.OrgResults;

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
		
		OrgResults twitter = new OrgResults("http://netdna.webdesignerdepot.com/uploads/2013/02/featured35@wdd2x.jpg","10");
		results.add(twitter);

		OrgResults zynga = new OrgResults("http://www.unleashthefanboy.com/wp-content/uploads/2013/06/zynga-banner.jpeg", "09");
		results.add(zynga);

		OrgResults facebook = new OrgResults("http://cdni.wired.co.uk/1920x1280/d_f/facebook_2.jpg", "15");
		results.add(facebook); 
		
		OrgResults msft = new OrgResults("http://colibriumpartners.com/wp-content/uploads/2013/05/img_clients_microsoft-logo.jpg", "29");
		results.add(msft);
		
		OrgResults google = new OrgResults("http://blog.heartland.org/wp-content/uploads/2013/07/Google.jpg", "22");
		results.add(google);
		
		OrgResults amazon = new OrgResults("http://shopaholicsavers.com/wp-content/uploads/2013/04/amazonlogo.jpg", "14");
		results.add(amazon);
		
		OrgResults apple = new OrgResults("http://fansided.com/wp-content/blogs.dir/229/files/2013/06/apple.jpg", "21");
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
