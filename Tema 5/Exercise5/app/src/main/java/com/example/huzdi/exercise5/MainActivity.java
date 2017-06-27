package com.example.huzdi.exercise5;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.Toast;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.showOverflowMenu();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id = item.getItemId();
        if (res_id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "You select setting option", Toast.LENGTH_LONG).show();
        } else if(res_id == R.id.action_bar_rrr){
            Toast.makeText(getApplicationContext(), "You are contacting us!", Toast.LENGTH_LONG).show();
        } else if(res_id == R.id.action_bar_bbb){
            Toast.makeText(getApplicationContext(), "Choose how to share your data!", Toast.LENGTH_LONG).show();
        } else if (res_id == R.id.action_bar_eee) {
            Toast.makeText(getApplicationContext(), "You are reporting us!", Toast.LENGTH_LONG).show();
        }
        return true;
    }


}
