package com.bendingspoons.ascolto.ui.force_update

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bendingspoons.ascolto.R
import com.bendingspoons.base.extensions.setDarkStatusBar

class ForceUpdateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.force_update_activity)
        setDarkStatusBar(resources.getColor(R.color.colorPrimary))
    }
}