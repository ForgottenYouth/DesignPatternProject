/*
 * Copyright (C), 2015-2020, 物联云仓科技有限公司
 * FileName: Bus
 * Author: shiwenliang
 * Date: 2020/9/11 15:48
 * Description: 公共汽车
 */
package com.leon.designpatterns.factory.java;


import android.util.Log;

public class VehicleAudi extends Vehicle {

    private static final String TAG = VehicleAudi.class.getSimpleName();

    @Override
    public String run() {
        return "java----生产的----奥迪车";
    }
}