package com.example.huzdi.exercise2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

    public class MainActivity extends AppCompatActivity {

        private static final String IMAGE_URL = "http://cdn.images.express.co.uk/img/dynamic/galleries/x701/127184.jpg";
        ImageView imageView;
        Bitmap bitmap;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            imageView = (ImageView) findViewById(R.id.imageView);

            GetBitmapfromUrl();


        }
        public Bitmap GetBitmapfromUrl() {

            new AsyncTask<Void, Void, Void>() {
                @Override
                protected Void doInBackground(Void... params) {
                    try {
                        InputStream in = new URL(IMAGE_URL).openStream();
                        bitmap = BitmapFactory.decodeStream(in);
                    } catch (Exception e) {
                        // log error
                    }
                    return null;
                }

                @Override
                protected void onPostExecute(Void result) {
                    if (bitmap != null)
                        imageView.setImageBitmap(bitmap);
                }

            }.execute();
            return bitmap;
        }
    }