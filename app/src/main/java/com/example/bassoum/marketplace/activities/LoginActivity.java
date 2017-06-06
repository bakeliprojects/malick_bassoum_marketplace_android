package com.example.bassoum.marketplace.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bassoum.marketplace.R;

public class LoginActivity extends AppCompatActivity  {

        Button bLogin;
        EditText Username,Password;
        String hello,hello1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        bLogin= (Button) findViewById(R.id.bLogin);


        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Username = (EditText)findViewById(R.id.etUsername);
                Password  = (EditText)findViewById(R.id.etPassword);
                hello="correct";
                hello1="Mot de passe ou utilisateur incorrect";

                if(Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin")){
                //correcct password
                    Toast.makeText(LoginActivity.this,hello, Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(LoginActivity.this, ProduitActivity.class);
                    startActivity(i);

                }else{
                    //wrong password
                    Toast.makeText(LoginActivity.this,hello1, Toast.LENGTH_SHORT).show();

                }


        }

        });




        }




}

