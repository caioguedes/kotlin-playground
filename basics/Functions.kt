fun main() {
    println(sum(1, 2))

    // Awesome! Named arguments
    println(sum(t1 = 1, t2 = 3))

    // Awesome! vararg also can be used
    println(sum(1, 2, 3))

    // Awesome! Spread operator
    val li = intArrayOf(1, 2, 3, 4)
    println(sum(2, 3, 5, *li))

    // Awesome! Infix for member function
    val n = Number(10)
    println(n max 15 max 25)
}

// Awesome! Overwrite function arguments
// Note! Pascal Notation for type declaration on function arguments
// Awesome! Expression bodies
fun sum(t1: Int, t2: Int): Int {
    return t1 + t2
}

fun sumBlockBody(t1: Int, t2: Int): Int {
    return t1 + t2
}

fun sum(vararg ts: Int) = ts.sum()

class Number(val n: Int) {
    infix fun max(t: Int) : Number = if (n > t) this else Number(t)
}
