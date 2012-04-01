package com.fr4gus.android.oammblo.ui;

import android.app.Activity;
import android.os.Bundle;

import com.fr4gus.android.oammblo.R;

/**
 * Login Activity class. All activities on this application should inherit from OammbloActivity
 * 
 * @author Pablo Baltodano
 * Created Mar 31, 2012
 */
public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}
