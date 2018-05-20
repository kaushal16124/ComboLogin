
package com.example.android.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by LENOVO on 19-05-2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contacts.db";
    private static final String TABLE_NAME = "contacts";
    private static final String COLUMN_ID = "kid";
    private static final String COLUMN_NAME = "kname";
    private static final String COLUMN_EMAIL = "kemail";
    private static final String COLUMN_UNAME = "kuname";
    private static final String COLUMN_PASS = "kpass";
    SQLiteDatabase db;


    private static final String TABLE_CREATE = "create table contacts (kid primary key not null , " +
            "kname text not null, kemail text not null, kuname text not null, kpass text not null);";

    public DatabaseHelper (Context context) {

        super(context,DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(TABLE_CREATE);
        this.db=db;
    }

    public void insertContact(Contact c) {

        db=this.getWritableDatabase();
        ContentValues values= new ContentValues();
        String query= "select * from contacts";
        Cursor cursor= db.rawQuery(query,null);
        int count=cursor.getCount();
        values.put(COLUMN_ID, count);
        values.put(COLUMN_NAME, c.getName());
        values.put(COLUMN_EMAIL, c.getEmail());
        values.put(COLUMN_UNAME, c.getUname());
        values.put(COLUMN_PASS, c.getPass());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public String searchPass (String kuname){

        db=this.getReadableDatabase();
        String query= "select kuname,kpass from " + TABLE_NAME;
        Cursor cursor= db.rawQuery(query,null);
        String a,b;
        b="Not Found";
        if(cursor.moveToFirst())
        {
            do {

                a=cursor.getString(0);


                if(a.equals(kuname))
                {
                    b=cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }
        return b;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
