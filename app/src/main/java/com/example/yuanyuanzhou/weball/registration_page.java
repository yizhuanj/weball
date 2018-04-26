package com.example.yuanyuanzhou.weball;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registration_page extends Activity {

//    public void registrationButton(View view) {
//        EditText emailAddressEditText = (EditText) findViewById(R.id.emailAddressEditText);
//        EditText password2EditText = (EditText) findViewById(R.id.password2EditText);
//        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
//        if (emailAddressEditText.getText().toString() == "" || password2EditText.getText().toString() == "" || usernameEditText.getText().toString() == "") {
//            Toast.makeText(this, "A email address, a password and a username are required!", Toast.LENGTH_SHORT).show();
//        } else {
//            Intent intent = new Intent (this, home_page.class);
//            startActivity(intent);
//        }
//    }



    public void registrationButton(View view) {
        EditText emailAddressEditText = (EditText) findViewById(R.id.emailAddressEditText);
        EditText password2EditText = (EditText) findViewById(R.id.password2EditText);
        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        if (emailAddressEditText.getText().toString().matches("") || password2EditText.getText().toString().matches("") || usernameEditText.getText().toString().matches("")) {
            Toast.makeText(this, "A email address, a password and a username are required!", Toast.LENGTH_SHORT).show();
        } else if (password2EditText.getText().toString().length() < 6) {
            Toast.makeText(this, "The password must be greater than six digits", Toast.LENGTH_SHORT).show();
            {
                Intent intent = new Intent(this, home_page.class);
                startActivity(intent);
            }
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
    }


}
