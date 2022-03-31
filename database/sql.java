package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

class sql extends SQLiteOpenHelper {
    public sql(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "student", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            //db.execSQL("create table student(id integer primary key autoincrement,name varchar(20),place varchar(20));");
        }catch(SQLException e){}

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try{
            //db.execSQL("drop table if exists student;");

        }catch(SQLException e){}

    }
    public long insertData(String name, String place) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name", name);
        cv.put("place", place);
        long rowid = db.insert("student", null, cv);
        return rowid;
    }
    public String display()
    {
        SQLiteDatabase db = getWritableDatabase();
        String columns[] = {"id", "name", "place"};
        Cursor cr = db.query("student", columns, null, null, null, null, null);
        StringBuffer buffer = new StringBuffer();
        while ( cr.moveToNext())
        {
            int id = cr.getInt(0);
            String name = cr.getString(1);
            String  place = cr.getString(2);

            buffer.append(id +" --- "+name+"---"+place + "\n");
        }
        return buffer.toString();
    }
}
