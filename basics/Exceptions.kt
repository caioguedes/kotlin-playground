import java.io.IOException
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import kotlin.random.Random

fun main() {
    // Awesome! `throw` is an expression
    val number = Random.nextInt(1, 100)
    var percentage =
        if (number in 1..100)
            number
        else
            throw IllegalArgumentException("A percentage values must be between 0 and 100: $number")

    // Awesome! `try` is an expression
    val number2 = try {
        Integer.parseInt("2")
    } catch (e: NumberFormatException) {
        null
    }
}

fun foo() {
    // Awesome! No difference between checked/unchecked exceptions
    throw IOException("No more try/catch or throws boiler-plates \\o/")
}

// Note! Tell the compiler to generate `throws` from Java clients, the client should handle the exceptions
@Throws(IOException::class)
fun bar() {
    throw IOException()
}