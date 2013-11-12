package com.isabelpalomar.obregon.activities;

import com.isabelpalomar.obregon.R;
import com.isabelpalomar.obregon.data.DummyData;
import com.isabelpalomar.obregon.models.Store;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StoresActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stores);
		
		//get the listview object
		ListView lv = (ListView) findViewById(R.id.listview_stores);
		
		//get the dummy data
		Store[] allStores = DummyData.stores;
		String[] stores = new String[4];
		int count = 0;

		//get just the name of the store
        for (Store store : allStores) {
             stores[count] = store.getName();
             count++;
        }
        
        // Creating array adapter to set data in listview 
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stores);

        // Setting the array adapter to the listview 
        lv.setAdapter(adapter);	
		
        //set the click listener :P
		lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				//go to detail activity				
				Intent newActivity = new Intent(getApplicationContext(), StoreDetailActivity.class);
				newActivity.putExtra("store_id", position);
                startActivity(newActivity);
			}

	    });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stores, menu);
		return true;
	}

}
