fun fullName(firstName: String
             , middleName: String,
             lastName: String){
    println("Hello $firstName $middleName $lastName")
}
fun main() {
    fullName("Teguh", "Muflih", "Rizky")
    fullName(middleName = "Obi", lastName = "Mikel", firstName = "John")
}