package com.k.louvrevermin;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash extends Activity{
	
	private BackPressCloseHandler backPressCloseHandler;
	
    protected void onCreate(Bundle savedInstanceState) {
    	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    	setTheme(android.R.style.Theme_NoTitleBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Splash.this,Main.class);
       	 startActivity(intent);
        }
       	 
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Splash.this,MusicSound.class);
       	 startActivity(intent);
        }
       	 
        });
        
        
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Splash.this,Jajac.class);
       	 startActivity(intent);
        }
       	 
        });
        
        
        backPressCloseHandler = new BackPressCloseHandler(this);

}


@Override
public void onBackPressed() {
	backPressCloseHandler.onBackPressed();
}
}
