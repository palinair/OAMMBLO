package com.fr4gus.android.oammblo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.fr4gus.android.oammblo.R;

/**
 * Shows App logo for few seconds.
 * 
 * @author Franklin Garcia
 * Created Mar 25, 2012
 */
public class SplashActivity extends OammbloActivity {

	protected int _time = 1000;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        new CountDownTimer(_time, 1000) {
            public void onTick(long millisUntilFinished) {
            }
        	
            public void onFinish() {
                finish();
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, LoginActivity.class);
                startActivity(intent);             
            }
         }.start();
    }

}
