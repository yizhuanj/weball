package com.example.yuanyuanzhou.weball;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.app.Fragment;
import android.text.format.DateFormat;
import android.widget.TextView;
import android.app.DialogFragment;
import android.app.Dialog;
import java.util.Calendar;
import android.widget.DatePicker;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    //onTimeSet() callback method
    public void onDateSet(DatePicker view, int year, int month, int day){
        //Do something with the user chosen time
        //Get reference of host activity (XML Layout File) TextView widget
//        TextView tv = (TextView) getActivity().findViewById(R.id.tv);
        //Set a message for user
//        tv.setText("Your chosen time is...\n\n");
        

    }
}
