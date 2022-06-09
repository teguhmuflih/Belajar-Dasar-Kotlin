fun main() {
    val text = "hello"

    text.let{value ->
        val message = "$value Kotlin"
        println(message)
    }
}