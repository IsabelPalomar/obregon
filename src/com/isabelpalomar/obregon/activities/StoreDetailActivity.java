package com.isabelpalomar.obregon.activities;

import com.isabelpalomar.obregon.R;
import com.isabelpalomar.obregon.R.layout;
import com.isabelpalomar.obregon.R.menu;
import com.isabelpalomar.obregon.data.DummyData;
import com.isabelpalomar.obregon.models.Store;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;
import android.text.util.Linkify;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class StoreDetailActivity extends Activity {
	
	Integer phone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store_detail);
		
		
		//get and set the title
	    Bundle b = getIntent().getExtras();
		int store_id    = b.getInt("store_id");
		
		//get the element
		Store store = DummyData.stores[store_id];
		
		/*ImageView iv = (ImageView) findViewById(R.id.imageView_store_image);
		iv.setBackgroundResource(store.getImage());*/
		
		TextView address  = (TextView) findViewById(R.id.textView_store_address);
		address.setText(store.getAddress());
		
		TextView schedule  = (TextView) findViewById(R.id.textView_store_schedule);
		schedule.setText(store.getSchedule());
		
		TextView url  = (TextView) findViewById(R.id.textView_website_txt);
		url.setText(store.getUrl());
		Linkify.addLinks(url, Linkify.ALL);
		
		TextView email  = (TextView) findViewById(R.id.textView_email_txt);
		email.setText(store.getEmail());
		Linkify.addLinks(email, Linkify.ALL);
		
		//get the phone
		this.phone = store.getPhone();
		
		//set the title
		setTitle(store.getName());
		
		// Show the Up button in the action bar.
		setupActionBar();
	}
	
	
	//click methods ********************************************************************************+
	 
	 public void showGallery(View v)
	 {
		 //go to Store Gallery Activity
		 Intent in = new Intent(getApplicationContext(), StoreGallery.class);
		 in.putExtras(getIntent().getExtras());
         startActivity(in);
		 
	 } 
	 
	 public void makeCall(View v)
	 {
		   
		    //call on keyboard
		    Intent intent = new Intent(Intent.ACTION_DIAL);
			intent.setData(Uri.parse("tel:" + this.phone));
			startActivity(intent);	
		 
	 } 
	
	

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.store_detail, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
