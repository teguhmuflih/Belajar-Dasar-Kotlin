var sum: (Int) -> Int = {value -> value + value}

fun printResult(value:Int, sum: (Int)-> Int){
    val result = sum(value)
    println(result)
}

fun main() {
    println(sum(2))
    printResult(10){value -> value + value}

    fun hello(name:String, transformer:(String)->String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper:(String) -> String = {
        it.toUpperCase()
    }

    println(hello("teguh muflih rizky", lambdaUpper))
    println(hello("teguh muflih rizky") { value: String -> value.toLowerCase() })

}