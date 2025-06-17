import Calculator.Companion.sum
import java.awt.Color


class Listview (val items :Array<String>)
{

    inner class ListViewItem ()
    {
        fun printItem(postion : Int) : String
        {
            println("Item at position $postion: ${items[postion]}")
            return  items[postion]
        }
    }
}



enum class Direction (var diection :String , var  distance : Int)
{
    North ("North", 10),
    South ("South", 20),
    East ("East", 30),
    West ("West", 40);

    fun getDirectionInfo(): String {
        return "Direction: $diection, Distance: $distance"
    }
}




class User (var firstname :String , var lastName : String)
{
    init {
        println("User created with first name: $firstname and last name: $lastName")
    }

    fun printUserData() {
        println("First Name: $firstname")
        println("Last Name: $lastName")
    }
}
class Database private constructor()
{
    companion object {
        private var instance: Database? = null

        fun getInstance(): Database {
            if (instance == null) {
                instance = Database()
            }
            return instance!!
        }
    }

    fun connect() {
        println("Connected to the database.")
    }

    fun disconnect() {
        println("Disconnected from the database.")
    }
}

object DatabaswWithObject
{
    // This is a singleton object that can be used to manage database connections.
    fun connect() {
        println("Connected to the database using object.")
    }

    fun disconnect() {
        println("Disconnected from the database using object.")
    }

}


class Car (name: String , model: String , color: String , doors : Int ) {
    var name  = name
    var model = model
    var color = color
    var doors = doors

    fun move ()
    {
        println(" The Car $name is Moving")
    }

    fun stop ()
    {
        println("The Car $name Is Stopped")
    }
}














fun minNumberinArray(nums: Array<Int>): Int {
    var min = nums[0].toInt()
    for ( i in nums)
    {
        if (i < min ) min = i
    }
    return  min

}
fun MaxNumberinArray(nums: Array<Int>): Int {
    var max = 0
    for ( i in nums)
    {
        if (i > max ) max = i
    }
    return  max

}









fun DealWithArray()
{
//    var names : Array<String> = arrayOf("Mohamed" , "ENAS" , "Lareen")
//    var mixDataTypes  = arrayOf("Mohamed" , "ELDABAA" , 96 , 190 , 27 , 'o')
//
//    for (i in mixDataTypes) {
//        if (i is Int) println("$i")
//    }
//


//    println (names[0])
//    for ( i in 0..names.size)
//    {
//        if (i == names.size) break
//        println("The Name of the User Number $i  is  : " + names[i] )
//    }
//    names.forEach { print(it) }



}



fun funForLoopTest() {

//
//    // loop from 1 to 10
//    print("Print With Range ")
//
//    for (i in 1..10) { println("the value of the Counter is $i") }
//
//
//    print("Print With until  ")
//    // loop from 1 to 9 as 10 is excluded
//    for (i in 1 until 10 ) { println("the value of the Counter is $i") }
//
//    // To loop baclward
//    for (i in 10 downTo 1) println("the Counter value is $i")

//    print("Print With With Steps 2   ")
//    // loop from 1 to 9 as 10 is excluded
//    for (i in 1 until 10 step 2 ) { println("the value of the Counter is $i") }
//

//    var num = 0
////    while (num < 10) println(num++)
//    while (num <10)
//    {
//        if (num == 4) continue
//        if (num == 8) break
//        println("the Counter value is : $num")
//
//    }

//    for (i in 1..12)
//    {
//        if (i in 3..5) continue
//        println(i)
//    }



//    var outerIteratorVar = 0
//
//    outer@  while (outerIteratorVar <10)
//    {
//        outerIteratorVar++
//        var innerIteratorVar = 0
//        while (innerIteratorVar <5)
//        {
//            innerIteratorVar++ ;
//            if (innerIteratorVar==outerIteratorVar) break@outer
//        }
//    }








}


fun printVarableBasedonType (data : Int) = println("im Integer with Data equal to $data")
fun printVarableBasedonType (data : Double) = println("im Float with Data equal to $data")
fun printVarableBasedonType (data : String) = println("im String with Data equal to $data")

