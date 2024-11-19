package fr.pitdev.km.apptheme.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable

@Composable
actual fun platformColorScheme(
    darkTheme: Boolean,
    dynamicColor: Boolean
): ColorScheme = defaultPlatformColorScheme(darkTheme = darkTheme)