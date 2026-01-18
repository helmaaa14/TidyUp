package com.tidyup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tidyup.ui.theme.*

@Composable
fun LoginScreen(onLoginSuccess: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(JetStream)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "🌱",
                fontSize = 80.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "TidyUp!",
                fontSize = 42.sp,
                fontWeight = FontWeight.Bold,
                color = DarkElectricBlue
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Clean More, Play More",
                fontSize = 16.sp,
                color = JapaneseIndigo.copy(alpha = 0.7f)
            )

            Spacer(modifier = Modifier.height(64.dp))

            Text(
                text = "Mulai perjalanan eco-friendly kamu!",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = JapaneseIndigo,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Google Sign-In Button (UI Only)
            Button(
                onClick = { onLoginSuccess() },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp),
                elevation = ButtonDefaults.buttonElevation(4.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "🌐",
                        fontSize = 24.sp
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Masuk dengan Google",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = JapaneseIndigo
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Guest Mode
            TextButton(
                onClick = { onLoginSuccess() }
            ) {
                Text(
                    text = "Lanjut sebagai Tamu",
                    color = DarkElectricBlue,
                    fontSize = 14.sp
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Prototype by Helma Afifah (230104040215)",
                fontSize = 11.sp,
                color = JapaneseIndigo.copy(alpha = 0.5f),
                textAlign = TextAlign.Center
            )
        }
    }
}