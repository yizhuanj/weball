package com.example.yuanyuanzhou.weball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

public class ShowFiltered extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_filtered);

        Fragment fragment = new ShowFilteredGamesFragment();
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.fragment, fragment).commit();
    }
}
