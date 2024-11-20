package fr.pitdev.km.apptheme

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(dynamicColor = true)
        }
    }
}

@Preview(apiLevel = 35, wallpaper = Wallpapers.RED_DOMINATED_EXAMPLE, showBackground = true)
@Preview(apiLevel = 35, wallpaper = Wallpapers.BLUE_DOMINATED_EXAMPLE, showBackground = true)
@Preview(apiLevel = 35, wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE, showBackground = true)
@Preview(apiLevel = 35, wallpaper = Wallpapers.YELLOW_DOMINATED_EXAMPLE, showBackground = true)
@Preview(apiLevel = 35, wallpaper = Wallpapers.RED_DOMINATED_EXAMPLE, showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Preview(apiLevel = 35, wallpaper = Wallpapers.BLUE_DOMINATED_EXAMPLE, showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Preview(apiLevel = 35, wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE, showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Preview(apiLevel = 35, wallpaper = Wallpapers.YELLOW_DOMINATED_EXAMPLE, showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun AppAndroidPreview() {
    App(dynamicColor = true)
}