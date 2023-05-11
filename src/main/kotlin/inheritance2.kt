open class Animal(colour:String, age: Int){
    init {
        println("Colour is: $colour")
        println("Age is: $age")
    }
}

class Dog(colour: String,age: Int):Animal(colour,age){

    fun woof(){
        println("Dog makes the sound of woof")
    }
}

class Cat(colour: String, age: Int):Animal(colour,age){

    fun meow(){
        println("Cat makes the sound of meow")
    }

}

class Horse(colour: String,age: Int):Animal(colour,age){

    fun neigh(){
        println("Horse makes the sound of neigh")
    }
}

fun main(args: Array<String>) {
    val d = Dog("Brown",5)
    d.woof()
    val c = Cat("Brown",5)
    c.meow()
    val h = Horse("Black",7)
    h.neigh()
}