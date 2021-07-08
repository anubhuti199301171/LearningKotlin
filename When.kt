fun main()
{
    val x = 1;
    val y = 2;
    val ch = '+';
    
    //when is analogus to switch case
    
    val value = when(ch)
    {
        '+' ->
        {
            x+y//this is implicitly cast to "Any" Datatype, analogous to object class in java
        }
        '-' ->
        {
            x-y
        }
        else ->
        {
            println("Calculation not possible");//if our code entered this block, and sees nothing to return
            //then in last line of output it would have printed --> "Kotlin.Unit" <-- meaning nothing
        }
    }
     println(value);
}