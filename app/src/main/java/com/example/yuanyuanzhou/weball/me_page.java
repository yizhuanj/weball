package com.example.yuanyuanzhou.weball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class me_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_page);
    }


    public void homeButton (View view){
        Intent intent = new Intent (this, home_page.class);
        startActivity(intent);
    }

    public void friendsButton (View view){
        Intent intent = new Intent (this, friends_page.class);
        startActivity(intent);
    }
}
