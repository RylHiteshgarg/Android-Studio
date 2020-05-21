package com.delta.abstraction;

import java.util.ArrayList;
import java.util.List;

import sun.rmi.runtime.Log;

public class Switch {

    private List<Switchable> switchableList = new ArrayList<Switchable>();

    public void wireUp(Switchable thing) {
        switchableList.add(thing);
    }

    public void unWire(Switchable thing) {
        switchableList.remove(thing);
    }

    public void flipUp() {
        for (Switchable thing: switchableList) {
            thing.turnOn();
        }
    }

    public void flipDown() {
        for (Switchable thing: switchableList) {
            thing.turnOff();
        }
    }
}
