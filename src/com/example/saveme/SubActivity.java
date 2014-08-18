package com.example.saveme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TextView;

public class SubActivity extends Activity {
	ListView lss;
	TextView test;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);
		test = (TextView)findViewById(R.id.textView1);
		Intent i = getIntent();
		Bundle b = i.getExtras();
		String a = (String) b.get("add");
		test.setText(a);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sub, menu);
		return true;
	}

}
