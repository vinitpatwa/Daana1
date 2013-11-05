package com.vinit.daana.fragment;

import java.util.ArrayList;

import android.os.Bundle;
import com.vinit.daana.model.Event;

public class RecentFragment extends TweetsListFragment {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        ArrayList<Event> events = new ArrayList<Event>();
        
		Event one = new Event("Vinit","2/2/2014","Food","My First EVent","574 3rd ST","San Francisco","94107","http://blog.goodapril.com/assets/Food-Banks.jpg");
		events.add(one);

		Event two = new Event("Sumit","3/2/2014","Food","Zynga EVent","650 Townsend ST","San Francisco","94107","http://www.unleashthefanboy.com/wp-content/uploads/2013/06/zynga-banner.jpeg");
		events.add(one);

		Event three = new Event("Amit","4/2/2014","Food","Co lab EVent","699 8th ST","San Francisco","94107","http://i0.wp.com/allthingsd.com/files/2013/10/logo_high-feature.png");
		events.add(one);

		events.add(three);
        
        
        getAdapter().addAll(events);

            }

}
