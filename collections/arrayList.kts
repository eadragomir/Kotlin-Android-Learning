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

fun main(){
    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(13.212312)
    myArrayList.add(23.151232)
    myArrayList.add(32.651553)
    myArrayList.add(16.223817)
    myArrayList.add(18.523999)
    var total = 0.0
    for (i in myArrayList){
        total += i
    }
    var average = total / myArrayList.size
    println("Avarage is " + average)
}
