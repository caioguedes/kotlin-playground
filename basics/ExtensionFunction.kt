fun main() {
    // Awesome! Extension function in default library or even third-party libraries
    // Note! String is the receiver, the scope of the function is the String itself (this)
    fun String.lastChar() = this.get(this.length - 1) // Note! Explicit access to receiver can be omitted
    fun String.lastChar2() = get(length -1)
    val c: Char = "foo".lastChar()
    println(c)
    // Note! Calling from java is just a normal static function lastChar("foo")

    fun String.repeat(n: Int): String {
        val sb = StringBuilder(n * length)
        for (i in 1..n) sb.append(this)
        return sb.toString()
    }

    println("Hello".repeat(2))
}