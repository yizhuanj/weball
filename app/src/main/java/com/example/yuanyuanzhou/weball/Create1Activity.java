package com.example.yuanyuanzhou.weball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.TextView;


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create1);


//        Intent i=getIntent();//因为Mian2Activity是通过intend来启动的，所以通过getIntend来获取与这个Activity相关的数据
//        tv = (TextView) findViewById(R.id.tv22);
//        tv.setText(i.getStringExtra("data"));//因为MainActivity里通过putExtra传递时名字是data，值是nihao


        findViewById(R.id.buttonCreateContinue1).setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                Intent i = new Intent(Create1Activity.this, Create2Activity.class);

//                i.putExtra("data","nihao");//用putExtra把内容传送到另一个Activity,名字是data，值是nihao
                startActivity(i);//启动第二个activity并把i传递过去

            }
        });


    }
}
