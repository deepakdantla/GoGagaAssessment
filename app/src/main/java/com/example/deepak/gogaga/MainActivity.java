package com.example.deepak.gogaga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.appyvet.materialrangebar.RangeBar;

public class MainActivity extends AppCompatActivity {

    RangeBar mRangeBar;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final TextView ageLowerBound = findViewById(R.id.ageLowerBound);
        final TextView ageUpperBound = findViewById(R.id.ageUpperBound);
        mRangeBar = findViewById(R.id.RangeBar);
        mRangeBar.setSeekPinByIndex(18);

        mRangeBar.setTickColor(getResources().getColor(R.color.barColor));
        mRangeBar.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                ageUpperBound.setText(rightPinValue);
                ageLowerBound.setText(leftPinValue);
            }
        });
    }
}
