package com.k.louvrevermin;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class Bin extends Drag{
	  protected void onCreate(Bundle savedInstanceState) {
		  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		  setTheme(android.R.style.Theme_NoTitleBar);
		  super.onCreate(savedInstanceState);
	      setContentView(R.layout.bin);
	        
		  m_viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
		  m_viewFlipper.setOnTouchListener(this);

		  LinearLayout t1 = (LinearLayout) View.inflate(this, R.layout.bin, null);
		  LinearLayout t2 = (LinearLayout) View.inflate(this, R.layout.bintwo, null);

			m_viewFlipper.addView(t1);
			m_viewFlipper.addView(t2);
	}
}
