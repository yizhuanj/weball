package com.example.yuanyuanzhou.weball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Create3Activity extends AppCompatActivity {
    private EditText mCreateNumber;
    private Button mContinueBtn;
    private Button mCancelBtn;
    private RadioGroup radgroup;
    private RadioButton mRadpostTo;
//    private String postTo;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create3);


        mCreateNumber = findViewById(R.id.createNumberPlayer);


        mContinueBtn = findViewById(R.id.buttonCreateContinue3);
        mCancelBtn = findViewById(R.id.buttonCreateCancel3);

        radgroup = (RadioGroup) findViewById(R.id.radioGroupCreateTo);
        //第一种获得单选按钮值的方法
        //为radioGroup设置一个监听器:setOnCheckedChanged()
        radgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton radbtn = (RadioButton) findViewById(checkedId);
            }
        });

//        postTo = mRadpostTo.getText().toString();
//        Log.e("postTo is:", "")




        mContinueBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                mRadpostTo = findViewById(radgroup.getCheckedRadioButtonId());


                if (mCreateNumber != null && mRadpostTo != null) {
                    Intent i = new Intent(Create3Activity.this, Create4Activity.class);

                    int number = Integer.parseInt(mCreateNumber.getText().toString());
                    String postTo = mRadpostTo.getText().toString();

                    Bundle extras = new Bundle();
                    extras.putString("postTo",postTo);
                    extras.putInt("numberOfPlayer", number);
                    i.putExtras(extras);

                    startActivity(i);//启动第二个activity并把i传递过去
                }
            }
        });
        mCancelBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                Intent i = new Intent(Create3Activity.this, home_page.class);
                startActivity(i);//启动第二个activity并把i传递过去
            }
        });
    }


}
