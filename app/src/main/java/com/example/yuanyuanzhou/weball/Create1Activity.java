package com.example.yuanyuanzhou.weball;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;


//public class Create1Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_create1);
//    }
//}


public class Create1Activity extends AppCompatActivity {

    private TextView tv;
    private Button mContinueBtn;
    private Button mCancelBtn;
    private RadioGroup radgroup;
    private RadioButton mRadGameType;

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(), "timePicker");
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "datePicker");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create1);



        mContinueBtn = (Button)  findViewById(R.id.buttonCreateContinue1);
        mCancelBtn = (Button)  findViewById(R.id.buttonCreateCancel1);




        radgroup = (RadioGroup) findViewById(R.id.radioGroupCreateType);
        radgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radbtn = findViewById(checkedId);
            }
        });
        mRadGameType = findViewById(radgroup.getCheckedRadioButtonId());




        mContinueBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {

//                if (mRadGameType != null) {
//                    Intent i = new Intent(Create1Activity.this, Create2Activity.class);
////                String postTo = mRadpostTo.getText().toString();
////                i.putExtra("numberPlayer",number);
//                    startActivity(i);//启动第二个activity并把i传递过去
//                }
                Intent i = new Intent(Create1Activity.this, Create2Activity.class);
                startActivity(i);

            }
        });
        mCancelBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                Intent i = new Intent(Create1Activity.this, home_page.class);
                startActivity(i);//启动第二个activity并把i传递过去
            }
        });

    }
}
