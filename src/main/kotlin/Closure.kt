fun main() {
    var counter: Int = 0
    val lambdaIncrement: () -> Unit ={
        println("Increment")
        counter++
    }

    lambdaIncrement()
    lambdaIncrement()
    lambdaIncrement()
    lambdaIncrement()
}