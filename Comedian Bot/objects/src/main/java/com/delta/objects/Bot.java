package com.delta.objects;
import android.util.Log;
import sun.rmi.runtime.Log;

public class Bot {

    public final static String createName = "Spawrks";

    private String name = "ROBOT";


    public String talk(String what)
        Log.e(getName(),what);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
