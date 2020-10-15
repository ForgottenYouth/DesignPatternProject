/*
* Copyright (C), 2015-2020, 物联云仓科技有限公司
* FileName: AbstractFactoryActivity
* Author: shiwenliang
* Date: 2020/9/16 15:28
* Description: 抽象工厂模型
*/
package com.leon.designpatterns.abstractfacory

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.leon.designpatterns.R
import com.leon.designpatterns.abstractfacory.java.AbstractFactory
import com.leon.designpatterns.abstractfacory.java.FactoryOpera

class AbstractFactoryActivity :AppCompatActivity(){

    val TAG : String = AbstractFactoryActivity::class.simpleName.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstractfactory_layout)


        var factoryOpera : FactoryOpera = FactoryOpera()
        var factory :AbstractFactory = factoryOpera.createFactory("FactoryNFSQ")

        var value = factory.factroyName;
        Log.e(TAG, "onCreate: $value" )
    }
}