import kotlin.math.sqrt

fun main(args: Array<String>) {
    addition()
    println(sqrt(45.20))
    myfunction(Fname = "Caleb", Lname = "Kipkoech", Age = 18,)
    Legends()
    signup("Nairobi",420247,"cleanleenkeeps@gmail.com")
}
fun myfunction(Fname:String,Lname:String,Age:Int){
    println("Work hard to make $Fname a name")
    println("My name is $Fname and I'm $Age years old")

}

fun Legends(){
    println("Tupac died at the age of 25 having written over 600 songs")
}

fun signup(Location:String,Postalcode:Int ,Email:String){
    println("I live in $Location")
    println("My postal code is $Postalcode ")
    println("mY eMail address is $Email ")

}