fun main() {
    fun sayHello(name:String?=""): Any {
        return when (name) {
            "" -> println("Hello Bro!")
            else -> println("Hello $name")
        }

//        return if (name == " "){
//            println("Hello Bro!")
//        }else{
//            println("Hello $name")
//        }
    }

    sayHello("Teguh")
    sayHello()
}