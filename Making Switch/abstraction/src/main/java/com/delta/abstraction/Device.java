package com.delta.abstraction;
import sun.rmi.runtime.Log;
import android.util.Log;


public abstract class Device {
    protected String deviceName = "Fan";
    protected boolean isOn;

    public String getDeviceName()
    {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public abstract void breakDevice();

}
