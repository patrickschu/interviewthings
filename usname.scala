#!/usr/bin/env scala

//val lines = scala.io.Source.fromFile("/Users/ps22344/Downloads/interviewthings/namess.txt").getLines.toList


//this is my test data
val lines = List("ally", "ben", "albert", "zong", "hermit", "??ennis", "123pat", "alfred", "zil", "zol", "zal")

def comparer(name_one:String, name_two:String): Boolean = name_one match 
	//comparer takes two strings, returns true if identical
	{
	case `name_two` => true
	case _ => false
	}


def checker(new_name: String, old_names: List[String]) : Boolean =
	//checker takes a new user name, compares to List of names already in use
	//returns true if already present or false if not
	{
	val sortednames:List[String] = old_names.sorted
	println(new_name + "input list is length " + sortednames.length)
	
	//set vars, initialize
	var found: Boolean = false
	var startpoint: Int = 0
	var endpoint: Int = sortednames.length-1
	//while loop, breaks when something is found
	while (found == false && startpoint < endpoint)
	{
		println("start: "+startpoint+" end: "+endpoint)
		//set the midpoint were checking against
		var mid: Int = (startpoint + endpoint) / 2
		println("mid is " + mid)
		//run comparer to set found var initialized abpve
		found = comparer (new_name, sortednames(mid))	
		println("new name " + new_name)
		println("ist window " + sortednames(mid))
		//check if new_name is higher or lower in alphabet than mid
		if (new_name > sortednames(mid)) {
			startpoint = mid +1
			println("set start to " + startpoint)
			}
		if (new_name < sortednames(mid)) {
			endpoint = mid
			println("set end to " + endpoint)
	}
	}
	found
	}
	
val x:Boolean =checker("ally", lines)

println("checker returns ")
println(x)