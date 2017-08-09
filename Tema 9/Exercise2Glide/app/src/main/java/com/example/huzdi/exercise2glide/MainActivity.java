package com.example.huzdi.exercise2glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

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
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);

        Glide.with(this).load("http://www.encyclopedia.com/sites/default/files/5/2799291.jpg").into(imageView);
        Glide.with(this).load("https://ichef.bbci.co.uk/news/624/cpsprodpb/0E21/production/_92971630_tv009689256.jpg").into(imageView2);
        Glide.with(this).load("https://www.artmajeur.com/medias/home/a/d/administrator/home/street-art_8830543.jpg").into(imageView3);
        Glide.with(this).load("https://s-media-cache-ak0.pinimg.com/736x/59/6e/e5/596ee5472dd8df2bff4c796ad9dc4296--human-emotions-texture-painting.jpg").into(imageView4);
    }
}
