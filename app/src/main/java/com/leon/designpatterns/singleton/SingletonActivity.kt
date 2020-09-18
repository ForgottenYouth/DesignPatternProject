package com.leon.designpatterns.singleton

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.leon.designpatterns.R
import com.leon.designpatterns.singleton.java.SingletonJavaDemo
import com.leon.designpatterns.singleton.kotlin.SingletonTest

/*
* TODO 单例模式
*/
class SingletonActivity : AppCompatActivity() {

    lateinit var KotlinTextView : TextView ;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singleton_layout)

        KotlinTextView=findViewById(R.id.kotlin_result);
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.java_test -> {
                val result = testJavaSingleton(
                    SingletonJavaDemo.getInstance().toString(),
                    SingletonJavaDemo.getInstance().toString()
                )
                Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
            }

            R.id.kotlin_test->{
                KotlinTextView.setText(SingletonTest.main())
            }
        }
    }

    /*
    * TODO 测试java单例
    */
    fun testJavaSingleton(SingletonOne: String, SingletonTwo: String): String {
        return if (SingletonOne.compareTo(SingletonTwo) == 0) {
            "只有一个实例";
        } else {
            "有多个实例";
        };
    }
}