package com.example.yuanyuanzhou.weball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class friends_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_page);
    }

    public void SophieButton (View view){
        Intent intent = new Intent (this, Sophie_page.class);
        startActivity(intent);
    }

    public void AmyButton (View view){
        Intent intent = new Intent (this, Amy_page.class);
        startActivity(intent);
    }

    public void TimButton (View view){
        Intent intent = new Intent (this, Tim_page.class);
        startActivity(intent);
    }




    }
