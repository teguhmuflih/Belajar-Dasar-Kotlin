fun main() {
    val message: String? = null //"Hello kotlin"
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }
    println("text -> $result")
}