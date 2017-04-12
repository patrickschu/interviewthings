#FIZZBUZZ


# for i in range(1,101):
# 	if (i%5 == 0) and (i%3 == 0):
# 		print i, "FIZZBUZZ"
# 	elif i%5 == 0:
# 		print i, "buzz"
# 	elif i%3 == 0:
# 		print i, "fuzz"


for i in range(1,101):
	if ((-1)**i == 1):
		print i, "EVEN"
	else:
		print "UNEVEN"
		
		
#Write loop from 1 to 10
#Dont range it
start=1

# while start < 11:
# 	print start
# 	start= start +1 
	
	
# for i in range(1,101):
# 	print"Fizz"*(i==100)+"Buzz"*(i%5<1)or i

def isdev(number):
	print number
	while number > 0:
		number = number - 3
	#print number
	print number == 0	
	return number == 0

for i in range(0,10):
	isdev(i)