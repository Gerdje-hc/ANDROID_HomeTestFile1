package com.example.gerdhung_chu.android_hometestfile1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.gerdhung_chu.android_hometestfile1.R.id.btn_clickMe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_ClickMe = (Button) findViewById(btn_clickMe);
        final EditText ed_first_name = (EditText) findViewById(R.id.ed_first_name);
        final EditText ed_last_name = (EditText) findViewById(R.id.ed_last_name);
        final TextView txt_result = (TextView) findViewById(R.id.txt_result);
        Button btn_gotoP2 = (Button) findViewById(R.id.btn_gotoP2);

        btn_ClickMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String firstName = ed_first_name.getText().toString();
                String lastName = ed_last_name.getText().toString();

                if (firstName.length() > 0 && lastName.length() > 0) {
                    String result = "Your name is " + firstName + lastName;
                    txt_result.setText(result);
                }
            }
        });

    }
}
