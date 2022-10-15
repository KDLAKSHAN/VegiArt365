package com.example.vegiart365;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

       Button Addcard =(Button) findViewById(R.id.Addcard);
       Button account=(Button) findViewById(R.id.account);
       ImageView category=(ImageView) findViewById(R.id.category);
        ImageView offer=(ImageView) findViewById(R.id.offer);
        Button ALLView=(Button) findViewById(R.id.Viewall);

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

         offer.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) { openoffer();

             }
         });

        ALLView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openALLViwe();

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

    public void openoffer(){

        Intent intent=new Intent(this,offer.class);
        startActivities(new Intent[]{intent});
    }

    public void openALLViwe(){

        Intent intent=new Intent(this,ALLViwe.class);
        startActivities(new Intent[]{intent});
    }

}