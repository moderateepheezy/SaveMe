package com.example.saveme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.provider.SyncStateContract.Constants;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class SubActivity extends Activity {
	ListView lss;
	TextView test;
	Button btn;
	Context context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_sub);
			context = this;
			test = (TextView)findViewById(R.id.textView1);
			btn = (Button)findViewById(R.id.btn);
			Intent i = getIntent();
			Bundle b = i.getExtras();
			final String a = (String) b.get("add");
			test.setText(a);
			
			SharedPreferences get = getSharedPreferences("key", 0);
			test.setText(get.getString("textvalue", "add"));
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sub, menu);
		return true;
	}

}
