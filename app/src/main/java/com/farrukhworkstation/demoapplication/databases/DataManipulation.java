package com.farrukhworkstation.demoapplication.databases;

import com.farrukhworkstation.demoapplication.models.Hit;
import com.raizlabs.android.dbflow.runtime.TransactionManager;
import com.raizlabs.android.dbflow.runtime.transaction.process.ProcessModelInfo;
import com.raizlabs.android.dbflow.runtime.transaction.process.SaveModelTransaction;
import com.raizlabs.android.dbflow.sql.language.Select;

import java.util.List;

import dagger.Provides;

public class DataManipulation {

    public void saveData(List<Hit> dataList) {
        TransactionManager.getInstance().addTransaction(new SaveModelTransaction<>(ProcessModelInfo.withModels(dataList)));
    }

    public List<Hit> getData() {
        return new Select().from(Hit.class).queryList();
    }
}
