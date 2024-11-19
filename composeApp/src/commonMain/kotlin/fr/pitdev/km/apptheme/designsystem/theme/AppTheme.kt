package fr.pitdev.km.apptheme.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import apptheme_km.composeapp.generated.resources.Montserrat_VariableFont_wght
import apptheme_km.composeapp.generated.resources.Oswald_VariableFont_wght
import apptheme_km.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
expect fun platformColorScheme(darkTheme: Boolean = false, dynamicColor: Boolean = false): ColorScheme

fun defaultPlatformColorScheme(darkTheme: Boolean = false): ColorScheme = when {
    darkTheme -> darkScheme
    else -> lightScheme
}

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme =  platformColorScheme(darkTheme = darkTheme, dynamicColor = dynamicColor)
    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography(),
        content = content
      )
}


val baseline = Typography()

@Composable
fun bodyFontFamily() = FontFamily(
    Font(resource = Res.font.Montserrat_VariableFont_wght, weight = FontWeight.Normal),
)

@Composable
fun displayFontFamily() = FontFamily(
    Font(resource = Res.font.Oswald_VariableFont_wght, weight = FontWeight.Normal)
)

@Composable
fun AppTypography() = Typography().run {

    val displayFontFamily = displayFontFamily()
    val bodyFontFamily: FontFamily = bodyFontFamily()

    Typography(
        displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily),
        displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily),
        displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily),
        headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily),
        titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily),
        titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily),
        titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily),
        bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
        bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
        labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
        labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
        labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily),
        )
}




