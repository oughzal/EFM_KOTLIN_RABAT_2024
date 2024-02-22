fun main() {
    val fn1 : (Int,Int)->Int = {a,b -> a+b}
    val fn2 ={a:Double,b:Double -> a*b}
    val fn3 = fun(a:Int,b:Int):Int = a+b
    var list = listOf(1,2,3,4)
    val list2 = list.map { it*2 }
    val list3 = ArrayList<Int>()
    list = list.filter { it in 3..6 }
    list2.forEach { list3.add(it*3) }
}