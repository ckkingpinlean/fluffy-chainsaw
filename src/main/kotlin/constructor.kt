import kotlin.time.measureTimedValue

class Mimi(var jina:String="Borncrook", val shule:String="Brookhouse", val miaka:Int=7){

}

fun main(args: Array<String>) {
    val myobj=Mimi("Caleb","eMobilis",18)
    val myobj2=Mimi()

    println("My name is ${myobj2.jina}")
    println("${myobj.jina}is${myobj.miaka}and studies at ${myobj.shule}")
}