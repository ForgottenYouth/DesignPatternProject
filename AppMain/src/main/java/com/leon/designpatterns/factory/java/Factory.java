package com.leon.designpatterns.factory.java;

/*
* TODO 工厂抽象
*/
public abstract class Factory {

    /*
    * TODO 生产车
    */
    public abstract <T extends Vehicle> T createVehicle(Class<T> c);

    /*
    * TODO 召回
    */
    public abstract void callBackVehicle(Class<?> callback);
}
