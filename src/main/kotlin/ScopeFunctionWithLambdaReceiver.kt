// ada 3 jenis scope function yang dapat digunakan yaitu : run, with, apply
fun main() {

    // run
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text $from to $to"
    }
    println("result : $result")


    // with
    val message = "Hello Kotlin!"
    val result2 = with(message){
        println("value is $this")
        println("with length ${this.length}")
    }
    println(result2)


    // apply
    val message2 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }
    println(message2.toString())
}