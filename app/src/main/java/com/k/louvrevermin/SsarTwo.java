package com.k.louvrevermin;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class SsarTwo extends Activity{
	  protected void onCreate(Bundle savedInstanceState) {
		  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		  setTheme(android.R.style.Theme_NoTitleBar);
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.ssartwo);

	}

}
