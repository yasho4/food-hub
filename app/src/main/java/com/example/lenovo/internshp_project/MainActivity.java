package com.example.lenovo.internshp_project;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    EditText editText1;
    EditText editText2;
    Button button;
    ImageView imageView1;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity);
        textView1=(TextView) findViewById(R.id.textView2);
        textView2=(TextView) findViewById(R.id.textView3);
        //Typeface font1=Typeface.createFromAsset(getAssets(),"fonts/font2.tff");
        //textView1.setTypeface(font1);


        textView3=(TextView) findViewById(R.id.textView4);
        textView4=(TextView) findViewById(R.id.textView5);
        editText1=(EditText) findViewById(R.id.editText3);
        editText2=(EditText) findViewById(R.id.editText5);
        imageView1=(ImageView) findViewById(R.id.imageView3);
        imageView2=(ImageView) findViewById(R.id.imageView4);
        button=(Button) findViewById(R.id.button2);
        textView1.setPaintFlags(textView1.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG); //underlineText
        Toast.makeText(this,"Please enter your username and password to login", Toast.LENGTH_LONG).show();


        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignInActivity.class);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),help.class);
                startActivity(intent);
            }
        });


    }


    public void login(View view){
        //Intent intent=new Intent(getApplicationContext(),order_main.class);
        if(((editText1.getText().toString().equals("abc") && editText2.getText().toString().equals("123"))
                || (editText1.getText().toString().equals("def") && editText2.getText().toString().equals("456"))
                || (editText1.getText().toString().equals("ghi") && editText2.getText().toString().equals("789"))))
        {
            Intent intent=new Intent(getApplicationContext(),order_main.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Invalid username/password", Toast.LENGTH_LONG).show();
        }

    }

}
