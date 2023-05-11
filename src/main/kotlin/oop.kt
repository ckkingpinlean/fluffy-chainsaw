class Sturborn{
    //datamember
    private var num:Int=7
//   member function
    fun calculate():Int{
        return num * num
    }
}

fun main(args: Array<String>) {
    //This is an object
    val myobject=Sturborn()
    println(myobject.calculate())
}