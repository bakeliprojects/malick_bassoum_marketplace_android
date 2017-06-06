package com.example.bassoum.marketplace.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import com.example.bassoum.marketplace.R;
import io.realm.Realm;
import io.realm.RealmAsyncTask;
import model.Person;
import java.lang.String;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    Button bSinscrire,bSeconnecter;
    private Button button_save;
    private Realm realm;
    private EditText editText_Name,editText_Email,editText_username,editText_password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm realm = Realm.getDefaultInstance();
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

        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                save_into_database(editText_Name.getText().toString().trim(),editText_Email.getText().toString().trim(),
                        editText_username.getText().toString().trim(),editText_password.getText().toString().trim());
                        refresh_View();


            }
        });

    }

    private void refresh_View() {

    }

    private void save_into_database(String Name, String Email, String username, String password) {

        RealmAsyncTask executeTransactionAsync = realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm bgRealm) {
               Person person = bgRealm.createObject(Person.class);
                person.setName("Name");
                person.setEmail("Email");
                person.setUsername("username");
                person.setPassword("password");
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                // Transaction was a success.
                Log.v("database", "est enreistrer");
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {

                Log.e("database", error.getMessage());
                // Transaction failed and was automatically canceled.
            }
        });

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        realm.close();

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
