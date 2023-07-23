fun main() {
    println(sum(1, 2))

    // Awesome! Named arguments
    println(sum(t1 = 1, t2 = 3))

    // Awesome! vararg also can be used
    println(sum(1, 2, 3))

    // Awesome! Spread operator
    val li = intArrayOf(1, 2, 3, 4)
    println(sum(2, 3, 5, *li))
}

// Awesome! Overwrite function arguments
// Note! Pascal Notation for type declaration on function arguments
fun sum(t1: Int, t2: Int) = t1 + t2
fun sum(vararg ts: Int) = ts.sum()