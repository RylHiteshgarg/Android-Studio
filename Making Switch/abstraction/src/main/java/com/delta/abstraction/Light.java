package com.delta.abstraction;

import sun.rmi.runtime.Log;
import android.util.Log;

public class Light extends Device implements Switchable{

    public Light()
    {
        setDeviceName("Light");
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(),"Glasses Everywhere!---------i guess it's not that bad");
    }

    @Override
    public void turnOn() {
        Log.e(getDeviceName(), "Too much darkness");
    }

    @Override
    public void turnOff() {
        Log.e(getDeviceName(),"Now i can see my keys");
    }
}
