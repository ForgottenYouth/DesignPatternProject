/*
 * Copyright (C), 2015-2020, 物联云仓科技有限公司
 * FileName: AbstractProduce
 * Author: shiwenliang
 * Date: 2020/9/16 10:58
 * Description: 抽象产品
 */
package com.leon.designpatterns.abstractfacory.java;

public abstract class AbstractProduct {

    public String productName;

    public abstract String getProductName();
}