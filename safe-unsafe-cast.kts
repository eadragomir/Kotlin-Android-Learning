package eu.tutorials.kotlinbasics


fun main() {

    val location: Any = 123
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int

    // safeString
    if(safeString == null){
        println("safeString is null")
    } else {
        println("safeString is: $safeString")
    }

    // safeInt
    if(safeInt == null){
        println("safeInt is null")
    } else {
        println("safeInt is: $safeInt")
    }
}
