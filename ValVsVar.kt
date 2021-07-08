fun main()
{
    //variable
    var x : Int =  5;//can be changed later
	println("Value--> $x");//string templates($)
    val y : Int = 10;//can't be changed later, immutable
    x=10;
    println("After changing var x ,Value--> $x");
    //y=20 <-- will give us error
}