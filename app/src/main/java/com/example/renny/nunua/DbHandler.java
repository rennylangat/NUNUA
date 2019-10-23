package com.example.renny.nunua;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

/**
 * Created by renny on 1/30/2017.
 */

public class DbHandler extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="users.db";
    public static final String TABLE_USERS="users1";
    public static final String COLUMN_ID="id";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_EMAIL="email";
    public static final String COLUMN_PHONE="phone";

    public DbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="CREATE TABLE"+ TABLE_USERS +"("+
                COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREAMENT"+
                COLUMN_NAME + "TEXT" +
                COLUMN_EMAIL + "TEXT" +
                COLUMN_PHONE + "TEXT" +
                ");";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_USERS);

    }
    public void addUser(DbHelper dbHelper){
        ContentValues values=new ContentValues();
        values.put(COLUMN_NAME,dbHelper.get_name());
        values.put(COLUMN_EMAIL,dbHelper.get_email());
        values.put(COLUMN_PHONE,dbHelper.get_phone());
        SQLiteDatabase db=getWritableDatabase();
        db.insert(TABLE_USERS,null,values);
        db.close();
    }

    public void addUser(EditText name12) {

    }
}
