package com.example.swipe_close_activitywith_slidr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Slide;
import android.view.View;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class Second extends AppCompatActivity {

    private SlidrInterface slidr; //member variable  for lock an unlock features

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
      slidr =  Slidr.attach(this);
    }

    public void lockslide(View view) {
        slidr.lock();
    }

    public void unlockslide(View view) {

        slidr.unlock();
    }

}
