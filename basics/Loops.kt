fun main() {
    // Note! One-line is possible but no return
    for (i in listOf(1, 2, 3)) println(i)

    for (i in listOf(1, 2, 3)) {
        val ii = i + 1;
        println(ii)
    }

    // Awesome! Explicit type is allowed
    for (s: String in listOf("Foo", "Bar", "Fuzz")) {
        println(s)
    }

    // Awesome! Loops through map using destructor for key and value...
    val map = mapOf(1 to "one",
                    2 to "two",
                    3 to "three")
    for ((key, value) in map) {
        println("$key : $value")
    }

    // Awesome! `step` can be used to tweak the incrementer
    for (c in '1' until '9' step 2) {
        println(c)
    }

    // Note! `in` works for iterate also checking
    val c = 10 in 1..10 // >= 1 && =< 10
    val c1 = 2 in listOf(1, 2, 3)
}