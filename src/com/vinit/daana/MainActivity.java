package com.vinit.daana;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btnLogin;
	private Button btnRegister;
	private ImageButton btnFBSignUp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ActionBar actionBar = getActionBar();
        actionBar.setTitle("Welcome to Dana!");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#880000")));
        
		onSignUp();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onSignUp(){
		btnLogin = (Button)findViewById(R.id.btnLogin);
		btnRegister = (Button)findViewById(R.id.btnRegister);
		btnFBSignUp = (ImageButton)findViewById(R.id.btnFBSignUp);
		
		btnFBSignUp.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				 //Toast.makeText(MainActivity.this,
					//		"ImageButton is clicked!", Toast.LENGTH_SHORT).show();
				Intent i = new Intent(getBaseContext(), EventsActivity.class);
		   	    startActivity(i);
			}
		});
		
		btnLogin.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), EventsActivity.class);
		   	    startActivity(i);
			}
		});
		
		btnRegister.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), ProfileActivity.class);
		   	    startActivity(i);
			}
		});
	}
}
