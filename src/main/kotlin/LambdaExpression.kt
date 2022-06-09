fun toUpper(value:String): String = value.toUpperCase()

fun main() {
    val lambdaName : (String) -> Unit = { name:String ->
        val result = println("Hello $name")
        result
    }

    lambdaName("Teguh")

    val upperCaseName : (String) -> String = {
        it.uppercase()
    }

    println(upperCaseName("teguh"))

    val toUpperCase: (String) -> String = ::toUpper

    println(toUpperCase("teguh muflih rizky"))

}

