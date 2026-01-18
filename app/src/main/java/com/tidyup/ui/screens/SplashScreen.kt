package com.tidyup.ui.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tidyup.ui.theme.DarkElectricBlue
import com.tidyup.ui.theme.JetStream
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNavigate: () -> Unit) {
    var scale by remember { mutableStateOf(0.5f) }

    val animatedScale by animateFloatAsState(
        targetValue = scale,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        ),
        label = "scale"
    )

    LaunchedEffect(Unit) {
        scale = 1f
        delay(2000)
        onNavigate()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(JetStream),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.scale(animatedScale)
        ) {
            Text(
                text = "🌱",
                fontSize = 80.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "TidyUp!",
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = DarkElectricBlue
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Clean More, Play More",
                fontSize = 16.sp,
                color = DarkElectricBlue.copy(alpha = 0.7f)
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "by Helma Afifah",
                fontSize = 12.sp,
                color = DarkElectricBlue.copy(alpha = 0.5f)
            )
            Text(
                text = "230104040215",
                fontSize = 12.sp,
                color = DarkElectricBlue.copy(alpha = 0.5f)
            )
        }
    }
}