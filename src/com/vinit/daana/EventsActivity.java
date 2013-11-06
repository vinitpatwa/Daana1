package com.vinit.daana;

import com.vinit.daana.fragment.ParticipatingFragment;
import com.vinit.daana.fragment.RecentFragment;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class EventsActivity extends FragmentActivity implements ActionBar.TabListener {

	 ActionBar.Tab tabNearMe, tabRecent, tabParticipating;
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        setUpActionBar();
    }

    public void setUpActionBar(){
    	ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(true);

        actionBar.setTitle("Dana Events");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#880000")));
        
        tabRecent= actionBar.newTab().setText("Recent").setTag("recent").setTabListener(this);
        tabParticipating= actionBar.newTab().setText("Participating").setTag("participating").setTabListener(this);

        actionBar.addTab(tabRecent);
        actionBar.addTab(tabParticipating);
        actionBar.selectTab(tabRecent);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_event, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	switch (item.getItemId()){
    	case R.id.create_event:
    		Toast.makeText(this, "In CreateEvent", Toast.LENGTH_SHORT).show();
        	startActivity(new Intent(this, CreateEventActivity.class));
    		return true;
    	
    	default:
    		Toast.makeText(this, "Not in CreateEvent", Toast.LENGTH_SHORT).show();
    		return true;
    	}
    }


	@Override
	public void onTabReselected(Tab tab, android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabSelected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fts = manager.beginTransaction();

        if(tab.getTag() == "recent"){
            //Set to fragment to Timeline
            fts.replace(R.id.fragment_container,new RecentFragment());
        }else{
            //Set to fragment to Mentions Fragment
            fts.replace(R.id.fragment_container,new ParticipatingFragment());
        }
        fts.commit();
		
	}


	@Override
	public void onTabUnselected(Tab tab, android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
    
    
}
