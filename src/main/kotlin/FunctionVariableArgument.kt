fun sumNumbers(vararg number:Int): Int {
    return number.sum()
}

fun <T> asList (vararg input: T): List<T>{
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}

fun allName(vararg name:String): String {
    return name.toString()
}

fun main() {
    val number = sumNumbers(10,20,30,40)
    val groupName = allName("John","Obi","Mikel","Arteta")
    println(number)
    println(groupName)
}