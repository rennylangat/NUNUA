package com.example.renny.nunua;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {
    DbHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button submit=(Button) findViewById(R.id.button);
        final EditText name12=(EditText)findViewById(R.id.nametxt);
        final EditText email=(EditText)findViewById(R.id.email);
        final EditText phone=(EditText)findViewById(R.id.phone);
        EditText desc=(EditText)findViewById(R.id.desc);

        dbHandler= new DbHandler(this,null,null,1);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                DbHelper dbHelper = new DbHelper(name12.getText().toString());
                dbHandler.addUser(name12);
                DbHelper dbHelper1 = new DbHelper(phone.getText().toString());
                dbHandler.addUser(phone);
                DbHelper dbHelper2 = new DbHelper(email.getText().toString());
                dbHandler.addUser(email);
                if ((name12.getText().toString().trim().equals("")) && (phone.getText().toString().trim().equals(""))
                        && (email.getText().toString().trim().equals(""))) {
                    Toast.makeText(getApplicationContext(), "name field empty", Toast.LENGTH_SHORT).show();
                } else {

                    Intent i = new Intent(MainActivity.this, Payment.class);
                    startActivity(i);
                }
            }


            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;
            }


            public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings) {
                    return true;
                }
                return false;
            }
        });
    }
}
