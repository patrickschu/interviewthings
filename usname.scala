#!/usr/bin/env scala

val lines = scala.io.Source.fromFile("/Users/ps22344/Downloads/interviewthings/namess.txt").getLines.toList



println(lines)
def checker(new_name:String, old_names:List[String]) : String=
	{
	val sortednames:List[String] = old_names.sorted
	println(new_name + "input list is length " + sortednames.length)
	//set vars, initialize
	var found:Boolean = false
	var startpoint:Int = 0
	var endpoint:Int = sortednames.length-1
	while (found == false)
	{
	println("start: "+startpoint+" end: "+endpoint)
	var listwindow : List[String] = sortednames.slice(0,3)
	println(listwindow)
	var mid :Int = startpoint + endpoint/2
	new_name match
	{
		//case listwindow(2) => println("found")
		case _ => "sth else"
	}
	}
	"assikind"
	}
	
val x:String =checker("assi", lines)

println("checker returns "+x)