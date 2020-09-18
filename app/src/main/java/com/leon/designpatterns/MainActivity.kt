package com.leon.designpatterns

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.leon.designpatterns.abstractfacory.AbstractFactoryActivity
import com.leon.designpatterns.factory.FactoryActivity
import com.leon.designpatterns.singleton.SingletonActivity

/*
* TODO 主入口
*/
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.sigleton_design -> {
                //单例模式
                val intent = Intent(this, SingletonActivity().javaClass);
                this.startActivity(intent)
            }
            R.id.factory_design -> {
                //工厂模式
                val intent = Intent(this, FactoryActivity::class.java);
                this.startActivity(intent);
            }
            R.id.abstractfactory->{
                //抽象工厂模式
                val intent = Intent(this, AbstractFactoryActivity::class.java);
                this.startActivity(intent);
            }
        }
    }
}