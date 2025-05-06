package com.aufarizazakipradana607062330127.asesment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.aufarizazakipradana607062330127.asesment2.navigation.SetupNavGraph
import com.aufarizazakipradana607062330127.asesment2.ui.theme.AppTheme
import com.aufarizazakipradana607062330127.asesment2.util.SettingsDataStore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dataStore = SettingsDataStore(this)

        setContent {
            val isDarkTheme by dataStore.themeFlow.collectAsState(initial = false)

            AppTheme(isDarkTheme = isDarkTheme) {
                SetupNavGraph()
            }
        }
    }
}






