package com.example.bassoum.marketplace.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.bassoum.marketplace.R;

public class ProduitActivity extends AppCompatActivity {

    ImageButton robe,botte,chemise,portable,montre,braceller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produit);

        robe= (ImageButton) findViewById(R.id.robe);
        botte= (ImageButton) findViewById(R.id.botte);
        chemise= (ImageButton) findViewById(R.id.chemise);
        portable= (ImageButton) findViewById(R.id.portable);
        montre= (ImageButton) findViewById(R.id.montre);
        braceller= (ImageButton) findViewById(R.id.braceller);

        robe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(ProduitActivity.this, RobeActivity.class);
                    startActivity(i);
                }
        });

        botte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProduitActivity.this, BotteActivity.class);
                startActivity(i);
            }
        });

        portable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProduitActivity.this, PortableActivity.class);
                startActivity(i);
            }
        });

        chemise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProduitActivity.this, ChemiseActivity.class);
                startActivity(i);
            }
        });

        montre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProduitActivity.this, MontreActivity.class);
                startActivity(i);
            }
        });

        braceller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProduitActivity.this, BracellerActivity.class);
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.deconnexion:

                Intent i = new Intent(ProduitActivity.this, LoginActivity.class);
                startActivity(i);

                return true;

            case R.id.two:
                //do something
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
