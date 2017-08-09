package com.example.huzdi.exercise31;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button:
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                doGetRequest();
                            }
                        }).start();

                        break;
                }
            }
        });
    }


    private void doGetRequest (){
        Log.d("OKHTTP3","Get function called.");
        String url = "https://jsonplaceholder.typicode.com/posts";
        OkHttpClient client = new OkHttpClient();
        Log.d("OKHTTP3","Client created.");
        Request newRequest = new Request.Builder()
                .url(url)
                .build();
        Log.d("OKHTTP3","Request Build successful");
        try{
            Response response = client.newCall(newRequest).execute();
            Log.d("OKHTTP3","Got the response");
            Log.d("OKHTTP3",response.body().string());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
