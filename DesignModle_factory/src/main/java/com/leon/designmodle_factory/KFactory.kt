/*
* Copyright (C), 2015-2020, 物联云仓科技有限公司
* FileName: Factory
* Author: shiwenliang
* Date: 2020/9/15 11:01
* Description: 工厂模式-工厂
*/
package com.leon.designmodle_factory

abstract class KFactory {

    abstract  fun <T > createVehicle(): T
}