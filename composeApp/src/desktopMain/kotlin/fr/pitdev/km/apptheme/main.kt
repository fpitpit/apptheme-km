package fr.pitdev.km.apptheme

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "AppTheme-KM",
    ) {
        App()
    }
}