fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.uppercase() }

    println(hello("Irya", lambdaUpper))

    println(hello("Irya", { value: String -> value.lowercase() }))

    val result1 = hello("Irya") { value: String ->
        value.lowercase()
    }
}