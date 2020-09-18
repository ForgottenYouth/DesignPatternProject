/*
 * Copyright (C), 2015-2020, 物联云仓科技有限公司
 * FileName: FactvoryNFSQ
 * Author: shiwenliang
 * Date: 2020/9/16 10:56
 * Description: 农夫山泉工厂
 */
package com.leon.designpatterns.abstractfacory.java;

import org.jetbrains.annotations.NotNull;

public class FactoryNFSQ extends AbstractFactory {

    @Override
    public String getFactroyName() {
        return "品牌：农夫山泉";
    }

    @NotNull
    @Override
    public AbstractProduct createWaterProduct() {
        return new ProductNFSQ();
    }
}