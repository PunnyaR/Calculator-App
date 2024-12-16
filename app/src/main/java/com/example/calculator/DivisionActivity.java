package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DivisionActivity extends AppCompatActivity {
    EditText et7,et8;
    Button bu7,bu8;
    String getNum1,getNum2,result;
    int num1,num2,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);

        et7=(EditText) findViewById(R.id.no1);
        et8=(EditText) findViewById(R.id.no2);
        bu7=(Button) findViewById(R.id.divo);
        bu8=(Button) findViewById(R.id.bcmenu);

        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et7.getText().toString();
                getNum2=et8.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                div=num1/num2;
                result=String.valueOf(div);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob8=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob8);
            }
        });
    }
}