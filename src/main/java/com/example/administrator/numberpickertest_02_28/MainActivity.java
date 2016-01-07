package com.example.administrator.numberpickertest_02_28;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    NumberPicker np1, np2;
    int minPrice = 25, maxPrice = 75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        np1 = (NumberPicker) findViewById(R.id.np1);
        np2 = (NumberPicker) findViewById(R.id.np2);
        np1.setMinValue(10);
        np1.setMaxValue(50);
        np2.setMinValue(60);
        np2.setMaxValue(100);
        np1.setValue(minPrice);
        np2.setValue(maxPrice);
        np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                minPrice = newVal;
                showSelectedPrice();
            }
        });
        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                maxPrice = newVal;
                showSelectedPrice();
            }
        });

    }

    public void showSelectedPrice() {
        Toast.makeText(this, "您选择的最低价格为：" + minPrice + "，最高价格为：" + maxPrice, Toast.LENGTH_SHORT).show();
    }
}
