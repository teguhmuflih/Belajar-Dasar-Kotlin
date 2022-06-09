fun main() {
    fun hello(name:String, transformer:(String)->String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }
    val upper = fun(value: String): String {
        return if (value ==""){
            "UPS"
        }else{
            value.toUpperCase()
        }
    }

    println(hello("Teguh muflih rizky", upper))
    println(hello("", upper))
}