# Kotlin Data Types and Variables - Notes

## Key Concepts

1. Variables in Kotlin can be declared using `var` for mutable variables and `val` for immutable variables.
2. String interpolation allows you to embed variable values directly within strings using the `$` symbol.
3. The `main` function is the entry point of a Kotlin application.
4. Kotlin is a statically typed language, meaning variable types are known at compile time.
5. Kotlin supports type inference, so you can omit the type declaration if it can be inferred from the initializer.
6. Kotlin's standard library provides many useful functions and extensions for working with strings, collections, and more.
7. Kotlin supports both primitive types (like `Int`, `Double`) and their boxed counterparts (like `Integer`, `Double`).
8. If the variable is inferred as a specific type, it cannot be assigned a value of a different type without causing a compilation error.
9. Kotlin provides a rich set of built-in types, including numeric types (`Byte`, `Short`, `Int`, `Long`, `Float`, `Double`) and `Boolean`.
10. The `::class.simpleName` syntax is used to get the simple name of the class of a variable, which is useful for debugging and reflection.
11. The default type of a number in Kotlin is `Int`, so if you want to use a floating-point number, you need to specify it as `Float` or `Double` explicitly.
12. The `L` suffix is used to indicate that a number is of type `Long`, which is useful for large integer values that exceed the range of `Int`.


Notes : 
1. Why when using array of string i Can not do it with $names[0] it is bring the Location of the Vriable rather than the data itself 





