package com.example.vegiart365;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

       Button Addcard =(Button) findViewById(R.id.Addcard);
       Button account=(Button) findViewById(R.id.account);
       ImageView category=(ImageView) findViewById(R.id.category);

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

         category.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 opencategory();
             }
         });

    }
    public void openLogin(){
        Intent intent=new Intent(this,Login.class);
        startActivities(new Intent[]{intent});
    }

    public void opencategory(){

        Intent intent=new Intent(this,category.class);
        startActivities(new Intent[]{intent});
    }

}