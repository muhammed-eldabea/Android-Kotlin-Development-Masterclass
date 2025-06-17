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



