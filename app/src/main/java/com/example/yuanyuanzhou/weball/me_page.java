package com.example.yuanyuanzhou.weball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class me_page extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_me_page);
//    }
//
//
//    public void homeButton (View view){
//        Intent intent = new Intent (this, home_page.class);
//        startActivity(intent);
//    }
//
//    public void friendsButton (View view){
//        Intent intent = new Intent (this, friends_page.class);
//        startActivity(intent);
//    }

    private TextView mName;

    //private FireBase mRef;
    final FirebaseDatabase database = FirebaseDatabase.getInstance();

//    DatabaseReference mRef = database.getReference("https://weball-master.firebaseio.com/users/-LBDpVXMFoW5I-3c51XF/username");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_page);

        mName = (TextView) findViewById(R.id.name);

//        mRef.addValueEventListener(new ValueEventListener(){
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                String value = dataSnapshot.getValue(String.class);
//                mName.setText(value);
//
//
//            }

//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//
//            }
//        });

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
