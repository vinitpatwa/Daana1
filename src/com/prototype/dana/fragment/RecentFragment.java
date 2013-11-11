package com.prototype.dana.fragment;

import java.util.ArrayList;

import android.os.Bundle;
import com.prototype.dana.model.Event;
import com.prototype.dana.model.User;

public class RecentFragment extends TweetsListFragment {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        ArrayList<Event> events = new ArrayList<Event>();
		ArrayList<User> users=new ArrayList<User>();
        
		Event two = new Event("Zynga Brest Cancer awareness","3/2/2014","Women","Zynga Event for Brest Cancer awareness need 10 people to help out","650 Townsend ST","San Francisco","94107","http://www.unleashthefanboy.com/wp-content/uploads/2013/06/zynga-banner.jpeg", users, "09:00");
		events.add(two);

		Event three = new Event("Asha Holi for education","2/2/2014","Education","Celebrate Holi with Stanford Asha. Festival of colors to raise money for child education "," 450 Serra Mall","Stanford","94305","https://lh4.googleusercontent.com/-ylFo1Ubqxbw/UVTb1Kvpr4I/AAAAAAAAAGo/qDyCuNzulZk/w797-h800-no/HOLI-2013-FLYER-FINAL.jpg", users, "15:00");
		events.add(three);

        
        getAdapter().addAll(events);

            }

}
