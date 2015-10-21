package com.k.louvrevermin;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class Ba extends Drag {
	protected void onCreate(Bundle savedInstanceState) {
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setTheme(android.R.style.Theme_NoTitleBar);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ba);

		m_viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
		m_viewFlipper.setOnTouchListener(this);

		LinearLayout t1 = (LinearLayout) View.inflate(this, R.layout.ba, null);
		LinearLayout t2 = (LinearLayout) View.inflate(this, R.layout.batwo,
				null);

		m_viewFlipper.addView(t1);
		m_viewFlipper.addView(t2);

	}

}
