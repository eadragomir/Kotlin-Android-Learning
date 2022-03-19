package eu.tutorials.kotlinbasics


fun main() {

    val fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple", "Orange")
    println(fruits.size)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits)
    println(newFruits.elementAt(4))
    println("---------------MAPS---------------------")

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[2])
    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }
    val fruitsMap = mapOf("Favourite" to Fruit("Apple", 23.4), "OK" to Fruit("Orange", 134.7))
    println(fruitsMap)
    println(fruitsMap["Favourite"])

    println("------------MUTABLE----------------")
    val newDaysOfTheWeek = daysOfTheWeek.toMutableMap()
    newDaysOfTheWeek[4] = "Thursday"
    newDaysOfTheWeek[5] = "Friday"

    println(newDaysOfTheWeek.toSortedMap())


}

data class Fruit(val name: String, val price: Double)

