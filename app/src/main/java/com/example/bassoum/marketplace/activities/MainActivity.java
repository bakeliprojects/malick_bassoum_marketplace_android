package com.example.bassoum.marketplace.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import com.example.bassoum.marketplace.R;

public class MainActivity extends AppCompatActivity {

    Button bSinscrire,bSeconnecter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bSinscrire = (Button) findViewById(R.id.bSinscrire);


            //S'inscrire/

        bSinscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inscrire = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(inscrire);


            }
        });

          //connection
        final Button bSeconnecter = (Button) findViewById(R.id.bSeconnecter);
             bSeconnecter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent connecter = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(connecter);
                }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_register, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
