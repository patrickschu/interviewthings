#!/usr/bin/env scala

val lines = scala.io.Source.fromFile("/Users/ps22344/Downloads/interviewthings/namess.txt").getLines.toList



println(lines)
def checker(new_name:String, old_names:List[String]) : String=
	{
	val sortednames:List[String] = old_names.sorted
	println(new_name + "input list is length " + sortednames.length)
	//set vars
	var found:Boolean = false
	var startpoint:Int = 0
	var endpoint:Int = sortednames.length/2
	println("start: "+startpoint+" send: "+endpoint)
	while (found == false)
	{
	var listwindow = sortednames.slice(startpoint, endpoint)
	println(listwindow)
	
	//println(found)
	} 
	"assikind"
	}
	
val x:String =checker("ali", lines)

println("checker returns "+x)