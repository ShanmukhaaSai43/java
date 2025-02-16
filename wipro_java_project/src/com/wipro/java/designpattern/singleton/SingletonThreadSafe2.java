package com.wipro.java.designpattern.singleton;

public final class SingletonThreadSafe2 {
	// The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile SingletonThreadSafe2 instance;

    public String value;

    SingletonThreadSafe2(String value) {
        this.value = value;
    }

    public static SingletonThreadSafe2 getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
    	SingletonThreadSafe2 result = instance;
        if (result != null) {
            return result;
        }
        synchronized(SingletonThreadSafe2.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe2(value);
            }
            return instance;
        }
    }
}
