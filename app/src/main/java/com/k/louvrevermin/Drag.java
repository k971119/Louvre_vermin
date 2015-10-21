package com.k.louvrevermin;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class Drag extends Activity implements OnTouchListener {

	public static ViewFlipper m_viewFlipper;
	public int m_nPreTouchPosX = 0;

	static boolean touch;

	private void MoveNextView() {
		m_viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this,
				R.anim.appear_from_right));
		m_viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this,
				R.anim.disappear_to_left));
		m_viewFlipper.showNext();
	}

	private void MovewPreviousView() {
		m_viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this,
				R.anim.appear_from_left));
		m_viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this,
				R.anim.disappear_to_right));
		m_viewFlipper.showPrevious();
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			touch = true;
			m_nPreTouchPosX = (int) event.getX();
		}
		if (event.getAction() == MotionEvent.ACTION_MOVE) {
			int nTouchPosX = (int) event.getX();
			if(touch) {
				if (nTouchPosX < m_nPreTouchPosX - 15) {
					MoveNextView();
					touch = false;
				} else if (nTouchPosX > m_nPreTouchPosX + 15) {
					MovewPreviousView();
					touch = false;
				}
			}

			m_nPreTouchPosX = nTouchPosX;
		}

		return true;
	}

}
