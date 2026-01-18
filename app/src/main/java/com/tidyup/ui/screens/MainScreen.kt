package com.tidyup.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

sealed class BottomNavItem(
    val route: String,
    val emoji: String,
    val title: String
) {
    object Home : BottomNavItem("home", "🏝️", "TidyLand")
    object Scanner : BottomNavItem("scanner", "📸", "Scan")
    object Tools : BottomNavItem("tools", "🛠️", "Tools")
    object Profile : BottomNavItem("profile", "👤", "Profile")
}

@Composable
fun MainScreen() {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Scanner,
        BottomNavItem.Tools,
        BottomNavItem.Profile
    )

    var selectedItem by remember { mutableStateOf<BottomNavItem>(BottomNavItem.Home) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEach { item ->
                    NavigationBarItem(
                        selected = selectedItem == item,
                        onClick = { selectedItem = item },
                        icon = {
                            Text(
                                text = item.emoji,
                                fontSize = 24.sp
                            )
                        },
                        label = {
                            Text(
                                text = item.title,
                                fontSize = 11.sp,
                                fontWeight = if (selectedItem == item)
                                    FontWeight.Bold else FontWeight.Normal
                            )
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            when (selectedItem) {
                BottomNavItem.Home -> HomeScreen()
                BottomNavItem.Scanner -> ScannerScreen()
                BottomNavItem.Tools -> ToolsScreen()
                BottomNavItem.Profile -> ProfileScreen()
            }
        }
    }
}