package com.k.louvrevermin;

import android.app.Activity;
import android.widget.Toast;

public class BackPressCloseHandler {
	private long backKeyPressedTime = 0;
	private Toast toast;

	private Activity activity;

	public BackPressCloseHandler(Activity context) {
		this.activity = context;
	}

	public void onBackPressed() {
		if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
			backKeyPressedTime = System.currentTimeMillis();
			showGuide();
			return;
		}
		if (System.currentTimeMillis() <= backKeyPressedTime + 2000) {
			activity.finish();
			toast.cancel();
		}
	}


	private void showGuide() {
		toast = Toast.makeText(activity, "\'Back\'Button press one more than exit",
				Toast.LENGTH_SHORT);
		toast.show();
	}

}
