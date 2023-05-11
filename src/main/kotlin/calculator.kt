fun main(args: Array<String>) {
    print("Enter your number")
    val num1= readLine()?.toDouble()?:0.0
    print("Enter your second number")
    val num2= readLine()?.toDouble()?:0.0

    print("Enter operator(+,-,*,/)")
    val op= readln()
    val majibu :Double= when (op){
        "+"-> num1+num2



       else ->{
           println("Invalid operator")
           0.0
       }

    }
}