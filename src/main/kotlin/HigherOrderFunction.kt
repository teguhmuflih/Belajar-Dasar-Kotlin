var sum: (Int) -> Int = {value -> value + value}

fun printResult(value:Int, sum: (Int)-> Int){
    val result = sum(value)
    println(result)
}

fun main() {
    println(sum(2))
    printResult(10){value -> value + value}
}