/*
* Copyright (C), 2015-2020, 物联云仓科技有限公司
* FileName: VehicleBenChi
* Author: shiwenliang
* Date: 2020/9/15 11:47
* Description: 具体产品-奔驰车
*/
package com.leon.designpatterns.factory.kotlin

class KVehicleBenChi : KVehicle() {

    override fun run(): String {
        return "kotlin---生产---奔驰车"
    }
}