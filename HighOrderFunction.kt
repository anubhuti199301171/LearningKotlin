fun main()
{
	//a HIGH ORDER FUNCTION, is a function that takes another function as parameter
	//and/or return a function
	val output = operation(4, 5, { a , b ->
        println("Adding the two numbers");
        a + b;//last expression is returned
    });
    
    println(output);
}

//HOF

fun operation( a : Int, b : Int, operate : (Int, Int) -> Int) : Int
{
    return operate(a,b);
}

