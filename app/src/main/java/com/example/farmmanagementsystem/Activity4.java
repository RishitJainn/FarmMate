package com.example.farmmanagementsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

        public class Activity4 extends AppCompatActivity {


            CalendarView calender;
            TextView date_view;
            @Override
            protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_4);

                // By ID we can use each component
                // which id is assign in xml file
                // use findViewById() to get the
                // CalendarView and TextView
                calender = (CalendarView)
                        findViewById(R.id.calender);
                date_view = (TextView)
                        findViewById(R.id.date_view);

                // Add Listener in calendar
                calender
                        .setOnDateChangeListener(
                                new CalendarView
                                        .OnDateChangeListener() {
                                    @Override


                                    public void onSelectedDayChange(
                                            @NonNull CalendarView view,
                                            int year,
                                            int month,
                                            int dayOfMonth)
                                    {
                                        String Date
                                                = dayOfMonth + "-"
                                                + (month + 1) + "-" + year;

                                        // set this date in TextView for Display
                                        date_view.setText(Date);
                                    }
                                });
            }
        }

