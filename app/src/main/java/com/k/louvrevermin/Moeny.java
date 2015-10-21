package com.k.louvrevermin;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class Moeny extends Drag{
	  protected void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);
		  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		  setTheme(android.R.style.Theme_NoTitleBar);
		  setContentView(R.layout.moeny);

			m_viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
			m_viewFlipper.setOnTouchListener(this);

			LinearLayout t1 = (LinearLayout) View.inflate(this, R.layout.moeny, null);
			LinearLayout t2 = (LinearLayout) View.inflate(this, R.layout.moenytwo,
					null);

			m_viewFlipper.addView(t1);
			m_viewFlipper.addView(t2);
	  }

}
