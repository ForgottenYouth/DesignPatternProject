/*
 * Copyright (C), 2015-2020, 物联云仓科技有限公司
 * FileName: FactoryOpera
 * Author: shiwenliang
 * Date: 2020/9/16 15:26
 * Description: 工厂的管理
 */
package com.leon.designpatterns.abstractfacory.java;

public class FactoryOpera  {

    public AbstractFactory createFactory(String name) {
        if (name.equals("FactoryNFSQ")) {
            return new FactoryNFSQ();
        }
        return null;
    }
}