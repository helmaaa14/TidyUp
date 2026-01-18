package com.tidyup.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tidyup.ui.theme.*

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F9F8))
            .padding(16.dp)
    ) {
        // Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "TidyLand",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkElectricBlue
                )
                Text(
                    text = "Selamat datang kembali! 👋",
                    fontSize = 14.sp,
                    color = JapaneseIndigo.copy(alpha = 0.7f)
                )
            }

            // Coins Display
            Surface(
                shape = RoundedCornerShape(20.dp),
                color = Opal,
                modifier = Modifier.padding(4.dp)
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "🪙", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "250",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = DarkElectricBlue
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Island Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = JetStream)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "🏝️",
                    fontSize = 80.sp
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Pulau Pertama",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkElectricBlue
                )
                Spacer(modifier = Modifier.height(8.dp))

                // Health Bar
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Health: 65%",
                        fontSize = 12.sp,
                        color = JapaneseIndigo.copy(alpha = 0.7f)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    LinearProgressIndicator(
                        progress = 0.65f,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(8.dp),
                        color = DarkElectricBlue,
                        trackColor = Opal
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Level 3 • Recycle Ranger",
                    fontSize = 14.sp,
                    color = JapaneseIndigo
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Quick Stats
        Text(
            text = "Statistik Hari Ini",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = DarkElectricBlue
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            StatCard(
                emoji = "♻️",
                value = "8",
                label = "Sampah Pilah",
                modifier = Modifier.weight(1f)
            )
            StatCard(
                emoji = "🎯",
                value = "320",
                label = "XP Hari Ini",
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Daily Challenge Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Opal),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "🎮", fontSize = 32.sp)
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        text = "Daily Challenge",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = DarkElectricBlue
                    )
                    Text(
                        text = "Pilah 10 sampah hari ini",
                        fontSize = 12.sp,
                        color = JapaneseIndigo.copy(alpha = 0.7f)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "8/10",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkElectricBlue
                )
            }
        }
    }
}

@Composable
fun StatCard(emoji: String, value: String, label: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = JetStream),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = emoji, fontSize = 28.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = value,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = DarkElectricBlue
            )
            Text(
                text = label,
                fontSize = 11.sp,
                color = JapaneseIndigo.copy(alpha = 0.7f)
            )
        }
    }
}