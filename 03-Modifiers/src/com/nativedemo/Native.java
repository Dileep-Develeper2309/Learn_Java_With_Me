package com.nativedemo;

public class Native {
    static{
        System.loadLibrary("nativelibrary");
    }

    public native void method1();
}
