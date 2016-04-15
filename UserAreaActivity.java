package com.example.thiyagu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        final EditText etUserName=(EditText) findViewById(R.id.etusername) ;
        final EditText etAge=(EditText) findViewById(R.id.etage) ;
        final TextView welcometolrp=(TextView) findViewById(R.id.tvwelcome) ;
    }
}
