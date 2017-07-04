package com.example.huzdi.exercise2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityThree extends AppCompatActivity {

    Button button10;
    Button button11;
    Button button12;

    TextView textView;
    public static final String MESSAGE = "Am venit de pe activitatea : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);

        textView = (TextView) findViewById(R.id.textView4);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ActivityTwo.MESSAGE);
        textView.setText("Am venit de pe activitatea : " + message);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityThree.this, ActivityOne.class);
                intent.putExtra(MESSAGE, ActivityThree.class.getSimpleName());
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityThree.this,ActivityTwo.class);
                intent.putExtra(MESSAGE,ActivityThree.class.getSimpleName());
                startActivity(intent);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityThree.this, ActivityThree.class);
                intent.putExtra(MESSAGE,ActivityThree.class.getSimpleName());
                startActivity(intent);

            }
        });

    }
}
