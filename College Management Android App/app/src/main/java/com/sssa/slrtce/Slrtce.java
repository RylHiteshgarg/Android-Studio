package com.sssa.slrtce;

import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.androidnetworking.AndroidNetworking;


/**
 * Created by hitesh on 02/07/2020
 */

public class Slrtce extends MultiDexApplication {

    private static Slrtce istance;

    @Override
    public void onCreate() {
        super.onCreate();
        istance = this;
        AndroidNetworking.initialize(this);
        MultiDex.install(this);
    }

    /**
     * Instance of this class
     * @return
     */
    public static Slrtce getIstance() {
        return istance;
    }

}

