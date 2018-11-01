package com.dd.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSwitchBackgroundClick(View v){
        View container = findViewById(R.id.container);
        Integer prevBgColorId = (Integer) container.getTag(R.id.container);
        int bgColorId = prevBgColorId != null && prevBgColorId == android.R.color.white ? R.color.background : android.R.color.white;
        container.setBackgroundResource(bgColorId);
        container.setTag(R.id.container, bgColorId);
    }
}
