package com.leon.designmodle_factory

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FactoryActivity : AppCompatActivity() {

    private lateinit var javaResultView: TextView;
    lateinit var kotlinResultView: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory_layout);

        javaResultView = findViewById(R.id.java_result)

        kotlinResultView = findViewById(R.id.kotlin_result)

    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.kotlin_test -> {
                var kotlinFactory: KFactory = KFactoryBenChi()
                var benChi: KVehicleBenChi = kotlinFactory.createVehicle() as KVehicleBenChi
                kotlinResultView.setText(benChi.run())
            }
        }
    }

}