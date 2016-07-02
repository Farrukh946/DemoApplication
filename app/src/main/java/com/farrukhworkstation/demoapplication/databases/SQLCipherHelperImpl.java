//package com.farrukhworkstation.demoapplication.databases;
//import com.raizlabs.android.dbflow.config.DatabaseConfig;
//
//import com.raizlabs.android.dbflow.config.DatabaseDefinition;
//import com.raizlabs.android.dbflow.config.FlowManager;
//import com.raizlabs.android.dbflow.structure.database.BaseDatabaseHelper;
//import com.raizlabs.android.dbflow.structure.database.DatabaseHelperDelegate;
//import com.raizlabs.android.dbflow.structure.database.DatabaseHelperListener;
//import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
//import com.raizlabs.android.dbflow.structure.database.OpenHelper;
//import com.raizlabs.dbflow.android.sqlcipher.SQLCipherOpenHelper;
//
//import net.sqlcipher.database.SQLiteDatabase;
//import net.sqlcipher.database.SQLiteOpenHelper;
//
//public class SQLCipherHelperImpl extends SQLCipherOpenHelper {
//
//    public SQLCipherHelperImpl(DatabaseDefinition databaseDefinition, DatabaseHelperListener listener) {
//        super(databaseDefinition, listener);
//    }
//    @Override
//    protected String getCipherSecret() {
//        return "dbflow-rules";
//    }
//}