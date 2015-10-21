package com.k.louvrevermin;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MusicSound extends Activity {
	
	MediaPlayer mp;
    protected void onCreate(Bundle savedInstanceState) {
    	  setVolumeControlStream(AudioManager.STREAM_MUSIC);
    	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    	setTheme(android.R.style.Theme_NoTitleBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicsound);
        
        
   final Button play =(Button)findViewById(R.id.play);
   mp = MediaPlayer.create(this,R.raw.sound);
   mp.setLooping(true);
   
   
   play.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		if(!mp.isPlaying()){
			mp.start();
			play.setBackgroundResource(R.drawable.stop);
			Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
		} else {
			mp.pause();
			play.setBackgroundResource(R.drawable.play);
			Toast.makeText(getApplicationContext(), "Pause", Toast.LENGTH_SHORT).show();
		}
	
		
	}
});
        
}
    
    public void onDestroy(){
    	android.os.Process.killProcess(android.os.Process.myPid());
    }
    
    public void onStop(){
    	android.os.Process.killProcess(android.os.Process.myPid());
    }
    
    public void onBackPressed(){
        android.os.Process.killProcess(android.os.Process.myPid());
}
    
    
}