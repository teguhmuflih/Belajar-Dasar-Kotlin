fun hello(firstName:String, lastName:String? = " "){
    if(lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Joni","Sitanggang")
    hello("Mikel")
    hello("John", null)
}