# 🌱 TidyUp! - MVP Prototype

<div align="center">

![TidyUp Logo](https://img.shields.io/badge/TidyUp!-Clean_More_Play_More-4CAF50?style=for-the-badge)
![Platform](https://img.shields.io/badge/Platform-Android-green?style=for-the-badge&logo=android)
![Kotlin](https://img.shields.io/badge/Kotlin-2.0.0-purple?style=for-the-badge&logo=kotlin)
![Compose](https://img.shields.io/badge/Jetpack_Compose-1.5-blue?style=for-the-badge)

**"Clean More, Play More"**

*Aplikasi Gamifikasi Pengurangan Sampah Rumah Tangga*

## 👨‍💻 Developer

**Nama:** Helma Afifah  
**NIM:** 230104040215  
**Kelas:** TI 23 A  
**GitHub:** [@helmaaa14](https://github.com/helmaaa14)

---

## 📱 Tentang Aplikasi

TidyUp! adalah aplikasi mobile Android yang mengubah kebiasaan memilah sampah menjadi pengalaman menyenangkan melalui gamifikasi. Versi MVP Prototype ini fokus pada **UI/UX modern** dan **navigasi dasar** sebagai foundation untuk pengembangan fitur lengkap.

### 🎯 Problem Statement
- Kurangnya motivasi masyarakat untuk memilah sampah
- Sampah rumah tangga tidak terkelola dengan baik
- Tidak ada sistem reward yang membuat pengelolaan sampah menarik
- Bingung membuang limbah berbahaya (e-waste, baterai)

### 💡 Solution
Aplikasi gamifikasi dengan pulau virtual yang berkembang seiring aktivitas pemilahan sampah, dilengkapi tools praktis untuk manajemen sampah harian.

---

## ✨ Fitur Utama

### MVP Prototype (v1.0.0)

| Screen | Description | Status |
|--------|-------------|--------|
| 🎬 **Splash Screen** | Animasi pembuka dengan branding TidyUp! | ✅ |
| 📖 **Onboarding** | 3 slide interaktif menjelaskan konsep | ✅ |
| 🔐 **Login** | UI modern untuk autentikasi | ✅ |
| 🏝️ **TidyLand (Home)** | Dashboard pulau virtual dengan statistik | ✅ |
| 📸 **SnapSort** | Interface AI scanner sampah | ✅ |
| 🛠️ **Tools** | PickUp schedule & FreshLog pantry | ✅ |
| 👤 **Profile** | Statistik, badges, dan pengaturan | ✅ |

### 🔮 Stretch Features (Future)
- 🤖 ML Kit integration untuk real camera scanning
- 🔥 Firebase Authentication & Firestore
- 💾 Room Database untuk offline support
- 🔔 Push notifications dengan WorkManager
- 🗺️ PassIt - Marketplace barang gratis lokal
- 📍 DropZone - Peta lokasi drop box limbah B3
- 💰 TrashCash - Buku tabungan sampah

---

## 🛠️ Tech Stack

### Frontend
```kotlin
• Kotlin 2.0.0
• Jetpack Compose + Material3
• Navigation Component
• MVVM Architecture (Ready)
```

### Design System
```
Color Palette: Jet Stream Theme
├─ Primary:    #507579 (Dark Electric Blue)
├─ Secondary:  #A0C8C4 (Opal)
├─ Background: #C0D5CE (Jet Stream)
├─ Text:       #304544 (Japanese Indigo)
└─ Accent:     #1B3033 (Medium Jungle Green)
```

### Development Tools
- Android Studio Hedgehog | 2023.1.1+
- Min SDK: 24 (Android 7.0)
- Target SDK: 34 (Android 14)
- Gradle: 8.2+

---

## 📁 Project Structure

```
TidyUp/
├── app/src/main/java/com/tidyup/
│   ├── MainActivity.kt
│   ├── ui/
│   │   ├── theme/
│   │   │   └── Theme.kt
│   │   └── screens/
│   │       ├── SplashScreen.kt
│   │       ├── OnboardingScreen.kt
│   │       ├── LoginScreen.kt
│   │       ├── MainScreen.kt
│   │       ├── HomeScreen.kt
│   │       ├── ScannerScreen.kt
│   │       ├── ToolsScreen.kt
│   │       └── ProfileScreen.kt
│   └── navigation/
│       └── Navigation.kt
├── build.gradle.kts
└── README.md
```

---

## 🚀 Installation

### Prerequisites
- Android Studio Hedgehog (2023.1.1) or newer
- JDK 17
- Android SDK (API 24-34)
- Kotlin 2.0.0

### Steps

1. **Clone repository**
```bash
git clone https://github.com/helmaaa14/TidyUp.git
cd TidyUp
```

2. **Open in Android Studio**
```
File → Open → Select TidyUp folder
```

3. **Sync Gradle**
```
Click "Sync Now" when prompted
```

4. **Run Application**
```
Connect device/emulator → Press Shift+F10
```

---

## 📸 Screenshots

*Coming soon - Add screenshots after app is running*

| Splash | Onboarding | Login | Home |
|--------|------------|-------|------|
| ![Splash](#) | ![Onboarding](#) | ![Login](#) | ![Home](#) |

---

## 🎨 Design Highlights

### Color System
```kotlin
val JetStream = Color(0xFFC0D5CE)        // Primary Background
val Opal = Color(0xFFA0C8C4)             // Secondary Highlights
val DarkElectricBlue = Color(0xFF507579) // Buttons & Accents
val JapaneseIndigo = Color(0xFF304544)   // Primary Text
val MediumJungleGreen = Color(0xFF1B3033)// Secondary Text
```

### Navigation Flow
```
Splash → Onboarding (3 slides) → Login → Main App
                                           ├─ Home (TidyLand)
                                           ├─ Scanner (SnapSort)
                                           ├─ Tools (PickUp & FreshLog)
                                           └─ Profile
```

---

## 🗓️ Development Timeline

### ✅ Phase 1: MVP Prototype (Week 1-2)
- [x] Project setup dengan Compose & Material3
- [x] Splash screen dengan animasi
- [x] Onboarding dengan horizontal pager
- [x] Login screen (UI only)
- [x] Bottom navigation dengan 4 tabs
- [x] Home screen dengan island visualization
- [x] Scanner screen dengan mock simulation
- [x] Tools screen (PickUp & FreshLog tabs)
- [x] Profile screen dengan stats & badges

### 🔄 Phase 2: Backend Integration (Week 3-4)
- [ ] Firebase Authentication
- [ ] Firestore Database
- [ ] Room Database untuk offline
- [ ] ML Kit Scanner integration

### 🚀 Phase 3: Advanced Features (Week 5+)
- [ ] Real-time notifications
- [ ] Social features
- [ ] Analytics dashboard
- [ ] Deployment ke Play Store

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

Feel free to check [issues page](https://github.com/helmaaa14/TidyUp/issues).

---

## 📝 License

This project is created for educational purposes.  
© 2026 Helma Afifah (230104040215)

---

## 🙏 Acknowledgments

- Material Design 3 by Google
- Jetpack Compose Documentation
- Anthropic Claude for development assistance
- Universitas Palangka Raya

---

<div align="center">

**Made with 💚 by Helma Afifah**

[![GitHub](https://img.shields.io/badge/GitHub-helmaaa14-181717?style=flat-square&logo=github)](https://github.com/helmaaa14)

*TidyUp! - Clean More, Play More* 🌱

</div>

### ✨ Fitur MVP Prototype

1. **🎬 Splash Screen** - Animasi pembuka dengan branding TidyUp!
2. **📖 Onboarding** - 3 slide interaktif menjelaskan konsep aplikasi
3. **🔐 Login Screen** - UI modern untuk autentikasi (UI only)
4. **🏝️ TidyLand (Home)** - Dashboard pulau virtual dengan statistik
5. **📸 SnapSort (Scanner)** - Interface AI scanner sampah (mock simulation)
6. **🛠️ Tools** - PickUp schedule & FreshLog pantry manager
7. **👤 Profile** - Statistik pengguna, badges, dan pengaturan

---

## 🛠️ Tech Stack

### Frontend
- **Kotlin** - 100% Kotlin
- **Jetpack Compose** - Modern declarative UI
- **Material3** - Material Design 3 components
- **Navigation Component** - Screen navigation

### Design System
- **Color Palette:** Jet Stream Theme
  - Primary: `#507579` (Dark Electric Blue)
  - Secondary: `#A0C8C4` (Opal)
  - Background: `#C0D5CE` (Jet Stream)

### Development Tools
- Android Studio (Latest version)
- Min SDK: 24 (Android 7.0)
- Target SDK: 34 (Android 14)

---

## 📁 Struktur File

```
TidyUp/
├── app/src/main/java/com/tidyup/
│   ├── MainActivity.kt
│   ├── ui/
│   │   ├── theme/
│   │   │   └── Theme.kt
│   │   └── screens/
│   │       ├── SplashScreen.kt
│   │       ├── OnboardingScreen.kt
│   │       ├── LoginScreen.kt
│   │       ├── MainScreen.kt
│   │       ├── HomeScreen.kt
│   │       ├── ScannerScreen.kt
│   │       ├── ToolsScreen.kt
│   │       └── ProfileScreen.kt
│   └── navigation/
│       └── Navigation.kt
└── build.gradle.kts
```

---

## 🚀 Cara Menjalankan

### Prasyarat
1. Install Android Studio (Hedgehog | 2023.1.1 atau lebih baru)
2. Install Android SDK dengan API Level 24-34
3. Kotlin plugin enabled

### Langkah-langkah

1. **Clone atau buat project baru**
```bash
# Buat project Android Studio baru dengan template "Empty Activity"
# Pilih Kotlin dan Jetpack Compose
```

2. **Copy semua file Kotlin**
   - Copy file-file dari artifact ke struktur folder yang sesuai
   - MainActivity.kt → MainActivity.kt
   - Theme.kt → ui/theme/Theme.kt
   - Screens → ui/screens/
   - Navigation.kt → navigation/Navigation.kt

3. **Setup Dependencies**
   - Copy isi `build.gradle.kts` ke file `build.gradle.kts` (Module: app)
   - Sync Gradle

4. **Run Application**
   - Connect device atau jalankan emulator
   - Click "Run" (▶️) atau tekan Shift+F10

---

## 🎨 Design Highlights

### Color Palette
```kotlin
val JetStream = Color(0xFFC0D5CE)        // Primary Background
val Opal = Color(0xFFA0C8C4)             // Secondary Highlights
val DarkElectricBlue = Color(0xFF507579) // Buttons & Accents
val JapaneseIndigo = Color(0xFF304544)   // Primary Text
val MediumJungleGreen = Color(0xFF1B3033)// Secondary Text
```

### Screen Flow
```
Splash → Onboarding (3 slides) → Login → Main (Bottom Nav)
                                           ├─ Home (TidyLand)
                                           ├─ Scanner (SnapSort)
                                           ├─ Tools (PickUp & FreshLog)
                                           └─ Profile
```

---

## 📝 Catatan Pengembangan

### ✅ Yang Sudah Dikerjakan (MVP Prototype)
- [x] Project setup dengan Compose & Material3
- [x] Splash screen dengan animasi
- [x] Onboarding dengan horizontal pager
- [x] Login screen (UI only)
- [x] Bottom navigation dengan 4 tabs
- [x] Home screen dengan island visualization
- [x] Scanner screen dengan mock simulation
- [x] Tools screen (PickUp & FreshLog tabs)
- [x] Profile screen dengan stats & badges

### 🔄 Yang Bisa Dikembangkan Selanjutnya
- [ ] Integrasi Firebase Authentication
- [ ] Implementasi Room Database untuk offline storage
- [ ] Integrasi ML Kit untuk real camera scanner
- [ ] WorkManager untuk scheduled notifications
- [ ] Firebase Firestore untuk sync data
- [ ] Unit & UI testing

### 🎯 Fokus Prototype
Prototype ini **TIDAK MENGGUNAKAN**:
- ❌ Firebase (auth, firestore, storage)
- ❌ ML Kit / AI Scanner
- ❌ Room Database
- ❌ Real Camera (CameraX)
- ❌ WorkManager notifications
- ❌ Hilt Dependency Injection

**Fokus pada:**
- ✅ UI/UX modern & clean
- ✅ Navigation flow yang smooth
- ✅ Material3 design implementation
- ✅ Mockup data untuk demonstrasi

---

## 🐛 Known Issues

1. **Scanner Simulation** - Menggunakan delay dan random data, bukan real ML Kit
2. **No Data Persistence** - Data hilang saat app ditutup (no database)
3. **Static Data** - Semua data hardcoded untuk demo
4. **No Authentication** - Login langsung ke app tanpa validasi

---

## 📸 Screenshots

*(Tambahkan screenshots setelah app running)*

---

## 📄 License

Project ini dibuat untuk keperluan tugas kuliah.  
Developer: Helma Afifah (230104040215)

---

## 🙏 Acknowledgments

- Material Design 3 by Google
- Jetpack Compose Documentation
- Anthropic Claude untuk bantuan development

---

## 📞 Contact

Untuk pertanyaan atau feedback:
- Developer: Helma Afifah
- NIM: 230104040215

---

**Version:** 1.0.0-MVP  
**Last Updated:** January 2026  
**Status:** Prototype - Educational Purpose
