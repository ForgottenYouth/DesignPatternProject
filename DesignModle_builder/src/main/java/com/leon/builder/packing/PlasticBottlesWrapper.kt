/*
* FileName: PlasticBottlesWrapper
* Author: shiwenliang
* Date: 2020/9/27 17:26
* Description: 塑料杯
*/
package com.leon.builder.packing

class PlasticBottlesWrapper : Wrapper() {
    override fun getPick(): String {
        return "塑料杯"
    }

    override fun getPrice(): String {
        return "免费"
    }
}