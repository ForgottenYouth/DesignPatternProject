/*
* FileName: BoxWrapper
* Author: shiwenliang
* Date: 2020/9/27 17:24
* Description: 箱包装
*/
package com.leon.builder.packing

class BoxWrapper : Wrapper() {
    override fun getPick(): String {
        return "纸箱"
    }

    override fun getPrice(): String {
        return "￥ 1.5"
    }
}