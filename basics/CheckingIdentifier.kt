fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || (s.first() !in 'a'..'z' && s.first() != '_')) return false
    for (c in s.substring(1)) {
        if (c in 'a'..'z' || c in '0'..'9') continue else return false
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}