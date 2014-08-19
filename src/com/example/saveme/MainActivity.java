package com.example.saveme;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
	Button btn, btn1;
	EditText text;
	ListView lst;
	public String add[] = new String[10];
	String contactInfo = "";
	
	
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		text = (EditText) findViewById(R.id.editText1);
		btn = (Button) findViewById(R.id.button1);
		btn1 = (Button) findViewById(R.id.button2);
		//lst = (ListView) findViewById(R.id.listView1);

		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				contactInfo = contactInfo + text.getText().toString() + "\n";
				SharedPreferences sp = getSharedPreferences("key", 0);
				SharedPreferences.Editor sedt = sp.edit();
				sedt.putString("textvalue", contactInfo.toString());
				sedt.commit();
			}
		});

		btn1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				newActivity();
			}
		});
	}

	public void newActivity() {
		Intent intent = new Intent(this, SubActivity.class);
		intent.putExtra("add", contactInfo);
		this.startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
