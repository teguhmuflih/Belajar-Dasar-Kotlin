fun jumlahkan(a: Int, b:Int): Int {
    val total = a.plus(b)
    return total
}

fun bagi(a:Int, b:Int): Int {
    return if(b == 0){
        0
    }else{
        val total = a.div(b)
        total
    }
}

fun main() {
    println(jumlahkan(20,40))
    println(jumlahkan(20,20))
    println(bagi(20,0))
    println(bagi(20,2))
}