package com.example.yuanyuanzhou.weball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.app.Dialog;
import java.util.Calendar;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import android.view.View;

public class DiscoverGameActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_discover_game);
//    }









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_game);
    }

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(), "timePicker");
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "datePicker");
    }
    public void dicoverShowMap(View v) {
        Intent intent = new Intent (this, MapsActivity.class);
        startActivity(intent);
    }

    public void cancel (View view){
        Intent intent = new Intent (this, home_page.class);
        startActivity(intent);
    }

    public void continueTo (View view){
        Intent intent = new Intent (this, ShowFiltered.class);
        startActivity(intent);
    }













}
