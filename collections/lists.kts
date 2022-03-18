package eu.tutorials.kotlinbasics


fun main() {

    val months1 = listOf("Jan", "Feb", "Mar", "Apr")
    val anyTypes = listOf(1, 2, 3, true, "String")
    println(anyTypes.size)
    println(months1[1])

    val additionalMonths = months1.toMutableList()
    val newMonths = arrayOf("May", "Jun", "Jul")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("Aug")
    println(additionalMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed", "Thu")
    days.add("Fri")
    println(days)

    days.removeAt(2)
    println(days)

    val removeDays = mutableListOf<String>("Thu", "Fri")
    days.removeAll(removeDays)
    println(days)
}
