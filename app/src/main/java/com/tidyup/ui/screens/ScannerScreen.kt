package com.tidyup.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun ScannerScreen() {
    var isScanning by remember { mutableStateOf(false) }
    var scanResult by remember { mutableStateOf<ScanResult?>(null) }
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F9F8))
            .padding(16.dp)
    ) {
        // Header
        Text(
            text = "SnapSort",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = DarkElectricBlue
        )
        Text(
            text = "Scan sampahmu untuk pilah otomatis",
            fontSize = 14.sp,
            color = JapaneseIndigo.copy(alpha = 0.7f)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Camera Preview (Mock)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = JetStream)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                if (scanResult != null) {
                    // Show Result
                    ScanResultContent(scanResult!!) {
                        scanResult = null
                    }
                } else {
                    // Camera Viewfinder Mock
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(32.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(200.dp)
                                .border(3.dp, DarkElectricBlue, RoundedCornerShape(16.dp))
                                .padding(16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "📸",
                                fontSize = 80.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        Text(
                            text = if (isScanning) "Scanning..." else "Arahkan kamera ke sampah",
                            fontSize = 16.sp,
                            color = JapaneseIndigo,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        if (scanResult == null) {
            // Scan Button
            Button(
                onClick = {
                    isScanning = true
                    // Simulate scanning
                    scope.launch {
                        delay(1500)
                        scanResult = ScanResult(
                            type = "Plastik",
                            confidence = 92,
                            coinsEarned = 15
                        )
                        isScanning = false
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DarkElectricBlue
                ),
                enabled = !isScanning
            ) {
                Text(
                    text = if (isScanning) "Scanning..." else "📷 Scan Sekarang",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Info Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Opal.copy(alpha = 0.3f)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "💡", fontSize = 24.sp)
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Scan limit: 20/hari • Akurasi: >85%",
                    fontSize = 12.sp,
                    color = JapaneseIndigo
                )
            }
        }
    }
}

data class ScanResult(
    val type: String,
    val confidence: Int,
    val coinsEarned: Int
)

@Composable
fun ScanResultContent(result: ScanResult, onDismiss: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(32.dp)
    ) {
        Text(
            text = "✅",
            fontSize = 64.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Terdeteksi!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = DarkElectricBlue
        )

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = getEmojiForType(result.type),
                    fontSize = 48.sp
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = result.type,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkElectricBlue
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Confidence: ${result.confidence}%",
                    fontSize = 14.sp,
                    color = JapaneseIndigo.copy(alpha = 0.7f)
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Card(
            colors = CardDefaults.cardColors(containerColor = DarkElectricBlue)
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "🪙", fontSize = 24.sp)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "+${result.coinsEarned} EcoCoins",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onDismiss,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = DarkElectricBlue)
        ) {
            Text("Scan Lagi")
        }
    }
}

fun getEmojiForType(type: String): String {
    return when (type) {
        "Plastik" -> "🥤"
        "Kertas" -> "📄"
        "Logam" -> "🥫"
        "Kaca" -> "🍾"
        else -> "🗑️"
    }
}