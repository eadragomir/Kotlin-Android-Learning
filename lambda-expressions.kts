package eu.tutorials.kotlinbasics


fun main() {

    // add two number without lambda expression
    var c = addNumber(5, 10)
    println("Without lambda: $c")

    // add with lambda expression
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println("Lambada long: ${sum(3, 4)}")

    val sum1 = {a: Int, b: Int -> a + b}
    println("Lambada short 1: ${sum(1, 2)}")

    val sum2 = {a: Int, b: Int -> println("Lambda short 2: ${a + b}")}
    sum2(10, 20)

}
