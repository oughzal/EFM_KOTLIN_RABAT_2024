import java.lang.Exception
import kotlin.math.pow

sealed class Forme {
    class Circle(var r : Double) : Forme(){}
    class Triangle : Forme(){}

    class  Cuble(var l : Double) : Forme(){}

    class Rectangle(l : Double) : Forme(){
        var l :Double=l
            get() = field // get() = l(get(get(get....
            set(value) {
                if(value>=0) field=value
            }
    }
    fun surface(forme: Forme):Double{
        return when (forme){
            is Forme.Circle -> 3.14*forme.r*forme.r
            is Forme.Rectangle -> forme.l
            is Forme.Cuble -> forme.l.pow(3.0)
            else -> 0.0
        }
    }

}

fun main() {

}