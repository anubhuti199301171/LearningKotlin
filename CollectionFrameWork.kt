fun main()
{
    //making list
    val list1 = listOf("A" , "B" , 1 , "C");//added anything and everything
   	//printing 
   	for(x in list1)
    {
        print(x);
    }
    /*
     * But the above list is immutable, 
     * that is list1[1] = "D", not allowed
     * let's make a mutable list
     * 
     * */
     val list2 = mutableListOf("A" , "B" , 5);
     //printing
     println("")
     for(x in list2)
    {
        print(x);
    }
    println("")
    //changing
   list2[1] = 10;
   println("After changes in list2");
    for(x in list2)
    {
        print(x);
    }
    
    //type list
    val list3 = listOf<String>("Kotlin", "Java");
    println("")
    for(x in list3)
    {
        println(x);
    }
    
}