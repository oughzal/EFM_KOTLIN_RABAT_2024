data class User(var id : Int,var nom:String,var prenom:String) : Comparable<User> {
    override fun compareTo(other: User): Int {
        return this.prenom.compareTo(other.prenom)
    }
}