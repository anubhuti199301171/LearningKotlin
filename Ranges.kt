fun main()
{
    //ranges in for loop
    for(i in 0..3)
    {
        print(i);//range 0 to 3
    }
    println("")
    for(i in 2..8 step 2)
    {
        print(i);//increments by 2
    }
    println("")
    for(i in 3 downTo 0)
    {
        print(i);//here decrementation takes place
    }
    println("")
    
    //ranges in conditional statements
    val x = 2;
    
    if(x in 1..5)
    	println("x in range of 1 to 5")
        
    if(x !in 6..10)
    	println("x not in range of 6 to 10")
    
}