# OPP 
1. OPP is a way pf thinking of Code in term of Object
2. Object have charactrics and physicals ( Funcation) 
3. charachetrs : Color , Size , Model , Year 
4. physics : Move , Fly , eat , play , add , substruct  
5. Real World Serve as a templet to descripe Our Code  
6. Secondray consurctor : Used to Define a way of inialioztion the consutrctor Based on the inputs passed to the inialization of the constructor @UserClass
7. There is mutiple way to declear properties in Kotlin 
8. Using the **primary_Constructor** 
  ```kotlin
class UserName (var name :String ,var  lastName :String )
{

}
```   
9. Using the **secondary_Constructor** 
  ```kotlin
class UserName (var name :String ,var  lastName :String )
{
    var age :Int
}
```   
10. In Kotlin, you can use the `init` block to initialize properties when an object is created.
11. The `init` block is executed when the primary constructor is called, allowing you to perform additional initialization logic.
12. You can define multiple secondary constructors in a class, each with different parameters.
13. You can use the `this` keyword to refer to the current instance of the class, which is useful in constructors and methods.
14. to use Seter and Getter in Kotlin, you can define properties with custom accessors.
15. You can use the `get()` and `set()` functions to define custom behavior for getting and setting property values.
16. in getter and setter you can use the `field` keyword to refer to the backing field of the property.
17. setter can be used to validate or transform the value before assigning it to the property. 
18.  we use the filed as the next if do it as the following 
```kotlin
class UserName (var name :String ,var  lastName :String )
{
    var age :Int
    get() {
        return field
    }
    set(value) {
        if (value > 0) {
            age = value // will add recurision call for the setter and SW will cause a stack overflow 
        } else {
            throw IllegalArgumentException("Age must be positive")
        }
    }
}
``` 
19. lateinit var is a way to declare a variable that will be initialized later, **but before it is used**. 
20. lateinit is used for properties that cannot be initialized in the constructor but will be initialized before they are accessed.
21. You cannot use lateinit with primitive types (like Int, Boolean) or with properties that are initialized in the constructor.
22. You can use lateinit with properties that are nullable or have a default value.
23.  
```kotlin 
class Calculator ()
{



    fun sum (a :Int , b :Int) : Int
    {
        return a + b
    }
}
```  
24. the only way to call the function is to create an instance of the class and then call the function on that instance. but what if i wwant to use the sum funcation without 
creating an instance of the class? 
25. companion object is a way to define static members in a class, allowing you to call methods or access properties without creating an instance of the class.
26. You can define a companion object inside a class using the `companion object` keyword. 
27. otherwords it is related to the class itself rather than to instances of the class. 
28. You can access the members of a companion object using the class name followed by the member name.
29. You can define multiple functions and properties inside a companion object, just like in a regular class.
```kotlin 
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
}
```  
30. The `private constructor` ensures that the class cannot be instantiated from outside, enforcing the singleton pattern. 
31. The `getInstance` function provides a way to access the single instance of the class, creating it if it doesn't exist.
32. we can use object rather than class to create a singleton in Kotlin. ( means that is can only be instantiated once and cannot be subclassed) 
33. lazy inialization is a way to delay the initialization of a property until it is accessed for the first time. as in term of performance, it can be useful when the initialization of a property is expensive or not always needed. 
34. Inner classes are classes defined within another class, and they can access the outer class's members, including private ones. 
35. To define an inner class, use the `inner` keyword before the class declaration 
36. Inner classes can be useful for logically grouping classes that are only used in one place, and they can also help to avoid naming conflicts with other classes.
37. You can create an instance of an inner class using the outer class instance, like this:
```kotlin 
class Outer {
    private val outerProperty = "Outer Property"

    inner class Inner {
        fun accessOuter() {
            println(outerProperty) // Accessing outer class property
        }
    }
} 
``` 
38. To create an instance of the inner class, you need to create an instance of the outer class first:
```kotlin 
val outer = Outer()
val inner = outer.Inner()
inner.accessOuter() // This will print "Outer Property"
```
39. Kotlin also supports nested classes, which are defined within another class but do not have a reference to the outer class instance. Nested classes are defined without the `inner` keyword.
40. Nested classes can be useful when you want to group classes together but do not need access to the outer class's members.
41. To create an instance of a nested class, you do not need an instance of the outer class:
```kotlin 
class Outer {
    class Nested {
        fun greet() {
            println("Hello from Nested Class")
        }
    }
}   
```
42. You can create an instance of the nested class like this:
```kotlin 
val nested = Outer.Nested()
nested.greet() // This will print "Hello from Nested Class"
```
43. Kotlin supports data classes, which are classes specifically designed to hold data. They automatically generate useful methods like `toString()`, `equals()`, and `hashCode()`.
44. inheritance in Kotlin is done using the `open` keyword, which allows a class to be subclassed. By default, classes in Kotlin are final and cannot be inherited from.
```kotlin 
class Car (val name :String , val color :String , val engines:Int , val doors:Int) {

    fun printCar() {
        println("Car name: $name, Color: $color, Engines: $engines, Doors: $doors")
    }

    fun start() {
        println("Starting the car: $name")
    }
    fun stop() {
        println("Stopping the car: $name")
    }
    fun accelerate() {
        println("Accelerating the car: $name")
    }
}


class Plane  (val name :String , val color :String , val engines:Int , val doors:Int) {

    fun printCar() {
        println("Plane name: $name, Color: $color, Engines: $engines, Doors: $doors")
    }

    fun start() {
        println("Starting the Plane : $name")
    }
    fun stop() {
        println("Stopping the Plane : $name")
    }
    fun accelerate() {
        println("Accelerating the Plane : $name")
    }
}
// the Car and Plane classes have similar properties and methods, but they represent different types of vehicles.
// we can use inheritance to create a base class that contains the common properties and methods, and then have the Car and Plane classes inherit from that base class.
abstract class Vehicle(val name: String, val color: String, val engines: Int, val doors: Int) {

    abstract fun printDetails()

    fun start() {
        println("Starting the $name")
    }

    fun stop() {
        println("Stopping the $name")
    }
    fun accelerate() {
        println("Accelerating the $name")
    }
}

class Car(name: String, color: String, engines: Int, doors: Int) : Vehicle(name, color, engines, doors) {
    override fun printDetails() {
        println("Car name: $name, Color: $color, Engines: $engines, Doors: $doors")
    }
}

class Plane(name: String, color: String, engines: Int, doors: Int) : Vehicle(name, color, engines, doors) {
    override fun printDetails() {
        println("Plane name: $name, Color: $color, Engines: $engines, Doors: $doors")
    }
}


```
45. define the classes as Open classes, which allows them to be subclassed. and the `abstract` keyword is used to define a class that cannot be instantiated directly and must be subclassed. 
46. subclasses must implement the abstract methods defined in the base class. 
47. subclasses can also override the methods of the base class to provide their own implementation. 
48. You can use the `super` keyword to call the methods of the base class from the subclass. 
49. subclasses mean that they can inherit properties and methods from the base class, allowing for code reuse and polymorphism.
50. the Open keyword is used to allow a class to be subclassed, while the abstract keyword is used to define a class that cannot be instantiated directly and must be subclassed.
51. Kotlin supports interfaces, which are similar to abstract classes but can be implemented by multiple classes. Interfaces can contain abstract methods and properties, and classes can implement multiple interfaces.
52. To define an interface, use the `interface` keyword:
```kotlin 
interface Drivable {
    fun start()
    fun stop()
    fun accelerate()
}
```  
53. Classes can implement an interface using the `:` syntax:
```kotlin 
class Car(val name: String, val color: String) : Drivable {
    override fun start() {
        println("Starting the car: $name")
    }

    override fun stop() {
        println("Stopping the car: $name")
    }

    override fun accelerate() {
        println("Accelerating the car: $name")
    }
}
``` 





