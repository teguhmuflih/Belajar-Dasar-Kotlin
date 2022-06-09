// Tanpa Domain Specific Languages (DSL)
/*
fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}
*/
// Dengan Domain Specific Languages (DSL)
fun buildString(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return  stringBuilder.toString()
}
fun main() {
//    memanggil tanpa DSL
//    println(buildString())
    val message = buildString {
        append("Hello ")
        append("From ")
        append("Lambda")
    }
    println(message)
}