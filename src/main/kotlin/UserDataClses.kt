class  UserDataClasses( nameLocal: String, lastNamelocal : String, agelocal :Int  )
{
      var name: String = ""
        get() {
            println("Getting name: $field")
            return field
        }
        set(value) {
            println("Setting name to: $value")
            field = value
        }
    var lastName: String
    var age: Int


    init {
        if (nameLocal.lowercase().startsWith('a'))    {
            this.name = nameLocal
        } else {
            this.name = "User"
            println("The User Name does not start with 'A' or 'a'.")
        }
        if (lastNamelocal.lowercase().startsWith('a'))    {
            this.lastName = lastNamelocal
        } else {
            this.lastName = "User"
            println("The User Name does not start with 'A' or 'a'.")
        }
        if (agelocal < 0) {
            this.age = 0
            println("Age cannot be negative. Setting age to 0.")
        } else {
            this.age = agelocal
        }
    }

    fun userPrintData() {
        println("Name: $name")
        println("Last Name: $lastName")
        println("Age: $age")
    }
    // Secondary constructor
    constructor(name: String, age: Int) : this(name, lastNamelocal = "None", age) {
        // This constructor allows creating a UserDataClasses object with just name and age.
    }
}






class UserDataClassversion2 (var firstname : String , lastname : String , age : Int)
{
    lateinit  var favoriteMoveie: String  // lateinit allows us to declare a variable without initializing it immediately

}
