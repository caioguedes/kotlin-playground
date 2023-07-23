// Note! Variables can be declared in the file scope as global
val global = "foo"

fun main() {
    // Awesome! Type inference and immutable reference (val = value)
    val question =
        "The ultimate question of life, the universe, end everything?"
    val answer = 54
    val answerTyped : Int = 54 // Note! Explicit Typed

    // Note! Mutable reference variables should be defined as var (variable)
    var counter = 1
    counter = counter + 1
}
