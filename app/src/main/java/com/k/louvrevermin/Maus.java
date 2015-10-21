package com.k.louvrevermin;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class Maus extends Drag{
	  protected void onCreate(Bundle savedInstanceState) {
		  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		  setTheme(android.R.style.Theme_NoTitleBar);
	        super.onCreate(savedInstanceState);
	    	setContentView(R.layout.maus);

			m_viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
			m_viewFlipper.setOnTouchListener(this);

			LinearLayout t1 = (LinearLayout) View.inflate(this, R.layout.maus, null);
			LinearLayout t2 = (LinearLayout) View.inflate(this, R.layout.maustwo, null);

			m_viewFlipper.addView(t1);
			m_viewFlipper.addView(t2);

	}

}
