package com.w.activitylife;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class Activitysecond extends AppCompatActivity {
    private TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String inf = getIntent().getStringExtra(MainActivity.BOOKMAME_OF_ENGLISH);
        textView = (TextView) findViewById(R.id.second_activity_text_view);
        textView.setText(inf);
    }
}
