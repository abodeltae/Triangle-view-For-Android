package com.abodeltae.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.abodeltae.triangleview.TriangleView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         TriangleView triangleView =(TriangleView)findViewById(R.id.triangleView);
        triangleView.setDirection(TriangleView.Direction.EAST);
        triangleView.setColor(Color.BLACK);

    }
}
