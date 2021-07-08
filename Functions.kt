fun main()
{
    println(operation1(2,5));
    println(operation2(3,6));
    printName("Anubhuti");
    printName();
    greetings(name = "Parth" , greet = "Good Evening!");
    greetings();
}

//way 1
fun operation1 (a : Int , b : Int) : Int
{
    return a+b;
}

//way 2
fun operation2 (a : Int , b : Int) : Int = a+b;

//concept of default parameter
fun printName (name : String = "Some Developer")
{
    println("You are $name");
}

//subsitute for method overloading, you can play with the order of parameters
fun greetings (greet : String="Happy Coding!", name : String = "Enthusiast")
{
    println("Hello $name, $greet");
}