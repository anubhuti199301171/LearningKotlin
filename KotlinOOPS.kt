fun main()
{
    val s1 = Student1("Anubhuti");//note that new keyword not required
    println(s1.name);
    val s2 = Student2("Parth");
    println(s2.name);
    
    //data class demo
    val user1 = User("ABC", 1);
    println(user1);//gets printed correctly, due to in built to string method
    
    val user2 = User("ABC",1);
    val user3 = User("DEF",2);
    
    //checking equality
    println("user1 == user2 --> ${user1==user2}")//double equals to, checks the value of objects
    println("user1 == user2 --> ${user1===user2}")//triple equals to, checks whether they refer to same memory location or not
    println("user1 == user3 --> ${user1==user3}")
    
    //copy function
    println(user1.copy())
    println(user1.copy("XYZ"))
    println(user1.copy(id = 3))
    
    //printing components
    println("name = ${user1.component1()}")
    
    /*
     * In Kotlin we have object keyword, it is used to obtain a data type with single implementation.
     * analogous to singleton class in java. 
     * */
}
//way 1
class Student1(_name : String)
{
    val name : String;
    //initialisation
    init
    {
        name = _name;
    }
}

//way2 (simplified)
class Student2(val name : String)

//data class
/*
 * Data classes makes it easy, to create classes that are used to store values. Such Classes are automatically
 * provided with methods for copying, getting a string representation, and using instances in collection.
 * 
 * */
 
 //demo
 data class User (val name : String, val id : Int)

