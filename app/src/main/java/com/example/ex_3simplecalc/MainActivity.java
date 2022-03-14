package com.example.ex_3simplecalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText value1;
    EditText value2;
    Button add;
    Button sub;
    Button mul;
    Button div;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView)findViewById(R.id.title);
        value1 = (EditText)findViewById(R.id.firstvalue);
        value2 = (EditText)findViewById(R.id.secondvalue);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.Mul);
        div = (Button) findViewById(R.id.Div);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r = Integer.parseInt(value1.getText().toString()) + Integer.parseInt(value2.getText().toString());
                title.setText(Integer.toString(r));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r = Integer.parseInt(value1.getText().toString()) - Integer.parseInt(value2.getText().toString());
                title.setText(Integer.toString(r));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r = Integer.parseInt(value1.getText().toString()) * Integer.parseInt(value2.getText().toString());
                title.setText(Integer.toString(r));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float r = Float.parseFloat(value1.getText().toString()) / Float.parseFloat(value2.getText().toString());
                title.setText(Float.toString(r));
            }
        });

    }
}