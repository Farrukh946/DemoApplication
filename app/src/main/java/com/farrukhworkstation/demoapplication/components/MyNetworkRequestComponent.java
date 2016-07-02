package com.farrukhworkstation.demoapplication.components;

import com.farrukhworkstation.demoapplication.databases.dbModules.DataManipulationModule;
import com.farrukhworkstation.demoapplication.fragments.HomeFragment;
import com.farrukhworkstation.demoapplication.modules.MyNetworkRequestModule;
import com.farrukhworkstation.demoapplication.scopes.MyCustomScope;

import dagger.Component;

/**
 * Created by Farrukh Work Station on 6/26/2016.
 */
@MyCustomScope
@Component(dependencies = NetComponent.class, modules = {MyNetworkRequestModule.class,DataManipulationModule.class})
public interface MyNetworkRequestComponent {
    void inject(HomeFragment activity);
}
