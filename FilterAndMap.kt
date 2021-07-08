fun main()
{
    val list = listOf<Int>(1,2,5,8,3);
    
    //filters out
    //filter returns a boolean value
    //and forEach is printing the values for which corresponding values were true
    list.filter({
        it%2 == 0
    }).forEach({
        println("$it")
    })
    /*
     * Output--> 
     * 2
     * 8
     * */
    println("")
    //let's transform the list using map
    
    val newList = list.filter({
        it%2 == 0
    }).map({
        it*it
    }).forEach({
        println(it)
    })
    
    /*
     * Output-->
     * 4
     * 64, 
     * as map transformed the list, here we had to use a new list, since, the list we originally created
     * was immutable
     * */
}
