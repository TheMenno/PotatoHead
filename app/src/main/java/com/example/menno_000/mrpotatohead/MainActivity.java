package com.example.menno_000.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String bodypart = checkbox.getText().toString();

        ImageView Arms = (ImageView) findViewById(R.id.arms);
        ImageView Ears = (ImageView) findViewById(R.id.ears);
        ImageView Eyebrows = (ImageView) findViewById(R.id.eyebrows);
        ImageView Eyes = (ImageView) findViewById(R.id.eyes);
        ImageView Glasses = (ImageView) findViewById(R.id.glasses);
        ImageView Hat = (ImageView) findViewById(R.id.hat);
        ImageView Mouth = (ImageView) findViewById(R.id.mouth);
        ImageView Mustache = (ImageView) findViewById(R.id.mustache);
        ImageView Nose = (ImageView) findViewById(R.id.nose);
        ImageView Shoes = (ImageView) findViewById(R.id.shoes);

        if (bodypart == "arms") {
            
        }
    }
}
