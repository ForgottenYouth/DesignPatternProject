/*
 * Copyright (C), 2015-2020, 物联云仓科技有限公司
 * FileName: AudiFactory
 * Author: shiwenliang
 * Date: 2020/9/11 15:52
 * Description: 奥迪汽车厂
 */
package com.leon.designpatterns.factory.java;

import android.util.Log;

import org.jetbrains.annotations.NotNull;

/*
* TODO 奥迪汽车工厂
*/
public class FactoryAudi extends Factory {

    private static final String TAG = FactoryAudi.class.getSimpleName();

    @Override
    public <T extends Vehicle> T createVehicle(@NotNull Class<T> aClass) {
        Vehicle vehicle = null;
        try{
            vehicle=(Vehicle)Class.forName(aClass.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)vehicle;
    }

    @Override
    public void callBackVehicle(Class<?> callback) {
        Log.e(TAG, "callBackVehicle: "+callback.getName());
    }
}