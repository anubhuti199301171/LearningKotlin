fun main()
{
    val age = 19;
    
    if(age>=21)
    	println("Wohoo!! enjoy your drink");
    else
    	println("Sorry you can't drink in Delhi :) ");
    	
    
        val value : Int = if( true)
        {
            println("Inside true");
            10; //returns the last value
        }
        else
        {
        	println("Inside false");
            20;
        }
        
        println("Value--> $value");

}