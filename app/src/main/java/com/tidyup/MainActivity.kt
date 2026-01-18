package com.tidyup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.tidyup.ui.theme.TidyUpTheme
import com.tidyup.navigation.TidyUpNavigation

/**
 * TidyUp! - Aplikasi Gamifikasi Pengurangan Sampah
 * Developer: Helma Afifah (230104040215)
 * Prototype MVP - Minimal Version
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TidyUpTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TidyUpNavigation()
                }
            }
        }
    }
}