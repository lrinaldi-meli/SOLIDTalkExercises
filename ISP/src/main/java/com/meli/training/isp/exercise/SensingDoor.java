package com.meli.training.isp.exercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SensingDoor implements Door {
    private boolean locked;
    private boolean opened;

    public SensingDoor(Sensor sensor) {
        sensor.register(this);
    }

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {
        locked = false;
    }

    @Override
    public void open() {
        if (!locked) {
            opened = true;
        }
    }

    @Override
    public void close() {
        opened = false;
    }

    @Override
    public void timeOutCallback() {
        throw new NotImplementedException();
    }

    @Override
    public void proximityCallback() {
        opened = true;
    }
}
