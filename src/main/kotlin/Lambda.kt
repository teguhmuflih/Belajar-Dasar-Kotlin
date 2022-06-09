val message = { println("Hello from lambda") }

val printMessage = {pesan: String -> println(pesan) }

val messageLength = {pesan: String -> pesan.length}

fun main() {
    message()
    printMessage("Halo untuk kalian semua")
    val length = messageLength("hello from lambda")
    println("banyak huruf sebanyak $length")
}