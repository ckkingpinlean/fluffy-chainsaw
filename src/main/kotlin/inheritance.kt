open class Wazazi{
    val mama="She likes shouting"
    val baba="He likes watching action movies"
}
class boy:Wazazi(){
    fun mzebra(){
        println(baba)
    }
}
class girl:Wazazi(){
    fun shawrie(){
        println(mama)
    }
}

fun main(args: Array<String>) {
    val mzebraobj=boy()
    mzebraobj.mzebra()
    val shawrieobj=girl()
    shawrieobj.shawrie()
}
