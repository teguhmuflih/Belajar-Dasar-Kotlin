
fun sayHello(firstName:String, lastName: String?){
    if (lastName == null){
        println("Hello $firstName")
    }else {
        println("Hello $firstName $lastName")
    }
}
fun main() {
    sayHello("Myoi","Mina")
    sayHello("Momo", null)
    sayHello("Sana", "")
}