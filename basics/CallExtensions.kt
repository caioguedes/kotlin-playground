
open class Parent // Note! `open`
class Child: Parent () // Awesome! No `extends` keyword...

fun Parent.foo() = "parent"
fun Child.foo() = "child"

// Note! Extension functions are called as static member of the class
// [Java]
// public static String foo(Parent parent) { return "parent"; }
// public static String foo(Child parent) { return "child"; }

fun main() {
    val parent: Parent = Child()
    println(parent.foo())
}
