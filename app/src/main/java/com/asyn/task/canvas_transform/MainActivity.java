package com.asyn.task.canvas_transform;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

import com.asyn.task.canvas_transform.transform.SaveRestoreView;
import com.asyn.task.canvas_transform.transform.TransformView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(new TransformView(this));
       // setContentView(new SaveRestoreView(this));
        setContentView(new SplipView(this));



    }





}

