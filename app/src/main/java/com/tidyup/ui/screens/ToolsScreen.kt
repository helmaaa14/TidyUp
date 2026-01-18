package com.tidyup.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
fun ToolsScreen() {
    var selectedTab by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F9F8))
    ) {
        // Header with Tabs
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(JetStream)
                .padding(16.dp)
        ) {
            Text(
                text = "Tools",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = DarkElectricBlue
            )

            Spacer(modifier = Modifier.height(16.dp))

            TabRow(
                selectedTabIndex = selectedTab,
                containerColor = Color.Transparent,
                contentColor = DarkElectricBlue,
                indicator = { }
            ) {
                Tab(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .background(
                            if (selectedTab == 0) Color.White else Color.Transparent,
                            RoundedCornerShape(8.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "🚛", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "PickUp",
                            fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Normal
                        )
                    }
                }

                Tab(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    modifier = Modifier
                        .background(
                            if (selectedTab == 1) Color.White else Color.Transparent,
                            RoundedCornerShape(8.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "🥗", fontSize = 20.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "FreshLog",
                            fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Normal
                        )
                    }
                }
            }
        }

        // Content
        when (selectedTab) {
            0 -> PickUpContent()
            1 -> FreshLogContent()
        }
    }
}

@Composable
fun PickUpContent() {
    val schedules = listOf(
        PickUpSchedule("Organik", "Senin & Kamis", "07:00", "🍂"),
        PickUpSchedule("Anorganik", "Selasa & Jumat", "07:00", "♻️"),
        PickUpSchedule("B3/E-waste", "Sabtu", "08:00", "⚠️")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Jadwal Pengangkutan",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = DarkElectricBlue
        )

        Text(
            text = "Atur reminder sampahmu",
            fontSize = 14.sp,
            color = JapaneseIndigo.copy(alpha = 0.7f)
        )

        Spacer(modifier = Modifier.height(16.dp))

        schedules.forEach { schedule ->
            ScheduleCard(schedule)
            Spacer(modifier = Modifier.height(12.dp))
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = DarkElectricBlue)
        ) {
            Text("➕ Tambah Jadwal", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    }
}

data class PickUpSchedule(
    val category: String,
    val days: String,
    val time: String,
    val emoji: String
)

@Composable
fun ScheduleCard(schedule: PickUpSchedule) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = JetStream),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = schedule.emoji, fontSize = 32.sp)
            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = schedule.category,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkElectricBlue
                )
                Text(
                    text = schedule.days,
                    fontSize = 13.sp,
                    color = JapaneseIndigo.copy(alpha = 0.7f)
                )
                Text(
                    text = "⏰ ${schedule.time}",
                    fontSize = 12.sp,
                    color = JapaneseIndigo.copy(alpha = 0.6f)
                )
            }

            Switch(
                checked = true,
                onCheckedChange = { }
            )
        }
    }
}

@Composable
fun FreshLogContent() {
    val foodItems = listOf(
        FoodItem("🥩 Daging Sapi", "2 hari lagi", true),
        FoodItem("🥛 Susu UHT", "5 hari lagi", false),
        FoodItem("🥬 Sayur Bayam", "1 hari lagi", true),
        FoodItem("🍎 Apel Fuji", "1 minggu lagi", false),
        FoodItem("🧀 Keju Cheddar", "3 hari lagi", false)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFFE5E5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "⚠️", fontSize = 24.sp)
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        text = "Segera Habiskan!",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFD32F2F)
                    )
                    Text(
                        text = "2 item akan kedaluwarsa",
                        fontSize = 12.sp,
                        color = Color(0xFFD32F2F).copy(alpha = 0.7f)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Inventaris Pantry",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = DarkElectricBlue
        )

        Spacer(modifier = Modifier.height(12.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.weight(1f)
        ) {
            items(foodItems) { item ->
                FoodItemCard(item)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = DarkElectricBlue)
        ) {
            Text("➕ Tambah Item", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    }
}

data class FoodItem(
    val name: String,
    val expiryText: String,
    val isUrgent: Boolean
)

@Composable
fun FoodItemCard(item: FoodItem) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = if (item.isUrgent)
                Color(0xFFFFEBEE) else JetStream
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = item.name.split(" ")[0], fontSize = 28.sp)
            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = item.name.substringAfter(" "),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = DarkElectricBlue
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (item.isUrgent) {
                        Text(text = "⚠️", fontSize = 12.sp)
                        Spacer(modifier = Modifier.width(4.dp))
                    }
                    Text(
                        text = item.expiryText,
                        fontSize = 12.sp,
                        color = if (item.isUrgent)
                            Color(0xFFD32F2F) else JapaneseIndigo.copy(alpha = 0.7f)
                    )
                }
            }

            IconButton(onClick = { }) {
                Text(text = "🗑️", fontSize = 20.sp)
            }
        }
    }
}