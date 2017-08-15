package com.example.huzdi.exercise3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by huzdi on 12.08.2017.
 */

public class BatteryActivity extends AppCompatActivity{

    ProgressBar progressBar;
    TextView textView;


    private BroadcastReceiver bcr = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level = intent.getIntExtra("level",0);

            progressBar = (ProgressBar) findViewById(R.id.progressBar);
            progressBar.setProgress(level);

            textView = (TextView) findViewById(R.id.tv);
            textView.setText("Battery Level: " + Integer.toString(level) + "%");

            if(level < 55){
                Toast.makeText(BatteryActivity.this, "You have low battery", Toast.LENGTH_LONG).show();
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(BatteryActivity.this);
                alertBuilder.setTitle("Low battery!");
                alertBuilder.setMessage("You have low battery, please connect with a power source!");
                alertBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog ad = alertBuilder.create();
                ad.show();
            }



        }
    };



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);

        registerReceiver(bcr,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }
}
