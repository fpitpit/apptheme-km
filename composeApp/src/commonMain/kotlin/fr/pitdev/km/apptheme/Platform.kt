package fr.pitdev.km.apptheme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform