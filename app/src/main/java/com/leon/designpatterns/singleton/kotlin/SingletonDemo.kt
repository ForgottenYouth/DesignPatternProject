package com.leon.designpatterns.singleton.kotlin

/**
 * TODO 单例模式（Singleton），保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *    1. 何时使用
 *    当我们想控制实例数目，节省系统资源时，可以使用单例模式。
 *    2. 优点
 *    内存中只有一个实例，减少了内存开支，尤其一个对象需要频繁地创建销毁，而此时性能又无法优化时，单例模式的优势就非常明显。
 *    避免对资源的多重占用（比如写文件操作，只有一个实例时，避免对同一个资源文件同时写操作），简单来说就是对唯一实例的受控访问。
 *    3. 缺点
 *    没有接口，不能继承，与单一职责冲突。
 *    4. 使用场景
 *    要求生成唯一序列号的环境。
 *    在整个项目中有一个共享访问点或共享数据（如web页面上的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来即可）。
 *    创建一个对象需要消耗的资源过多时（如访问I/O和数据库等资源）。
 *    5. 应用实例
 *    一个党只有一个主席/一个国家只有一个国王/一个皇朝只有一个皇帝。
 *    计划生育。
 *    多个进程或线程同时操作一个文件的现象。
 *
 */

//使用Object
object SingletonObject {
    fun show(): String {
        return this.toString()
    }
}

//懒汉方式的，双重锁---存在线程安全   TODO 知识点： 主构造，伴生对象
class Singleton private constructor(){
    companion object{
        private var instance : Singleton?= null
        get() {
            if (field == null){
                field=
                    Singleton();
            }
            return field;
        }

        fun getSingletonInstance(): Singleton {
            return instance!!;
        }
    }

    fun show(): String {
        return instance.toString()
    }
}

//线程安全的单例，使用lazy    TODO  知识点：高阶函数   委托属性
class SingletonLazy private constructor(){
    companion object{
        val instance: SingletonLazy by lazy (mode = LazyThreadSafetyMode.SYNCHRONIZED){
            SingletonLazy()
        }
    }

    /*
    * TODO 测试方法
    */
    fun show(): String {
        return instance.toString()
    }
}



object SingletonTest{

    fun main():String {


        var result :String =""

        result+=SingletonObject.show()+"\n";
        result+=SingletonObject.show()+"\n";
        result+="\n\n"

        result+=Singleton.getSingletonInstance()
            .show()+"\n";
        result+=Singleton.getSingletonInstance()
            .show()+"\n";

        result+="\n\n"


        result+=SingletonLazy.instance.show()+"\n";
        result+=SingletonLazy.instance.show()+"\n";


        return result

    }
}

