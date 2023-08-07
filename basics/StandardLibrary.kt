fun main() {
    // Standard Collections
    val set = hashSetOf(1, 2, 5, 1)
    val list = arrayListOf(1, 4, 5)
    val map = hashMapOf(1 to "one", 2 to "two", 4 to "four")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(listOf("a", "b", "c").joinToString(prefix = "[", postfix = "]"))
    println(list.getOrNull(4))

    for ((index, element) in list.withIndex()) {
        println("$index $element")
    }

    // Note! Most of the functions are extensions from Kotlin
    // Note! Under the hood, some collections classes from java is used

    1 until 30 // Awesome! `until` infix extension function in `Int`
    "key" to "value"
    mapOf(0 to 1, 1 to 2)
    'a'.isLetter()
    '_'.isLetterOrDigit()

    val t = """
        Hello
        World
    """.trimIndent()
    println(t);

    val t1 = """Hello
        |World
    """.trimMargin()
    println(t1)

    val t2 = """Hello
        World
    """
    println(t2)

    val rgx = """\d{4} \d{4} \d{4} \d{4}""".toRegex()
    println(rgx.matches("1111 2222 3333 4444"))
    println(rgx.matches("11 2222 333 1111"))

    // Conversion to numbers
    "123".toInt()
    "1e-10".toDouble()
    // "xx".toInt() -> NumberFormatException
    "xx".toIntOrNull()

    "Hello" eq "World"
    1 eq 1
}

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}
