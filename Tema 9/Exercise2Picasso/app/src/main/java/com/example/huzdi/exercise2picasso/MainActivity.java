package com.example.huzdi.exercise2picasso;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3= (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);


        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(imageView);
        Picasso.with(this).load("https://ichef.bbci.co.uk/news/624/cpsprodpb/0E21/production/_92971630_tv009689256.jpg").into(imageView2);
        Picasso.with(this).load("http://www.encyclopedia.com/sites/default/files/5/2799291.jpg").into(imageView3);
        Picasso.with(this).load("https://news.artnet.com/app/news-upload/2016/11/Deborah-Kass.png").into(imageView4);


    }
}
