
//FIZZBUZZ
for (i <- (1 to 100)) {
if (i % 5 == 0 && i % 3 == 0)
	{println ("Fizzbuzz" + i)}
else if (i % 5 == 0)
	{println ("Fizz" + i)}
else if (i % 3 == 0)
	{println ("Buzz" + i)}
}


(1 to 100).map( i => (i % 3,  i % 5) match {
	case (0,0) => "FizzBuzz"
	case (0,_) => "Fizz"
	case (_, 0) => "Buzz"
	case _ => i
	}
).foreach(println)


(1 to 100).map( i => println((i % 3,  i % 5)))
