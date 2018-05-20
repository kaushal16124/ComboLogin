
package com.example.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import java.text.NumberFormat;
import android.widget.CheckBox;
import android.widget.Toast;
import android.content.Intent;
import android.widget.ImageView;


/**
 * Created by LENOVO on 18-05-2018.
 */

public class login1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.click_login);
    }

    public void socialmedia(View view) {
        Intent i1 = new Intent(this, SocialActivity.class);
        startActivity(i1);
    }

    public void news(View view) {
        Intent i2 = new Intent(this, NewsActivity.class);
        startActivity(i2);
    }

    public void youtube(View view) {
        Intent i3 = new Intent(this, YoutubeActivity.class);
        startActivity(i3);
    }



}
