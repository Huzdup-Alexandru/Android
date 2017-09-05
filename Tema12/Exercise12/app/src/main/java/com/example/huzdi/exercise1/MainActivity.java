package com.example.huzdi.exercise1;


import android.app.NotificationManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    NotificationManager notificationManager;
    Builder builder;
    int id = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationManager =(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                builder = new NotificationCompat.Builder(MainActivity.this);
                builder.setContentTitle("Download")
                        .setContentText("Download in progress")
                        .setSmallIcon(R.drawable.download_img);

                new Downloader().execute();
            }
        });
    }
    private class Downloader extends AsyncTask<Void, Integer, Integer> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            // Displays the progress bar for the first time.
            builder.setProgress(100, 0, false);
            notificationManager.notify(id, builder.build());
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            // Update progress
            builder.setProgress(100, values[0], false);
            notificationManager.notify(id, builder.build());
            super.onProgressUpdate(values);
        }

        @Override
        protected Integer doInBackground(Void... params) {
            int i;
            for (i = 0; i <= 100; i += 5) {
                // Sets the progress indicator completion percentage
                publishProgress(Math.min(i, 100));
                try {
                    // Sleep for 5 seconds
                    Thread.sleep(2 * 1000);
                } catch (InterruptedException e) {
                    Log.d("TAG", "sleep failure");
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Integer result) {
            super.onPostExecute(result);
            builder.setContentText("Download complete");
            // Removes the progress bar
            builder.setProgress(0, 0, false);
            notificationManager.notify(id, builder.build());
        }
    }
}
