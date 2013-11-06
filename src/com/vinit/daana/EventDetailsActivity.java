package com.vinit.daana;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.vinit.daana.model.Event;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class EventDetailsActivity extends Activity {

	ImageView iv_event_detail_image;
	TextView tv_event_detail_description;
	TextView tv_event_detail_date;
	TextView tv_event_detail_time;
	TextView tv_event_detail_address;
	TextView tv_event_detail_city;

	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_details);
		
	     Bundle bundle = getIntent().getExtras();
	     Event event = (Event) bundle.getSerializable("event");
	     
	     Log.d("DEBUG4","In EventDetails"+event.getName());
	     
	     iv_event_detail_image = (ImageView) findViewById(R.id.iv_event_detail_image);
    	 ImageLoader.getInstance().displayImage(event.getImage(), iv_event_detail_image);

    	 tv_event_detail_description = (TextView) findViewById(R.id.tv_event_detail_description);
    	 tv_event_detail_description.setText(event.getDescription());
    	 
    	 tv_event_detail_date = (TextView) findViewById(R.id.tv_event_detail_date);
    	 tv_event_detail_date.setText(event.getDate());
    	  
    	 tv_event_detail_time = (TextView) findViewById(R.id.tv_event_detail_time);
    	 tv_event_detail_time.setText(event.getTime());
    	 
    	 tv_event_detail_address = (TextView) findViewById(R.id.tv_event_detail_address);
    	 tv_event_detail_address.setText(event.getAddress());
    	 
    	 tv_event_detail_city = (TextView) findViewById(R.id.tv_event_detail_city);
    	 tv_event_detail_city.setText(event.getCity()+" , "+event.getZipcode());
	     
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_details, menu);
		return true;
	}
	
	
	public void onAttendEvent(View v){
		
		//Implenent sending info about user attending the event back to activity
		Intent i = new Intent();
	
		Toast.makeText(this,"Created new event", Toast.LENGTH_SHORT).show();
		finish();
		
	}

}
