package com.example.yuanyuanzhou.weball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class Create2Activity extends AppCompatActivity {

    TextView mConditionTextView;
    Button mButtonSunny;
    Button mButtonFoggy;
    private Button mContinueBtn;
    private Button mCancelBtn;
//    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
//    DatabaseReference mConditionalRef = mRootRef.child("condition");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create2);
//
//        mConditionTextView = (TextView)findViewById(R.id.textViewCondition);
//        mButtonSunny = (Button)findViewById(R.id.buttonSunny);
//        mButtonFoggy = (Button)findViewById(R.id.buttonFoggy);



        mContinueBtn = (Button)  findViewById(R.id.buttonCreateContinue2);
        mCancelBtn = (Button)  findViewById(R.id.buttonCreateCancel2);

        mContinueBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                Intent i = new Intent(Create2Activity.this, Create3Activity.class);
                startActivity(i);//启动第二个activity并把i传递过去
            }
        });
        mCancelBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                Intent i = new Intent(Create2Activity.this, home_page.class);
                startActivity(i);//启动第二个activity并把i传递过去
            }
        });


    }
    public void createShowMap(View v) {
        Intent intent = new Intent (this, MapsActivity.class);
        startActivity(intent);
    }

//    @Override
//    protected  void onStart() {
//        super.onStart();
//        mConditionalRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                String text = dataSnapshot.getValue(String.class);
//                mConditionTextView.setText(text);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//        mButtonSunny.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                mConditionalRef.setValue("Sunny");
//            }
//        });
//        mButtonFoggy.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                mConditionalRef.setValue("Foggy");
//            }
//        });
//
//
//    }






}
