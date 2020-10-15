/*
* Copyright (C), 2015-2020, 物联云仓科技有限公司
* FileName: SampleFactory
* Author: shiwenliang
* Date: 2020/9/15 17:21
* Description: 简单工厂模式
*/
package com.leon.designpatterns.samplefactory

/*
* TODO 抽象工厂
*/
class SampleFactory {
    
    /*
    * TODO 使用伴生对象，类似于static , 可以直接调用工厂方法
    */
    companion object {
        val APPLE = "Apple"
        val PEAR = "Pear"
        val BANNER = "Banner"

        fun createFruits(type: String): String {
           var result  =  when (type) {
                APPLE -> {
                    val apple : Apple = Apple().createFruit(type) as Apple
                    apple.showSelf()
                }
                PEAR -> {
                    val pear : Pear = Pear().createFruit(type) as Pear
                    pear.showSelf()
                }
               else->{
                   "not found fruit"
               }

            }
            return result
        }
    }
}

/*
* TODO 水果的抽象类
*/
abstract class Fruit{

    abstract fun createFruit(name:String):Fruit?

    abstract fun showSelf():String
}

/*
* TODO 苹果
*/
class Apple : Fruit(){
    override fun createFruit(name: String): Fruit? {
        return Apple();
    }

    override fun showSelf(): String {
        return  Apple::class.simpleName.toString()
    }
}

/*
* TODO 梨
*/
class Pear : Fruit(){
    override fun createFruit(name: String): Fruit? {
        return Pear()
    }

    override fun showSelf(): String {
        return Pear::class.simpleName.toString()
    }
}

fun main() {

    println(SampleFactory.createFruits(SampleFactory.APPLE))

    println(SampleFactory.createFruits(SampleFactory.PEAR))

}