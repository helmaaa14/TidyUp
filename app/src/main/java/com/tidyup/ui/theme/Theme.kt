package com.tidyup.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Jet Stream Color Palette
val JetStream = Color(0xFFC0D5CE)
val Opal = Color(0xFFA0C8C4)
val DarkElectricBlue = Color(0xFF507579)
val JapaneseIndigo = Color(0xFF304544)
val MediumJungleGreen = Color(0xFF1B3033)

// Light Theme Colors
private val LightColorScheme = lightColorScheme(
    primary = DarkElectricBlue,
    onPrimary = Color.White,
    secondary = Opal,
    onSecondary = JapaneseIndigo,
    tertiary = JetStream,
    background = Color(0xFFF5F9F8),
    surface = JetStream,
    onSurface = JapaneseIndigo,
    surfaceVariant = Opal,
    onSurfaceVariant = MediumJungleGreen
)

@Composable
fun TidyUpTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography(),
        content = content
    )
}