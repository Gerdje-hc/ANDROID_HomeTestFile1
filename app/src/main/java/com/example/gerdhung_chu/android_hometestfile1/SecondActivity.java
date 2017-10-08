package com.example.gerdhung_chu.android_hometestfile1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by gerdhung-chu on 8/10/17.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText tv_welcome_p2 = (EditText) findViewById(R.id.tv_welcome_p2);

    }
}
