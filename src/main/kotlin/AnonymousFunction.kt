fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "Ups"
        } else {
            return value.uppercase()
        }
    }

    println(hello("Irya", upper))
    println(hello("", upper))
    println(hello("Muhammad", fun(value: String): String {
        return value.lowercase()
    }))
}