import Color.*

// Awesome! Pair of values with destruct, inference type and pair
fun updateWeatherIdiomatic(degrees: Int) {
    val (description, color) = when {
        degrees < 0 -> "cold" to BLUE // Awesome! Pair's constructor Pair("cold", BLUE) can be replaced by `to`
        degrees < 25 -> "mild" to ORANGE
        else -> "hot" to RED
    }
    // ...
}

// Review! Java like code
fun updateWeather(degrees: Int) {
    val description: String
    val color: Color
    if (degrees < 0) {
        description = "cold"
        color = BLUE
    } else if (degrees < 25) {
        description = "mild"
        color = ORANGE
    } else {
        description = "hot"
        color = RED
    }
    // ...
}

enum class Color {
    BLUE, ORANGE, RED
}
