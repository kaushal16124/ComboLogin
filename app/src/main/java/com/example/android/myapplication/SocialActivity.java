package com.example.android.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by LENOVO on 19-05-2018.
 */

public class SocialActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void facebook(View view) {
        Uri webpage = Uri.parse("https://m.facebook.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void twitter(View view) {
        Uri webpage = Uri.parse("https://mobile.twitter.com/login");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


    public void instagram(View view) {
        Uri webpage = Uri.parse("https://m.facebook.com/login.php?skip_api_login=1&api_key=124024574287414&signed_next=1&next=https%3A%2F%2Fm.facebook.com%2Fv1.0%2Fdialog%2Foauth%3Fredirect_uri%3Dhttps%253A%252F%252Fwww.instagram.com%252Faccounts%252Fsignup%252F%26scope%3Demail%26response_type%3Dtoken%252Cgranted_scopes%26client_id%3D124024574287414%26ret%3Dlogin%26logger_id%3Db0147d6e-7dfd-1940-c15f-65778da724aa&cancel_url=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fsignup%2F%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%23_%3D_&display=touch&locale=en_GB&logger_id=b0147d6e-7dfd-1940-c15f-65778da724aa&_rdr");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void gmail(View view) {
        Uri webpage = Uri.parse("https://accounts.google.com/AccountChooser/signinchooser?flowName=GlifWebSignIn&flowEntry=AccountChooser");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void rediffmail(View view) {
        Uri webpage = Uri.parse("http://www.rediffmail.com/cgi-bin/login.cgi");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void yahoomail(View view) {
        Uri webpage = Uri.parse("https://login.yahoo.com/beta/m");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void skype(View view) {
        Uri webpage = Uri.parse("https://login.skype.com/login?message=signin_continue&client_id=360605&redirect_uri=https%3A%2F%2Fsecure.skype.com%2Fportal%2Flogin%3Freturn_url%3Dhttps%253A%252F%252Fsecure.skype.com%252Fportal%252Foverview&response_type=postgrant&state=Hmg8QizrkKJ4");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void linkedin(View view) {
        Uri webpage = Uri.parse("https://www.linkedin.com/uas/login");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
