package com.example.solvativedemo.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.solvativedemo.model.Data;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 5;
    private static final String DATABASE_NAME = "data_name";
    private static final String TABLE_DATA = "data";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NAME = "artistDisplay";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE "
                + TABLE_DATA + "(" + COLUMN_ID
                + " INTEGER PRIMARY KEY,"
                + COLUMN_NAME + " TEXT" + ")";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DATA);
        onCreate(db);
    }

    public ArrayList<Data> listData() {
        String sql = "select * from " + TABLE_DATA;
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Data> data = new ArrayList<>();
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            do {
                int id = Integer.parseInt(cursor.getString(0));
                String display = cursor.getString(1);
                data.add(new Data(id, display));
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        return data;
    }

    public void addContacts(Data data) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, data.getArtistDisplay());
        values.put(COLUMN_ID, data.getArtistId());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_DATA, null, values);
    }
}
