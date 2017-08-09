package com.example.huzdi.exercise4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    Button button_download;
    InputStreamVolleyRequest request;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_download = (Button) findViewById(R.id.button);
        button_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mUrl = "http://yoururl.com";

                request = new InputStreamVolleyRequest(Request.Method.GET,mUrl,MainActivity.this,MainActivity.this,null);
                RequestQueue mRequestQueue = Volley.newRequestQueue(getApplicationContext(),new HurlStack());
                mRequestQueue.add(request);
            }
        });
    }
}
