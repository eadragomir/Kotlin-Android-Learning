package eu.tutorials.kotlinbasics


fun main() {
    val numbers: IntArray = intArrayOf(1, 3, 20, 98)
    // val numbers = arrayOf(1, 3, 20, 98)
    print(numbers.contentToString())

    for(element in numbers){
        print(" $element")
    }

    val fruits = arrayOf(Fruit("apple", 12.3), Fruit("peach", 34.56), Fruit("mellon", 4.56))
    for(index in fruits.indices){
        println("${fruits[index].name} is in index $index")
    }
}

data class Fruit(val name: String, val price: Double)
