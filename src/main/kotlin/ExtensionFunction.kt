fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Irya"

    println(name.hello())

    name.printHello()

    "Muhammad".printHello()
}