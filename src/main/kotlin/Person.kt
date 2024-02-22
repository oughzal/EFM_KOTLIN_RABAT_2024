data class Person(var nom : String,var age:Int) {
    var id:Int=0
    var prenom :String ="123"
    val fullName by lazy { nom + " " + prenom } ;
    init {
        this.nom = this.nom.uppercase();
        id= cmp++
    }
    companion object{ // Static
        var ville = "KHENIFRA" //Static
        var cmp=1;
        fun M(){} // Méthode de classe (static)
    }
    fun nomComplet():String{ // méthode d'intance ( non static
        return nom
    }
    fun ville():String{
        return Person.ville
    }

     inner class  Stagiaire{
        var cef=0;
        fun nomVale():String{
            return  nom
        }
    }
}

fun main() {
    Person.ville ="RABAT"
    val p1 = Person("nom",20)
    val p2 = Person("nom",20)
    val p3 = Person("nom",20)
    p1.nom="DEV"
    p1.prenom = "201"
    //...
    p1.nom="DEVOAM"
    println(p1.fullName) // fullName =DEVOAM201
    //...
    p1.nom="DEV"
    println(p1.fullName) // fullName =DEVOAM201
    println(p1.ville())
    println(p2.ville())
    println(p3.ville())
    Person.ville ="KHENIFRA"
    println(p1.ville())
    println(p2.ville())
    println(p3.ville())
    val S="DEV201"
    println(S.removechars())
    println(S.first3Chars)
}

fun String.removechars():String{
    return this.substring(0,this.length-1)
}
val String.first3Chars : String
    get() = this.substring(0,3)

val Person.nomComplet:String
    get() = this.nom + " " + this.prenom
