package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String msg = "Android : ";
    TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d(msg, "The onCreate() event");
        counter = (TextView)findViewById(R.id.tvCounter);



    }

    public void startService(View view) {
       /* ValueAnimator animator = new ValueAnimator();
        animator.setObjectValues(0, 1000);// here you set the range, from 0 to "count" value
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
                counter.setText(String.valueOf(animation.getAnimatedValue()));
            }
        });
        animator.setDuration(100000); // here you set the duration of the anim
        animator.start();*/

        startService(new Intent(getBaseContext(), MyService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
       /* ValueAnimator animator = new ValueAnimator();

        animator.removeAllListeners(); // Or animator.removeListener(your listener);
        animator.cancel();*/

        stopService(new Intent(getBaseContext(), MyService.class));
    }
}
