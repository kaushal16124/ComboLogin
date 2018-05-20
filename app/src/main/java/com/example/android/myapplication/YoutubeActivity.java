package com.example.android.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by LENOVO on 19-05-2018.
 */

public class YoutubeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
    }

    public void aib(View view) {
        Uri webpage = Uri.parse("https://m.youtube.com/user/allindiabakchod");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void star(View view) {
        Uri webpage = Uri.parse("https://m.youtube.com/user/espnstar");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
    public void coke(View view) {
        Uri webpage = Uri.parse("https://m.youtube.com/user/CokeStudioPk");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void did(View view) {
        Uri webpage = Uri.parse("https://m.youtube.com/user/danceindiadance");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


    public void sandeep(View view) {
        Uri webpage = Uri.parse("https://m.youtube.com/user/SandeepSeminars");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void sanjeev(View view) {
        Uri webpage = Uri.parse("https://m.youtube.com/user/sanjeevkapoorkhazana");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void tseries(View view) {
        Uri webpage = Uri.parse("https://m.youtube.com/user/tseries");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void tvf(View view) {
        Uri webpage = Uri.parse("https://m.youtube.com/user/TheViralFeverVideos");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void nisha(View view) {
        Uri webpage = Uri.parse("https://m.youtube.com/user/NishaMadhulika");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}

