package com.wipro.java.designpattern.singleton;

public final class SingletonMultithreaded {
	private static SingletonMultithreaded instance;
    public String value;

    private SingletonMultithreaded(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonMultithreaded getInstance(String value) {
        if (instance == null) {
            instance = new SingletonMultithreaded(value);
        }
        return instance;
    }
}
