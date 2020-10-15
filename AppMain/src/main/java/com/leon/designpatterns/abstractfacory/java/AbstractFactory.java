/*
 * Copyright (C), 2015-2020, 物联云仓科技有限公司
 * FileName: AbstractFactory
 * Author: shiwenliang
 * Date: 2020/9/16 10:54
 * Description: 抽象工厂
 */
package com.leon.designpatterns.abstractfacory.java;

public abstract class AbstractFactory {
    public abstract String getFactroyName();

    public abstract AbstractProduct createWaterProduct();
}