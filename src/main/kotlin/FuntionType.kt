typealias Aritmetic = (Int, Int) -> Int

fun main() {

    val sum: Aritmetic = {valueA, valueB -> valueA + valueB}
    val sumResult = sum.invoke(10,10)
    println(sumResult)
}