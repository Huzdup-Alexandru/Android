package com.example.alexandru.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
/*
4.I changed in gradle: Module:app - > MinSdkVersion from 25 to 23 (Meaning version 6 of Android)
5-6.In AndroidManifest i put <supports-screens /> if you want to run only on phones you switch large and xlarge screens to false and normal and small to true if you want to use on tablets you let as they are
7.To change an image File -> New -> Image Asset  and search your new image and after change in manifest android:icon. To change the name of the applicaton go to the Application name, right-click and Refactor-Rename
 and in res/values/strings change the value of app_name.
8.In activity_main write an <EditText with gravity top and inputtype = textMultiLine and in androidtext we call from res/values/style our new string .



 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

}
