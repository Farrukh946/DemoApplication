package com.farrukhworkstation.demoapplication.databases.dbModules;

import com.farrukhworkstation.demoapplication.databases.DataManipulation;
import com.farrukhworkstation.demoapplication.models.Hit;
import com.raizlabs.android.dbflow.sql.language.Select;

import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Response;

@Module
public class DataManipulationModule {
    @Singleton
    @Provides
    public DataManipulation dataManipulations() {
        return new DataManipulation();
    }
}
