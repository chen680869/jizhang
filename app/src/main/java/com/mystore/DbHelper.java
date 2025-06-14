
package com.mystore;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context) {
        super(context, "mystore.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE items(id INTEGER PRIMARY KEY, name TEXT, cost REAL, price REAL, qty INTEGER)");
        db.execSQL("CREATE TABLE purchase(id INTEGER PRIMARY KEY, item_id INTEGER, qty INTEGER, cost REAL, date TEXT)");
        db.execSQL("CREATE TABLE sale(id INTEGER PRIMARY KEY, item_id INTEGER, qty INTEGER, price REAL, date TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
