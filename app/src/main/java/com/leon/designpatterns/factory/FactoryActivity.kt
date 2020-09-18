package com.leon.designpatterns.factory

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.leon.designpatterns.R
import com.leon.designpatterns.factory.java.Factory
import com.leon.designpatterns.factory.java.FactoryAudi
import com.leon.designpatterns.factory.java.VehicleAudi
import com.leon.designpatterns.factory.kotlin.KFactory
import com.leon.designpatterns.factory.kotlin.KFactoryBenChi
import com.leon.designpatterns.factory.kotlin.KVehicle
import com.leon.designpatterns.factory.kotlin.KVehicleBenChi
import kotlinx.android.synthetic.main.activity_factory_layout.view.*

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
            R.id.java_test -> {
                var javaFactory: Factory = FactoryAudi();
                var audi: VehicleAudi =
                    javaFactory.createVehicle(VehicleAudi::class.java) as VehicleAudi
                javaResultView.setText(audi.run())
            }

            R.id.kotlin_test -> {
                var kotlinFactory: KFactory = KFactoryBenChi()
                var benChi: KVehicleBenChi = kotlinFactory.createVehicle() as KVehicleBenChi
                kotlinResultView.setText(benChi.run())
            }
        }
    }

}