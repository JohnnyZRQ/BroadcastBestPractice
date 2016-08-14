package com.example.johnny.broadcastbestpractice.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.johnny.broadcastbestpractice.R;
import com.example.johnny.broadcastbestpractice.model.BaseActivity;

/**
 * Created by Johnny on 2016/8/13.
 */

public class ForceOfflineActivity extends BaseActivity {
    Button btnForceOffline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_offline);
        btnForceOffline = (Button) findViewById(R.id.btn_force_offline);
        btnForceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.johnny.broadcastbestpractice.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }
}