
package com.example.android.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by LENOVO on 18-05-2018.
 */

public class signup1 extends AppCompatActivity {


    DatabaseHelper helper= new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.click_signup);


    }

    public void account (View v) {


        EditText kname=(EditText)findViewById(R.id.sname);
        EditText kemail=(EditText)findViewById(R.id.semail);
        EditText kuname=(EditText)findViewById(R.id.suname);
        EditText kpass=(EditText)findViewById(R.id.spass);
        EditText kcpass=(EditText)findViewById(R.id.scpass);

        String kname1=kname.getText().toString();
        String kemail1=kemail.getText().toString();
        String kuname1=kuname.getText().toString();
        String kpass1=kpass.getText().toString();
        String kcpass1=kcpass.getText().toString();

        if(!kpass1.equals(kcpass1))
        {
            Toast pass = Toast.makeText(signup1.this, "Passwords don't match !!", Toast.LENGTH_SHORT);
            pass.show();
        }
        else
        {
            Contact c = new Contact();
            c.setName(kname1);
            c.setEmail(kemail1);
            c.setUname(kuname1);
            c.setPass(kpass1);

            helper.insertContact(c);

            Toast pass2 = Toast.makeText(signup1.this, "Successfully Registered !! ", Toast.LENGTH_SHORT);
            pass2.show();

            Intent i3 = new Intent(this , MainActivity.class);
            startActivity(i3);
            finish();
        }





    }

}
