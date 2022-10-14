package com.example.vegiart365;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

       Button Addcard =(Button) findViewById(R.id.Addcard);
       Button account=(Button) findViewById(R.id.account);

        Addcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });
         account.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openLogin();
             }
         });

    }
    public void openLogin(){
        Intent intent=new Intent(this,Login.class);
        startActivities(new Intent[]{intent});
    }
}