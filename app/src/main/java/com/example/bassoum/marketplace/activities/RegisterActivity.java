package com.example.bassoum.marketplace.activities;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;

import com.example.bassoum.marketplace.R;

public class RegisterActivity extends AppCompatActivity {

    Button bRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        bRegister= (Button) findViewById(R.id.bRegister);





    }

}
