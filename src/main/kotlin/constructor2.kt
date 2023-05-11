class ME(var name:String, val eMail:String, var postalcode:Int){

}

fun main(args: Array<String>) {
    var myobj=ME("Mopreme", "ck@gmail.com",666)
    println("${myobj.name} is wise as fuck")
    println("My postal code is ${myobj.postalcode}")
    println("His eMail address is ${myobj.eMail}")
}