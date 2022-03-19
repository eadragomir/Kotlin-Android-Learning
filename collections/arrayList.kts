package eu.tutorials.kotlinbasics


fun main() {

    val myArrayList = ArrayList<String>()
    myArrayList.add("One")
    myArrayList.add("Two")

    for(element in myArrayList){
        println(element)
    }

    println("-------------PART 2------------")

    val my1Array: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("one one")
    list.add("two two")

    my1Array.addAll(list)
    println(my1Array)

    println("----------PART 3------------")

    val itr = myArrayList.iterator()

    while(itr.hasNext()){
        println(itr.next())
    }
    println("Size of the array list is ${myArrayList.size}")

    println(my1Array.get(1))

}
