package com.example.yuanyuanzhou.weball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Create4Activity extends AppCompatActivity {
    private EditText mCreateComment;
    private Button mPostBtn;
    private Button mCancelBtn;
//    private StorageReference mStorage;
    private DatabaseReference mDatabase;
    private TextView mPostGameType;
    private TextView mPostStartTime;
    private TextView mPostEndTime;
    private TextView mPostLocation;
    private TextView mPostNumber;
    private int numberPlayer;
    private String postTo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create4);





        mCreateComment = (EditText) findViewById(R.id.creatComment);
        mPostBtn = (Button) findViewById(R.id.buttonCreatePost4);
        mCancelBtn = (Button) findViewById(R.id.buttonCreateCancel4);
        mPostGameType = (TextView) findViewById(R.id.textViewGame);
        mPostStartTime = (TextView) findViewById(R.id.textViewStart);
        mPostEndTime = (TextView) findViewById(R.id.textViewEnd);
        mPostLocation = (TextView) findViewById(R.id.textViewLocation);
        mPostNumber = (TextView) findViewById(R.id.textViewNumber);


        mDatabase = FirebaseDatabase.getInstance().getReference().child("games");


        Bundle extras = getIntent().getExtras();
        numberPlayer = extras.getInt("numberOfPlayer",0);
        Log.i("number of players", Integer.toString(numberPlayer));
        assert extras != null;
        postTo = extras.getString("postTo", "public");

        mPostGameType.setText("Game Type: " + Integer.toString(numberPlayer));
        mPostStartTime.setText("Start Time: " + Integer.toString(numberPlayer));
        mPostEndTime.setText("End Time: " + Integer.toString(numberPlayer));
        mPostLocation.setText("Location: ");
        mPostNumber.setText("Number of Players needed: " + Integer.toString(numberPlayer));

        mPostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String comment = mCreateComment.getText().toString().trim();

                startPosting(comment, numberPlayer, postTo);


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

    private void startPosting(String comment, int numberPlayer, String postTo){
//    private void startPosting(String comment, int numberPlayer){
//  private void startPosting(String comment, String postTo){

        DatabaseReference newPost = mDatabase.push();
        newPost.child("postTo").setValue(postTo);
        newPost.child("numberOfPlayers").setValue(numberPlayer);
        newPost.child("comment").setValue(comment);
    }


}
