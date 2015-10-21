package com.k.louvrevermin;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
    	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    	setTheme(android.R.style.Theme_NoTitleBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Ba.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Ber.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Bin.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,E.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Jindgy.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Mamy.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Maus.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Moeny.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Mogy.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,No.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Pary.class);
       	 startActivity(intent);
        }
       	 
        });
        
        Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener()
        {public void onClick(View v)
        {
       	 Intent intent = new Intent(Main.this,Ssar.class);
       	 startActivity(intent);
        }
       	 
        });
}}
