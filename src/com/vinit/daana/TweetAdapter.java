package com.vinit.daana;

import java.util.ArrayList;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.vinit.daana.model.Event;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TweetAdapter extends ArrayAdapter<Event> {
        
        ImageView iv_tweet_item_user_image;
        TextView tv_tweet_item_firstname;
        TextView tv_tweet_item_tweet;
        Event event;

        public TweetAdapter(Context context, ArrayList<Event> tweets) {
                super(context, 0, tweets);
        }
        
        public View getView(int position, View convertView, ViewGroup parent){
                View view = convertView;
                
                if(view == null){
                        LayoutInflater inflator = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        view = inflator.inflate(R.layout.tweet_item,null);
                        
                }
                
                  event= getItem(position);

        
                  iv_tweet_item_user_image = (ImageView) view.findViewById(R.id.iv_tweet_item_user_image);
                  ImageLoader.getInstance().displayImage(event.getImage(), iv_tweet_item_user_image);
                  iv_tweet_item_user_image.setTag( event.getName());
         iv_tweet_item_user_image.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getContext(), EventDetailsActivity.class);
                i.putExtra("screenName", v.getTag().toString() );
                getContext().startActivity(i);
            }
        });

//                  tv_tweet_item_firstname = (TextView) view.findViewById(R.id.tv_tweet_item_firstname); 
//                 String formattedName = "<b>"+event.getUser().getName() +"</b>" + "<small><font color='#777777'>@"+event.getUser().getScreenName()+"</font></small>";
//                 tv_tweet_item_firstname.setText(Html.fromHtml(formattedName));
//                  
//                 tv_tweet_item_tweet = (TextView) view.findViewById(R.id.tv_tweet_item_tweet);
//                 tv_tweet_item_tweet.setText(Html.fromHtml(event.getBody()));
//                
                return view;
        }

}
