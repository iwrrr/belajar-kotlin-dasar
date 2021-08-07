fun toUpper(value: String): String = value.uppercase()

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Irya", "Muhammad")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Irya"))

    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Irya Muhammad"))
}