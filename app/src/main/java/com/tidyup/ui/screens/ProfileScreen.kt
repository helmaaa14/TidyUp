package com.tidyup.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tidyup.ui.theme.*

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F9F8))
    ) {
        // Header with gradient background
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(JetStream)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            // Profile Picture
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(Opal),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "👤",
                    fontSize = 40.sp
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Helma Afifah",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = DarkElectricBlue
            )

            Text(
                text = "230104040215",
                fontSize = 13.sp,
                color = JapaneseIndigo.copy(alpha = 0.7f)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Level Badge
            Surface(
                shape = RoundedCornerShape(20.dp),
                color = DarkElectricBlue
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "⭐", fontSize = 16.sp)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Level 3 • Recycle Ranger",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // XP Progress
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "320 / 500 XP",
                        fontSize = 12.sp,
                        color = JapaneseIndigo
                    )
                    Text(
                        text = "180 XP to Level 4",
                        fontSize = 12.sp,
                        color = JapaneseIndigo.copy(alpha = 0.7f)
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                LinearProgressIndicator(
                    progress = 0.64f,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(8.dp),
                    color = DarkElectricBlue,
                    trackColor = Opal
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // EcoStats
            Text(
                text = "EcoStats",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = DarkElectricBlue
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                EcoStatCard(
                    emoji = "♻️",
                    value = "45.2 kg",
                    label = "Sampah Terpilah",
                    modifier = Modifier.weight(1f)
                )
                EcoStatCard(
                    emoji = "🌱",
                    value = "23 kg",
                    label = "CO₂ Prevented",
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Badges
            Text(
                text = "Badge Collection",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = DarkElectricBlue
            )

            Spacer(modifier = Modifier.height(12.dp))

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(listOf("🥇", "🌟", "🎯", "⚡", "🏆", "💪")) { emoji ->
                    BadgeItem(emoji)
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Settings Options
            Text(
                text = "Pengaturan",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = DarkElectricBlue
            )

            Spacer(modifier = Modifier.height(12.dp))

            SettingItem(emoji = "🔔", title = "Notifikasi", subtitle = "Atur preferensi notifikasi")
            Spacer(modifier = Modifier.height(8.dp))
            SettingItem(emoji = "📍", title = "Lokasi", subtitle = "Palangkaraya, Kalimantan Tengah")
            Spacer(modifier = Modifier.height(8.dp))
            SettingItem(emoji = "ℹ️", title = "Tentang Aplikasi", subtitle = "Versi 1.0.0 MVP")
            Spacer(modifier = Modifier.height(8.dp))
            SettingItem(emoji = "🚪", title = "Keluar", subtitle = "Logout dari akun", isLogout = true)
        }
    }
}

@Composable
fun EcoStatCard(emoji: String, value: String, label: String, modifier: Modifier = Modifier) {
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
            Text(text = emoji, fontSize = 32.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = value,
                fontSize = 20.sp,
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

@Composable
fun BadgeItem(emoji: String) {
    Card(
        modifier = Modifier.size(70.dp),
        colors = CardDefaults.cardColors(containerColor = Opal),
        shape = RoundedCornerShape(12.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = emoji, fontSize = 32.sp)
        }
    }
}

@Composable
fun SettingItem(emoji: String, title: String, subtitle: String, isLogout: Boolean = false) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = if (isLogout) Color(0xFFFFEBEE) else JetStream
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = emoji, fontSize = 24.sp)
            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = if (isLogout) Color(0xFFD32F2F) else DarkElectricBlue
                )
                Text(
                    text = subtitle,
                    fontSize = 12.sp,
                    color = if (isLogout)
                        Color(0xFFD32F2F).copy(alpha = 0.7f)
                    else JapaneseIndigo.copy(alpha = 0.7f)
                )
            }

            Text(
                text = "›",
                fontSize = 24.sp,
                color = JapaneseIndigo.copy(alpha = 0.5f)
            )
        }
    }
}