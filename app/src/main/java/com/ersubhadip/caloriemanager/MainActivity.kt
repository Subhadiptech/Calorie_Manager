package com.ersubhadip.caloriemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ersubhadip.caloriemanager.ui.theme.CalorieManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalorieManagerTheme {

            }
        }
    }
}
