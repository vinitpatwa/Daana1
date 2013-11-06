package com.vinit.daana.fragment;



import java.util.ArrayList;

import android.os.Bundle;
import com.vinit.daana.model.Event;
import com.vinit.daana.model.User;

public class ParticipatingFragment extends TweetsListFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		ArrayList<Event> events = new ArrayList<Event>();

//		String name, String date, String categories,
//		String description, String address, String city, String zipcode,
//		String image
//		
		ArrayList<User> users=new ArrayList<User>();
		
		Event one = new Event("SF FoodBank Help Homeless","2/2/2014","Food","My First EVent happening in SF for helping 20 homeless people","574 3rd ST","San Francisco","94107","http://blog.goodapril.com/assets/Food-Banks.jpg", users,"10:00");
		events.add(one);

		Event two = new Event("Zynga Brest Cancer awareness","3/2/2014","Women","Zynga Event for Brest Cancer awareness need 10 people to help out","650 Townsend ST","San Francisco","94107","http://www.unleashthefanboy.com/wp-content/uploads/2013/06/zynga-banner.jpeg", users, "09:00");
		events.add(two);

		Event three = new Event("Asha Holi for education","2/2/2014","Education","Celebrate Holi with Stanford Asha. Festival of colors to raise money for child education "," 450 Serra Mall","Stanford","94305","https://lh4.googleusercontent.com/-ylFo1Ubqxbw/UVTb1Kvpr4I/AAAAAAAAAGo/qDyCuNzulZk/w797-h800-no/HOLI-2013-FLYER-FINAL.jpg", users, "15:00");
		events.add(three);

		Event four = new Event("Bay Area Legal Aid","3/2/2014","Education","BayLegal seeks volunteers who are fluent in a language other than English, particularly Spanish, Cantonese, Vietnamese, Russian,","1735 Telegraph Avenue","Oakland","94612","http://baylegal.org/wp-content/uploads/Banner2---962x339px.png", users, "13:00");
		events.add(four);
		
		getAdapter().addAll(events);

	}

}
