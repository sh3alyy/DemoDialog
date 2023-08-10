package sg.edu.rp.c346.id22025520.demodialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnDemo1, btnDemo2, btnDemo3, btnDemo4, btnDemo5, btnDemo6;
    TextView tvDemo2, tvDemo3, tvDemo4, tvDemo5, tvDemo6;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDemo1 = findViewById(R.id.buttonDemo1);
        btnDemo2 = findViewById(R.id.buttonDemo2);
        btnDemo3 = findViewById(R.id.buttonDemo3);
        btnDemo4 = findViewById(R.id.buttonDemo4);
        btnDemo5 = findViewById(R.id.buttonDemo5);
        btnDemo6 = findViewById(R.id.buttonDemo6);
        tvDemo2 = findViewById(R.id.textViewDemo2);
        tvDemo3 = findViewById(R.id.textViewDemo3);
        tvDemo4 = findViewById(R.id.textViewDemo4);
        tvDemo5 = findViewById(R.id.textViewDemo5);
        tvDemo6 = findViewById(R.id.textViewDemo6);

        btnDemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                //myBuilder.setTitle("Demo 1- Simple Dialog");
                //myBuilder.setMessage("I can develop Android App.");
                //myBuilder.setCancelable(false);
                //myBuilder.setPositiveButton("Close", null);

                //myBuilder.setTitle("Congratulations");
                //myBuilder.setMessage("You have completed a single dialog box.");
                //myBuilder.setCancelable(false);
                //myBuilder.setPositiveButton("DISMISS", null);

                myBuilder.setTitle("Demo 2 Buttons Dialog");
                myBuilder.setMessage("You have completed a single dialog box.");
                myBuilder.setCancelable(true);
                myBuilder.setPositiveButton("DISMISS", null);

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
        btnDemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setTitle("Demo 2 Buttons Dialog");
                myBuilder.setMessage("Select one of the buttons below");
                myBuilder.setCancelable(true);
                myBuilder.setPositiveButton("POSITIVE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvDemo2.setText("You have selected positive");
                    }
                });
                btnDemo2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                        myBuilder.setTitle("Demo 2 Buttons Dialog");
                        myBuilder.setMessage("Select one of the buttons below");
                        myBuilder.setCancelable(true);
                        myBuilder.setPositiveButton("NEGATIVE", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                tvDemo2.setText("You have selected negative");
                            }
                        });
                        myBuilder.setNeutralButton("Cancel", null);
                        AlertDialog myDialog = myBuilder.create();
                        myDialog.show();
                    }

                });


                btnDemo3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Inflate the input.xml layout file
                        LayoutInflater inflater =
                                (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View viewDialog = inflater.inflate(R.layout.input, null);

                        // Obtain the UI component in the input.xml layout
                        // It needs to be defined as "final", so that it can used in the onClick() method later
                        EditText etInput = viewDialog.findViewById(R.id.editTextInput);

                        AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                        myBuilder.setView(viewDialog);  // Set the view of the dialog
                        myBuilder.setTitle("Demo 3-Text Input Dialog");
                        myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Extract the text entered by the user
                                String message = etInput.getText().toString();
                                // Set the text to the TextView
                                tvDemo3.setText(message);
                            }
                        });
                        myBuilder.setNegativeButton("CANCEL", null);
                        AlertDialog myDialog = myBuilder.create();
                        myDialog.show();
                    }


                });

                btnDemo4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Inflate the input.xml layout file
                        LayoutInflater inflater =
                                (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        View viewDialog = inflater.inflate(R.layout.input, null);

                        // Obtain the UI component in the input.xml layout
                        // It needs to be defined as "final", so that it can used in the onClick() method later
                        EditText etInput = viewDialog.findViewById(R.id.editTextInput);

                        AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                        myBuilder.setView(viewDialog);  // Set the view of the dialog
                        myBuilder.setTitle("EXERCISE 3");
                        myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Extract the text entered by the user
                                String message = etInput.getText().toString();
                                // Set the text to the TextView
                                tvDemo4.setText(message);
                            }
                        });
                        myBuilder.setNegativeButton("CANCEL", null);
                        AlertDialog myDialog = myBuilder.create();
                        myDialog.show();
                    }


                });
                btnDemo5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                tvDemo5.setText("Date: " + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        };

                        Calendar calendar = Calendar.getInstance();

                        int year = calendar.get(Calendar.YEAR);
                        int month = calendar.get(Calendar.MONTH) + 1;
                        int day = calendar.get(Calendar.DAY_OF_MONTH);
                        int hour = calendar.get(Calendar.HOUR_OF_DAY);
                        int min = calendar.get(Calendar.MINUTE);


                        DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, myDateListener, 2014, 11, 31);
                        myDateDialog.show();
                    }
                });
                btnDemo6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void OnClick(View view){
                        DialogInterface.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                tvDemo6.setText("Time: " + hourOfDay + ":" + minute);
                            }
                        });
                
                        int initialHour = 8;
                        int initialMinute = 0;
                        boolean is24HourView = false;

                        TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this, myTimeListener, 20, 00, true);
                    myTimeListener.show();
                    }
                });


