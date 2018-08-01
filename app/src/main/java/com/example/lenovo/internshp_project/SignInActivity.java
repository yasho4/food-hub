package com.example.lenovo.internshp_project;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    TextView textView1;
    ImageView imageView1;
    ImageView imageView2;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    textView1=(TextView) findViewById(R.id.textView6);
    imageView1=(ImageView) findViewById(R.id.imageView);
    imageView2=(ImageView) findViewById(R.id.imageView2);
    editText1=(EditText) findViewById(R.id.editText4);
    editText2=(EditText) findViewById(R.id.editText5);
    editText3=(EditText) findViewById(R.id.editText6);
    editText4=(EditText) findViewById(R.id.editText7);
    editText5=(EditText) findViewById(R.id.editText8);
    editText6=(EditText) findViewById(R.id.editText9);
    button=(Button) findViewById(R.id.button);
    }
    public void signin(View view)
    {
    Toast.makeText(this,"Congrats! You have successfully signed in.", Toast.LENGTH_LONG).show();
    editText1.setText("");
        editText2.setText("");
        editText3.setText("");
        editText4.setText("");
        editText5.setText("");
        editText6.setText("");
    }


}
