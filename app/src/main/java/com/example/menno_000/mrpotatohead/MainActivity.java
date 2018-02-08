package com.example.menno_000.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Arms;
    ImageView Ears;
    ImageView Eyebrows;
    ImageView Eyes;
    ImageView Glasses;
    ImageView Hat;
    ImageView Mouth;
    ImageView Mustache;
    ImageView Nose;
    ImageView Shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Arms = (ImageView) findViewById(R.id.arms);
        Ears = (ImageView) findViewById(R.id.ears);
        Eyebrows = (ImageView) findViewById(R.id.eyebrows);
        Eyes = (ImageView) findViewById(R.id.eyes);
        Glasses = (ImageView) findViewById(R.id.glasses);
        Hat = (ImageView) findViewById(R.id.hat);
        Mouth = (ImageView) findViewById(R.id.mouth);
        Mustache = (ImageView) findViewById(R.id.mustache);
        Nose = (ImageView) findViewById(R.id.nose);
        Shoes = (ImageView) findViewById(R.id.shoes);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Integer visibilityArms = Arms.getVisibility();
        Integer visibilityEars = Ears.getVisibility();
        Integer visibilityEyebrows = Eyebrows.getVisibility();
        Integer visibilityEyes = Eyes.getVisibility();
        Integer visibilityGlasses = Glasses.getVisibility();
        Integer visibilityHat = Hat.getVisibility();
        Integer visibilityMouth = Mouth.getVisibility();
        Integer visibilityMustache = Mustache.getVisibility();
        Integer visibilityNose = Nose.getVisibility();
        Integer visibilityShoes = Shoes.getVisibility();

        outState.putInt("VisibilityArms", visibilityArms);
        outState.putInt("VisibilityEars", visibilityEars);
        outState.putInt("VisibilityEyebrows", visibilityEyebrows);
        outState.putInt("VisibilityEyes", visibilityEyes);
        outState.putInt("VisibilityGlasses", visibilityGlasses);
        outState.putInt("VisibilityHat", visibilityHat);
        outState.putInt("VisibilityMouth", visibilityMouth);
        outState.putInt("VisibilityMustache", visibilityMustache);
        outState.putInt("VisibilityNose", visibilityNose);
        outState.putInt("VisibilityShoes", visibilityShoes);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        Integer visibilitySaveArms = inState.getInt("VisibilityArms");
        Arms.setVisibility(visibilitySaveArms);

        Integer visibilitySaveEars = inState.getInt("VisibilityEars");
        Ears.setVisibility(visibilitySaveEars);

        Integer visibilitySaveEyebrows = inState.getInt("VisibilityEyebrows");
        Eyebrows.setVisibility(visibilitySaveEyebrows);

        Integer visibilitySaveEyes = inState.getInt("VisibilityEyes");
        Eyes.setVisibility(visibilitySaveEyes);

        Integer visibilitySaveGlasses = inState.getInt("VisibilityGlasses");
        Glasses.setVisibility(visibilitySaveGlasses);

        Integer visibilitySaveHat = inState.getInt("VisibilityHat");
        Hat.setVisibility(visibilitySaveHat);

        Integer visibilitySaveMouth = inState.getInt("VisibilityMouth");
        Mouth.setVisibility(visibilitySaveMouth);

        Integer visibilitySaveMustache = inState.getInt("VisibilityMustache");
        Mustache.setVisibility(visibilitySaveMustache);

        Integer visibilitySaveNose = inState.getInt("VisibilityNose");
        Nose.setVisibility(visibilitySaveNose);

        Integer visibilitySaveShoes = inState.getInt("VisibilityShoes");
        Shoes.setVisibility(visibilitySaveShoes);

    }


    public void clickedArms(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.armsBox:
                if (check) {
                    Arms.setVisibility(View.VISIBLE);
                } else {
                    Arms.setVisibility(View.INVISIBLE);
                }
        }
    }

    public void clickedEars(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.earsBox:
                if (check) {
                    Ears.setVisibility(View.VISIBLE);
                } else {
                    Ears.setVisibility(View.INVISIBLE);
                }
        }
    }

    public void clickedEyebrows(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.eyebrowsBox:
                if (check) {
                    Eyebrows.setVisibility(View.VISIBLE);
                } else {
                    Eyebrows.setVisibility(View.INVISIBLE);
                }
        }
    }

    public void clickedEyes(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.eyesBox:
                if (check) {
                    Eyes.setVisibility(View.VISIBLE);
                } else {
                    Eyes.setVisibility(View.INVISIBLE);
                }
        }
    }

    public void clickedGlasses(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.glassesBox:
                if (check) {
                    Glasses.setVisibility(View.VISIBLE);
                } else {
                    Glasses.setVisibility(View.INVISIBLE);
                }
        }
    }

    public void clickedHat(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.hatBox:
                if (check) {
                    Hat.setVisibility(View.VISIBLE);
                } else {
                    Hat.setVisibility(View.INVISIBLE);
                }
        }
    }

    public void clickedMouth(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.mouthBox:
                if (check) {
                    Mouth.setVisibility(View.VISIBLE);
                } else {
                    Mouth.setVisibility(View.INVISIBLE);
                }
        }
    }

    public void clickedMustache(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.mustacheBox:
                if (check) {
                    Mustache.setVisibility(View.VISIBLE);
                } else {
                    Mustache.setVisibility(View.INVISIBLE);
                }
        }
    }

    public void clickedNose(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.noseBox:
                if (check) {
                    Nose.setVisibility(View.VISIBLE);
                } else {
                    Nose.setVisibility(View.INVISIBLE);
                }
        }
    }

    public void clickedShoes(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.shoesBox:
                if (check) {
                    Shoes.setVisibility(View.VISIBLE);
                } else {
                    Shoes.setVisibility(View.INVISIBLE);
                }
        }
    }
}
