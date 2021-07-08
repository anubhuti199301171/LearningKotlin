fun main()
{
	//scope function, all the work related to a particular variable can be done in it's corresponding
	//scope function
	
    val myName : String? = "Anubhuti";
    //this will work only when the variable is not null
    
    myName?.let{
        println(it);
    }
}
