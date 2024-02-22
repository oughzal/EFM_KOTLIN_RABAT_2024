import java.lang.Exception
import java.util.Scanner
enum class Jour{
    LUNDI,
    MARDI,
    MERCREDI,
    JEUDI,
    VENDREDI,
    SAMEDI,
    DIMANCHE;
}

fun main(){
    print("Donner le jour : ")
    val j :String? = readLine()!!

 try {
        var jour: Jour? = Jour.valueOf(j?.uppercase() ?: "")
        println("c'est $jour")
    }
    catch (e:Exception){
       println("erreur, ce n'est pas une jour de la semaine")
    }

    var jour: Jour? = when(j!!.uppercase()){
    "LUNDI" -> Jour.LUNDI
    "MARDI" -> Jour.MARDI
    "MERCREDI" -> Jour.MERCREDI
    "JEUDI" -> Jour.JEUDI
    "VENDREDI" -> Jour.VENDREDI
    "SAMEDI" -> Jour.SAMEDI
    "DIMANCHE" -> Jour.DIMANCHE
    else -> null
}
if(jour != null){
    println("c'est $jour")
}else{
    println("erreur, ce n'est pas une jour de la semaine")
}
}