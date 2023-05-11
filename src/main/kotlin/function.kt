fun caleb(){
    println("This a customised user defined function")
}
fun main(args: Array<String>) {
    caleb()
    addition()
    division()
    subtraction()

}

fun addition(){
    val num=7
    val num1=11
    println("The sum of $num and $num1 is ${num+num1}")
}

fun division(){
    val num=4
    val num1=2
    println("The quotient of$num and $num1 is ${num/num1} ")
}

fun subtraction(){
    val num=8
    val num1=4
    println("The difference between $num and $num1 is ${num-num1} ")
}

