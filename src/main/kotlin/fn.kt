fun main() {
    val list1 = listOf(1,2,3,4,5)
    println(list1)
    val list2 = list1.filter { it %2 ==0 }
    println(list2)
    val list3 = listOf(6,7,8)+ list1
    println(list3)
    val list4 = list3.sorted()
    println(list4)
    list1.forEachIndexed { index, value ->
        println("indexe : $index, a pour valeur : $value")
    }
    val exist = list1.contains(3)
    println(exist)
}
