// Awesome! Returning Type and Args can be omitted! `fun main() { ... }`
// Note! Main is a top level function no class is needed
fun main(args: Array<String>) { // Note! Array declaration used a generic class
    val n = if (args.size > 0) args[0] else "Kotlin" // Review: args.size > 0 = args.isNotEmpty()
    // Awesome! String templates
    println("Hello, $n")
    // Note! Support complex expression...
    println("Hello, ${n.uppercase()}")
    println("Hello, ${args.getOrElse(0) { "Kotlin" }.uppercase()}")
}