fun main() {
    var nilai = "B"

    when (nilai) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try Again Next Year")
        }
    }

    when (nilai) {
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf, Anda Tidak Lulus")
        }
    }

    nilai = "E"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("Maaf, Tidak Lulus")
    }

    val name = "Irya"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    val nilaiUjian = 90
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Ngulang tahun depan")
    }
}