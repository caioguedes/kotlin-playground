fun main() {
    data class Person(val name: String, var city: String? = null)

    val p1: Person = Person("Caio")

    println("Hello, World!")
}