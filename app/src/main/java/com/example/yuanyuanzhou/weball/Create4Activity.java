package com.example.yuanyuanzhou.weball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Create4Activity extends AppCompatActivity {
    private EditText mCreateComment;
    private Button mPostBtn;
    private Button mCancelBtn;
//    private StorageReference mStorage;
    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create4);





        mCreateComment = (EditText) findViewById(R.id.creatComment);
        mPostBtn = (Button) findViewById(R.id.buttonCreatePost4);
        mCancelBtn = (Button) findViewById(R.id.buttonCreateCancel4);


        mDatabase = FirebaseDatabase.getInstance().getReference().child("games");




        mPostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();

                int numberPlayer = intent.getIntExtra("numberPlayer", 0);
//                String postTo = intent.getStringExtra("postTo");
                String comment = mCreateComment.getText().toString().trim();

//                startPosting(comment, numberPlayer, postTo);
                startPosting(comment, numberPlayer);


                Intent i = new Intent(Create4Activity.this, home_page.class);
                startActivity(i);
            }
        });

        mCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Create4Activity.this, home_page.class);
                startActivity(i);
            }
        });


    }

//    private void startPosting(String comment, int numberPlayer, String postTo){
    private void startPosting(String comment, int numberPlayer){

        DatabaseReference newPost = mDatabase.push();
//        newPost.child("postTo").setValue(postTo);
        newPost.child("numberOfPlayers").setValue(numberPlayer);
        newPost.child("comment").setValue(comment);
    }


}
