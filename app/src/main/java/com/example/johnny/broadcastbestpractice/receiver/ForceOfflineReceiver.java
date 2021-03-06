package com.example.johnny.broadcastbestpractice.receiver;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;

import com.example.johnny.broadcastbestpractice.model.ActivityCollector;
import com.example.johnny.broadcastbestpractice.ui.activity.LoginActivity;

/**
 * Created by Johnny on 2016/8/14.
 */

public class ForceOfflineReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {
        Log.e("receiver","receiving");

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
        dialogBuilder.setTitle("warning");
        dialogBuilder.setMessage("You are forced to be offline. Please try to login again.");
        dialogBuilder.setCancelable(false);
        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityCollector.finishAll();
                Intent startLoginIntent = new Intent(context, LoginActivity.class);
                startLoginIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(startLoginIntent);
            }
        });

        try {
            AlertDialog alertDialog = dialogBuilder.create();
            alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_TOAST);
            alertDialog.show();
        }catch (Exception e){
            Log.e("receiver",e.getMessage());
        }

        Log.e("receiver","received");
    }
}
