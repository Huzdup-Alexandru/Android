package com.example.huzdi.exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button button;
    int prevX,prevY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                {
                    final FrameLayout.LayoutParams par=(FrameLayout.LayoutParams)view.getLayoutParams();
                    switch(motionEvent.getAction())
                    {
                        case MotionEvent.ACTION_MOVE:
                        {
                            par.topMargin+=(int)motionEvent.getRawY()-prevY;
                            prevY=(int)motionEvent.getRawY();
                            par.leftMargin+=(int)motionEvent.getRawX()-prevX;
                            prevX=(int)motionEvent.getRawX();
                            view.setLayoutParams(par);
                            return true;
                        }
                        case MotionEvent.ACTION_UP:
                        {
                            par.topMargin+=(int)motionEvent.getRawY()-prevY;
                            par.leftMargin+=(int)motionEvent.getRawX()-prevX;
                            view.setLayoutParams(par);
                            return true;
                        }
                        case MotionEvent.ACTION_DOWN:
                        {
                            prevX=(int)motionEvent.getRawX();
                            prevY=(int)motionEvent.getRawY();
                            par.bottomMargin=-2*view.getHeight();
                            par.rightMargin=-2*view.getWidth();
                            view.setLayoutParams(par);
                            return true;
                        }
                    }
                    return false;
                }
            }
        });
    }
}
