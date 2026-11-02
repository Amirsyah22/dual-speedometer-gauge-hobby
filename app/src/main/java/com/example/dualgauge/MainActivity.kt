package com.example.dualgauge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rpmGauge = findViewById<AnalogGaugeView>(R.id.rpmGauge)
        rpmGauge.setValue(76000f)
        rpmGauge.setMaximumValue(100000f)
        rpmGauge.setScaleMax(10f)
        rpmGauge.setUnitLabel("RPM")
        rpmGauge.setWarningLimit(85000f)

        val speedGauge = findViewById<AnalogGaugeView>(R.id.speedGauge)
        speedGauge.setValue(96f)
        speedGauge.setMaximumValue(140f)
        speedGauge.setScaleMax(140f)
        speedGauge.setUnitLabel("km/h")
        speedGauge.setWarningLimit(120f)
    }
}
