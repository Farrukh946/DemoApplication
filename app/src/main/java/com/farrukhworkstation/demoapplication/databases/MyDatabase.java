package com.farrukhworkstation.demoapplication.databases;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Farrukh Work Station on 6/21/2016.
 */
@Database(name = MyDatabase.NAME, version = MyDatabase.VERSION)
public class MyDatabase {
    public static final String NAME = "MyDataBaseNew";

    public static final int VERSION = 1;
}