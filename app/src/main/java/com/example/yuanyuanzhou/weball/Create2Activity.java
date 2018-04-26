package com.example.yuanyuanzhou.weball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Create2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create2);

        findViewById(R.id.buttonCreateContinue2).setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                Intent i = new Intent(Create2Activity.this, Create3Activity.class);

//                i.putExtra("data","nihao");//用putExtra把内容传送到另一个Activity,名字是data，值是nihao
                startActivity(i);//启动第二个activity并把i传递过去

            }
        });
    }

}
