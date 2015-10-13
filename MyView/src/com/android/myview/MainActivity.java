package com.android.myview;

import com.android.myview.v1.MyView;
import com.android.myview.v2.LogicView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//setContentView(new MyView(this));
		//setContentView(new LogicView(this));
	}
}
