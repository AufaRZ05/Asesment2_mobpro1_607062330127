package com.aufarizazakipradana607062330127.asesment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.aufarizazakipradana607062330127.asesment2.navigation.SetupNavGraph
import com.aufarizazakipradana607062330127.asesment2.ui.theme.Asesment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Asesment2Theme {
                SetupNavGraph()
            }
        }
    }
}





