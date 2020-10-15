/*
* Copyright (C), 2015-2020, 物联云仓科技有限公司
* FileName: FactoryBenChi
* Author: shiwenliang
* Date: 2020/9/15 11:19
* Description: 奔驰工厂
*/
package com.leon.designmodle_factory

class KFactoryBenChi : KFactory() {

    override fun <T> createVehicle(): T {
        return KVehicleBenChi() as T
    }
}