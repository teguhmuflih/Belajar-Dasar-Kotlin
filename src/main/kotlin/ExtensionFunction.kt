fun String.hello(): String = "hello $this"

fun main() {
    val name = "Teguh"
    println(name.hello())
}