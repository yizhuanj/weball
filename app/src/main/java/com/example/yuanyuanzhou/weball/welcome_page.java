package com.example.yuanyuanzhou.weball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class welcome_page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    public void AgreeButton (View view){
        Intent intent = new Intent (this, login_page.class);
        startActivity(intent);
    }



}


