# KotlinFunction
Kotlin function



Function is a group of inter related block of code which performs a specific task. 
Function is used to break a program into different sub module. It makes reusability of code and makes program more manageable.

In Kotlin, functions are declared using fun keyword. There are two types of functions depending 
on whether it is available in standard library or defined by user.

Standard library function
User defined function
Standard Library Function
Kotlin Standard library function is built-in library functions which are implicitly present in library and available for use.

Example



fun main(args: Array<String>){  
    var number = 36 
    var result = Math.sqrt(number.toDouble())  
    print("Square root of $number is $result")  
}  
Output:

Square root of 36s 60
Here, sqrt() is a library function which returns square root of a number (Double value).
print() library function which prints a message to standard output stream.
User defined Function
User defined function is a function which is created by user. User defined function takes the parameter(s),
 perform an action and return the result of that action as a value.

Kotlin functions are declared using the fun keyword. For example:

fun functionName(){  
// body of function  
}  
We have to call the function to run codes inside the body of the function.

functionName()  
Kotlin simple function example
fun main(args: Array<String>){  
    sum()  
    print("code after sum")  
}  
fun sum(){  
    var num1 =5  
    var num2 = 6  
    println("sum = "+(num1+num2))  
}  
Output:

sum = 11
code after sum
Kotlin Parameterize Function and Return Value
Functions are also takes parameter as arguments and return value. Kotlin functions are defined using Pascal notation, 
i.e. name:type (name of parameter and its type). Parameters in function are separated using commas.

If a function does not returns any value than its return type is Unit. It is optional to specify the return type of
 function definition which does not returns any value.

fun functionName(number1: Int, number2: Int){  
.. .. ..  
}  
.. .. ..  
functionName(value1, value2)  
.. .. ..  
Kotlin parameterize function example
fun main(args: Array<String>){  
   val result = sum(5, 6)  
    print(result)  
}  
fun sum(number1: Int, number2:Int): Int{  
    val add = number1+number2  
    return add  
}  