fun printMessage (name : String = "Alexa" , message :String = "Hello")
{
    println("Hello $name , : $message")
}


fun sumOfData (a1: Int ,a2: Int ,a3: Int ,a4: Int ,a5: Int  ): Int = a1+a2+a3+a4+a5

fun sumofArgs (vararg nums : Int) : Int
{
    var sum: Int = 0
//    for (num in nums) sum += num
    nums.forEach { sum+=it }
    return sum;
}








//fun sayHello(name :String, age: Int )
//{
//    println("Hello From Funcation Your name is $name and Your Age is $age")
//}
//fun sayHelloByAddress(name :String, age: Int )
//{
//
//    println("Hello From Funcation Your name is $name and Your Age is $age")
//}
//
//fun getMaxValue(num1: Int, num2: Int): Int {
//    return  if (num1 > num2) num1 else num2
//}
//
//fun getMaxValueInOneLine (num1 : Int , num2 :Int) = if (num1 > num2) num1 else num2

// FuncationOverLoading
// Keep the same Funcation Name But chagne the type of the inputs to allow proccessing More Data
fun getMaxValueInOneLine (num1 : Float , num2 : Float) = if (num1 > num2) num1 else num2





//var text: String? = null
//    // it will show and error that safe call for the variable we can not do
//    // any operation with Null value
//    //to mitegate that
//    // we can do as the following
//    text = "Mohamed ELDABAAA"
////    println(text?.length)  // check if the variable is equal to NULL so it will not do the Operation
////    println(text!!.length) // it will do the operation and throught out the exception
//
//
//    var text2: String = text ?: "Variable is NULL "
//    println(text2)

//// Data Types and Variables in Kotlin
//var name: String = "Mohamed"  //var variable is used to declare a mutable variable
//val  age: Int = 30    //val variable is used to declare an immutable variable
//// Integer types
//// in Kotlin include Byte, Short, Int, Long, and their unsigned counterparts UByte, UShort, UInt, ULong.
//// Floating-point types include Float and Double.
//// Boolean type represents true or false values.
//var grade = 50 // Type inference is used to declare a variable without explicitly specifying its type
//var gradeInDouble = 50.0 // Type inference is used to declare a variable without explicitly specifying its type, but with a double value
////grade = "Excellent" // This will cause a compilation error because grade is inferred as an Int and cannot be assigned a String
//
//var intMaxValeue = Int.MAX_VALUE+5 // This is the maximum value for an Int in Kotlin
//
//var NumberLong = 28L // This is a Long type variable, the 'L' suffix indicates that it is a Long literal
//// Note: In Kotlin, the default type for a number is Int, so if you want to use a Long, you need to specify it with 'L'.
//
//var ByteMaxValue = Byte.MAX_VALUE // This is the maximum value for a Byte in Kotlin
//
//var ShortMaxValue = Short.MAX_VALUE // This is the maximum value for a Short in Kotlin
//
//
//var doubleAsDefault = 50.0 // This is a Double type variable, the default type for a floating-point number in Kotlin is Double
//var floatAsData     = 50.0F // This is a Float type variable, the 'f' suffix indicates that it is a Float literal
//

//    println("Hello, $name!") // String interpolation is used to insert the value of the variable into the string
//    println("Your age is , $age!") // String interpolation is used to insert the value of the variable into the string
//    println("Your grade is , $grade!") // String interpolation is used to insert the value of the variable into the string
//    println("Your grade in double is , $gradeInDouble!") // String interpolation is used to insert the value of the variable into the string
//    println("int max value is , $intMaxValeue!") // String interpolation is used to insert the value of the variable into the string
//    println("Type of intMaxValue is ${intMaxValeue::class.simpleName}") // Using reflection to get the type of the variable
//    println("Byte max value is , $ByteMaxValue!") // String interpolation is used to insert the value of the variable into the string
//    println("Short max value is , $ShortMaxValue!") // String interpolation is used to insert the value of the variable into the string
//    println("NumberLong is , $NumberLong!") // String interpolation is used to insert the value of the variable into the string
//    println("doubleAsDefault is , $doubleAsDefault!") // String interpolation is used to insert the value of the variable into the string
//    println("floatAsData is , $floatAsData!") // String interpolation is used to insert the value of the variable into the string
//

