import Color.*

fun main() {
    val i = 10
    val b = if (i < 10) false else true // Note! If are expression, it returns value, doesn't exist ternary operation...
    // Note! If as condition structure also exists...
    if (i != 10) {
        val b1 = 10
    } else {
        val b2 = 10
    }

    // Awesome! `when` also is expression, so it returns value!
    val input = "Y"
    val option = when (input) {
        "Y", "y" -> "Yes" // Awesome! Checking values, more than one value can be used...
        "N", "n" -> "No"
        else -> "Invalid option!"
    }
    println(option)

    // Awesome! Any expression can be used as checking values (branch condition)
    when (setOf<Color>(RED, YELLOW)) {
        setOf(RED, YELLOW) -> println(ORANGE)
        setOf(RED, GREEN) -> println(BROWN)
        else -> throw Exception("Combination not accepted!")
    }

    val p: Person = LegalPerson()
    // Awesome! Checking type (instance of) also have Smart Cast
    when (p) {
        is NaturalPerson -> println("Natural Person: ${p.getFullName()}")
        is LegalPerson -> println("Legal Person: ${p.getBusinessName()}")
        else -> println("Unknown Type!")
    }

    // Awesome! Scoped variable in when block...
    when (val pp: Person = NaturalPerson()) {
        is NaturalPerson -> println("Natural Person: ${pp.getFullName()}")
        is LegalPerson -> println("Legal Person: ${pp.getBusinessName()}")
        else -> println("Unknown Type!")
    }
}

open class Person

class NaturalPerson : Person() {
    fun getFullName(): String = TODO()
}

class LegalPerson : Person() {
    fun getBusinessName(): String = TODO()
}
