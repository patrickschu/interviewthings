#!/usr/bin/env scala

val lines = scala.io.Source.fromFile("/Users/ps22344/Downloads/interviewthings/namess.txt").getLines.toList

def comparer(name_one:String, name_two:String): Boolean = name_one match 
	{
	case `name_two` => true
	case _ => false
	}

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
	//println("start: "+startpoint+" end: "+endpoint)
	var listwindow : List[String] = sortednames.slice(startpoint, endpoint)
	//println(listwindow(2))
	var mid :Int = startpoint + endpoint/2
	println("mid is" + mid)
	//val t = comparer("assi", "assi")
	
	found = comparer (new_name, listwindow(mid))	
	
	println("new name" + new_name)
	println("istwindow" + listwindow(mid))
	if (new_name > listwindow(mid)) {
		startpoint = mid +1
		}
	if (new_name < listwindow(mid)) {
		//not sure if this # is correct
		endpoint = mid - 1 
		}

	println(found)
	}
	"assikind"
	}
	
val x:String =checker("assi", lines)

println("checker returns "+x)