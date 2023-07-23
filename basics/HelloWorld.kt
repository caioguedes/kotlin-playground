fun main() {
    data class Person(val name: String, var city: String? = null) {
        fun getNameAndCity(): String =
            this.name + " " + this.city?.ifBlank { "(undefined)" }
    }

    val p1: Person = Person("Caio")
    var p2 = Person("Foo", null)

    println("Hello, World!")
    println(p1.getNameAndCity())
    println(p2.getNameAndCity())
}