package com.example.appmobilephone;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DanhBaDBSqlHeper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="danhba";



    public DanhBaDBSqlHeper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DanhBaEntry.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DanhBaEntry.DROP_TABLE);

        onCreate(db);
    }

}