## Course Topics  
11:29 Curiculum
15:01 Udemy The Complete Android 14 & Kotlin Development Masterclass
20:45 Donwload Intellij Idea
22:14 Install Intellij Idea
23:30 Create New Project
45:20 Variable
1:01:10 IntegerType
1:12:30 Byte, Short, Int, Long
1:22:45 Float and double
1:29:07 Char and Boolean
1:38:20 Operators
2:37:10 Null
2:54:00 Function
3:49:16 Loops
3:59:15 While Do While
4:22:24 Odd Even
4:37:11 Array
4:55:00 find max and min number
5:12:39 OOP
9:28:07 Basic Android Studio
9:41:33 OOP
9:58:07 Collections
10:14:56 Collections Operations
12:16:28 OOP
13:45:25 Exception
13:54:53 Lambdas
14:41:20 Threads
14:51:40 Coroutines
16:21:17 Android Studio Coroutines
16:23:23 SQLite
16:50:08 Download and install Android Studio
15:54:07 Create new Project Android Studio (Introducing to Android Development)
18:16:38 Inch to cm Apps
18:39:54 Change Color App
18:51:40 Radio Button
19:08:23 Seekbar
19:26:04 Toggle Button
19:32:01 Checkbox
19:52:39 Activity
20:38:45 QuizApp
22:43:28 RecyclerView
23:27:45 Toolbar
24:00:09:45 Layout
24:00:33:42 Drawing App
24:03:22:18 Navigation Drawer Fragment
24:04:04:04 Fragment
24:04:25:41 Fragment Comunication
24:04:51:56 Bottom Navigation View
24:05:07:45 Bottom Sheet
24:05:23:21 Persistent Bottom Sheet
24:05:40:14 TextWatcher
24:05:49:52 Collapsing Toolbar
24:06:06:32 Firestore
24:09:13:10 Navigation Component
24:10:12:48 Shared Preference
24:10:26:12 SQLite
24:11:22:49 Android Architecture Components (introduction into room db)
24:11:28:31 Room Database
24:13:32:31 Retrofit and gson
24:15:37:00 Weather App
24:16:52:25 Chat App Intoduction
24:16:55:17 Data Binding in Firestore Project
24:17:00:57 Building Chat App
24:20:42:44 Compose
24:23:41:41 Uber Clone

