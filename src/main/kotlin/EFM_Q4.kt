import java.util.Collections

fun main() {
    val list1 = listOf(1,2,3,4,5)
    println(list1)
    val list2 = list1.filter { it %2 ==0 }
    println(list2)
    val list3 = listOf(6,7,8)+ list1
    println(list3)
    val list4 = list3.sorted()
    Collections.sort(list3)
    println(list3)
    println(list4)
    val list5 = listOf(
        User(10,"X","V"),
        User(6,"C","M"),
        User(1,"Z","D"),
        User(3,"A","B"),
    )
    Collections.sort(list5)
    println(list5)
}