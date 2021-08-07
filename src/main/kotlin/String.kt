fun main() {
    var firstName: String = "Irya"
    var lastName: String = "Muhammad"

    var address: String = """
        Jalan jalan
        Kabupaten Bekasi
        Jawa Barat
    """.trimIndent()

    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$firstName char = ${firstName.length}"

    println(desc)
}