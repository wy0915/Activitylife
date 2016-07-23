package com.w.activitylife;

import android.content.Intent;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String BOOKMAME_OF_ENGLISH="bookName_of_English";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate执行了");
        Button button = (Button) findViewById(R.id.activity_main_button);
        final EditText edit = (EditText) findViewById(R.id.activity_main_edit_text);
        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Activitysecond.class);
//                startActivity(intent);
//                Toast.makeText(MainActivity.this, "单击过按钮了", Toast.LENGTH_SHORT).show();
            String data ="跳转";
                Intent intent = new Intent(MainActivity.this, Activitysecond.class);
                intent.putExtra(BOOKMAME_OF_ENGLISH,edit.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 执行了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 执行了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 执行了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 执行了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 执行了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: 执行了");
    }


}
