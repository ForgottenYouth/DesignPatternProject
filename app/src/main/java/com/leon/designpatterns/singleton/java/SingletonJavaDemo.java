package com.leon.designpatterns.singleton.java;

import android.util.Log;

/*
* TODO java 单例模式---双向锁定
*/
public class SingletonJavaDemo {


    private static final String TAG = SingletonJavaDemo.class.getSimpleName();
    private volatile static SingletonJavaDemo instance;
    private static final Object syncRoot = new Object();

    public static SingletonJavaDemo getInstance() {
        //双重锁定
        if(instance == null) {
            synchronized (syncRoot) {
                if(instance == null) {
                    instance = new SingletonJavaDemo();
                }
            }
        }
        return instance;
    }

    private void showSelf(){
        Log.e(TAG, "showSelf: "+instance.toString());
    }

}