package com.k.louvrevermin;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class Intro extends Activity{
	public void onBackPressed(){
	}
	  protected void onCreate(Bundle savedInstanceState) {
		  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    	setTheme(android.R.style.Theme_NoTitleBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        Handler handler =new Handler(){
        	public void handleMessage(Message msg){
        	super.handleMessage(msg);
        	startActivity(new Intent(Intro.this, Splash.class));
        	finish();
        	}
        };
        handler.sendEmptyMessageDelayed(0, 2000);
        
       
}
	  
	 

	}




