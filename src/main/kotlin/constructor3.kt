fun main(args: Array<String>){
    val obj = Student ("Ajeet", 30)
}

class Student{
    constructor(name: String, age: Int){
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}