
package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){

        EditText text = (EditText) findViewById(R.id.user_name);
        String uname = text.getText().toString();

        EditText text1 = (EditText) findViewById(R.id.password);
        String pass = text1.getText().toString();

        String password= helper.searchPass(uname);

        if(pass.equals(password))
        {
            Intent i1 = new Intent(this, login1.class);
            startActivity(i1);
            finish();
        }
        else
        {
            Toast pass1 = Toast.makeText(MainActivity.this, "Username and Password don't match !!", Toast.LENGTH_SHORT);
            pass1.show();
        }



    }

    public void signup(View view){

        Intent i2 = new Intent(this, signup1.class);
        startActivity(i2);
        finish();

    }
}
