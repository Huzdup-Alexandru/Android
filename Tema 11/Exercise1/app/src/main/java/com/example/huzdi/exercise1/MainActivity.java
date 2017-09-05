
package com.example.huzdi.exercise1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int id) {
        FragmentManager manager = getFragmentManager();
        SecondFragment fragment = (SecondFragment)manager.findFragmentById(R.id.framgentTwo);
        fragment.change(id);
    }
}