//    var isActive  = true
//
//    if (isActive == true )
//    {
//        println ( " the Data is Active  ")
//
//    }
//    else
//    {
//        println("the Data is not Active ")
//    }

// we Can use the if condition to assign variabele value based on certine condition to other data
// the last satatment of the true / false condition will be assigned to the variable as a value
//    var numOne = 1
//    var numTwo = 2
//    val text = if (numOne > numTwo) {
//         println("Number one is the Largers")
//         numOne
//    }
//    else {
//        println("Number two is the Largers")
//        numTwo
//    }
//
//    println("the valu of the txt is $text")
//
// another way of doing it
//    var data = if (5>6) "data is true" else "data is false"
//    println("$data")
// default sate of the break is ti break from the Current loop but we Can define a loop with aany name
//  OuterLoop@  while ( ) {
//
//
//     while () {
//             if (Condtion )
//             }



















// Notes
// 1. Variables in Kotlin can be declared using `var` for mutable variables and `val` for immutable variables.
// 2. String interpolation allows you to embed variable values directly within strings using the `$` symbol.
// 3. The `main` function is the entry point of a Kotlin application.
// 4. Kotlin is a statically typed language, meaning variable types are known at compile time.
// 5. Kotlin supports type inference, so you can omit the type declaration if it can be inferred from the initializer.
// 6. Kotlin's standard library provides many useful functions and extensions for working with strings, collections, and more.
// 7. Kotlin supports both primitive types (like Int, Double) and their boxed counterparts (like Integer, Double).
// 8. if the variable is inferred as a specific type, it cannot be assigned a value of a different type without causing a compilation error.
// 9. Kotlin provides a rich set of built-in types, including numeric types (Byte, Short, Int, Long, Float, Double) and Boolean.
// 10. The `::class.simpleName` syntax is used to get the simple name of the class of a variable, which is useful for debugging and reflection.
// 11. the defualt type of a number in Kotlin is `Int`, so if you want to use a floating-point number, you need to specify it as `Float` or `Double` explicitly.
// 12. The `L` suffix is used to indicate that a number is of type `Long`, which is useful for large integer values that exceed the range of `Int`.
// 13. The `f` suffix is used to indicate that a number is of type `Float`, which is useful for single-precision floating-point values.
// 14. The `MAX_VALUE` property of numeric types provides the maximum value that can be stored in that type, which is useful for understanding the limits of each type.
// 15. Primitives in Kotlin are not objects, but they can be used as objects when needed, thanks to Kotlin's interoperability with Java.
// 16. non premitive types in Kotlin are represented as objects, which allows for more flexibility and functionality compared to primitive types.
// 17. the if condition Can be Used to Asssign a value based on condtion the last statement of false / True Condtion will be set
// 18. Null Pointer Handling
//      1- Can not assign a Null to variable
//          var string = null  >> will not wroking
//            var string? = null  >> it will Work as here i tell the compiler i wan tto assign the Nul pointer
// Text? check if the variable is equal to NULL
// <<<<<<<<<<<<<<<<  Funcation >>>>>>>>>>
// fun_nme ( arg1:arg_type , arg2:arg_type)
// -> Passing Argument
//      -> Pass by address
//      -> Pass by Value
// vargs to pass argument to funcation
// CollectionOfData.foreach {code based on it(iterator}










class UserClass ( name : String ,  lastName : String ,  age : Int)
{
    // before passing the paramters we need to do some validation
    // we will use the inializtion block

    var name: String
    var lastName: String = lastName
    var age: Int= age
    init {
        if (name.lowercase().startsWith('a'))
        {
            this.name = name
        }
        else
        {
            this.name = "User"
            println("the User Name is not Started with A, a char ")
        }
    }
    constructor(name : String , age : Int) : this(name , lastName = "None" ,age)




    //==============================================================//
    fun userPrintData ()
    {
        println(this.name)
        println(this.age)
        println(this.lastName)
    }


}