package com.delta.abstraction;

import sun.rmi.runtime.Log;
import android.util.Log;

public class Fan extends Device implements Switchable{

    public Fan()
    {
        setDeviceName("Fan");
    }

    @Override
    public void breakDevice()
    {
        Log.e(getFanName(),"Bang bang Crash------oops!");
    }

    @Override
    public void turnOn() {
        Log.e(getDeviceName(),"It's too hot");
    }

    @Override
    public void turnOff() {
        Log.e(getDeviceName(),"it's too cold");
    }
}
