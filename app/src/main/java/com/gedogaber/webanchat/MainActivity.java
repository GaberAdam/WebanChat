package com.gedogaber.webanchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   public Button  login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setBackgroundColor(getResources().getColor(R.color.white));
                Intent login_activity = new Intent(MainActivity.this,login.class);
                startActivity(login_activity);
            }
        });
        signup=findViewById(R.id.button3);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup.setBackgroundColor(getResources().getColor(R.color.white));
                Intent gosignup = new Intent(MainActivity.this,SignUp.class);
                startActivity(gosignup);
            }
        });
    }
}