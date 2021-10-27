package com.example.tutorial_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText fame, password, email, lane;
    RadioGroup rg;
    Switch sw;
    Spinner sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        fame = (EditText) findViewById(R.id.editText1);
        lane = (EditText) findViewById(R.id.editText2);
        password = (EditText) findViewById(R.id.editText3);
        email = (EditText) findViewById(R.id.editText4);
        rg = (RadioGroup)findViewById(R.id.rg1);
        sw= findViewById(R.id.switch1);


        sp=findViewById(R.id.spinner);
        submit = (Button) findViewById(R.id.button);

          submit.setOnClickListener( new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String str = fame.getText().toString();
                  String str5 = lane.getText().toString();
                  String pwd =password.getText().toString();
                  String e1 =email.getText().toString();
                  String s1 =sp.getSelectedItem().toString();
                  int selectedId =rg.getCheckedRadioButtonId();
                  String sw2 = "";
                  if(sw.isChecked())
                  {
                      sw2 = "MCA";
                  }
                  else
                  {
                      sw2 = "BCA";
                  }

                  RadioButton gn = findViewById(selectedId);
                  String C1 = gn.getText().toString();
                  Intent intent =new Intent(getApplicationContext(),MainActivity2.class );
                  intent.putExtra("fname",str);
                  intent.putExtra("lname",str5);
                  intent.putExtra("p1",pwd);
                  intent.putExtra("em1",e1);
                  intent.putExtra("city", s1);
                  intent.putExtra("gender",C1);
                  intent.putExtra("branch",sw2);


                  startActivity(intent);


              }
          } );
    }
}