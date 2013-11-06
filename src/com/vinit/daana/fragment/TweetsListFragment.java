package com.vinit.daana.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import com.vinit.daana.EventDetailsActivity;
import com.vinit.daana.R;
import com.vinit.daana.EventAdapter;
import com.vinit.daana.model.Event;

/**
 * Created by vpatwa on 10/28/13.
 */
public class TweetsListFragment extends Fragment {
	
	final int requestCode = 1;

	EventAdapter adapter;
	ListView lv_timeline;

	@Override
	public View onCreateView(LayoutInflater inf, ViewGroup parent,
			Bundle savedInstanceState) {
		// return inf.inflate(R.layout.fragment_tweets_list,parent, false);
		View v = inf.inflate(R.layout.fragment_tweets_list, parent, false);
		lv_timeline = (ListView) v.findViewById(R.id.lv_timeline);
		lv_timeline.setAdapter(adapter);
		
		lv_timeline.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position,
					long l) {
			
				Event event = (Event) lv_timeline.getItemAtPosition(position);
				
				Intent i = new Intent(getActivity(), EventDetailsActivity.class);
				i.putExtra("event", event);
				startActivityForResult(i, requestCode);
				}
		});

		return v;
	}

	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		ArrayList<Event> tweets = new ArrayList<Event>();
		adapter = new EventAdapter(getActivity(), tweets);

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}

	public EventAdapter getAdapter() {
		return adapter;
	}
}