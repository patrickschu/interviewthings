#match user name
import io
#read list
with io.open('/Users/ps22344/Documents/usernames.txt', "r", encoding = "utf-8") as inputi:
	names_list= inputi.read().split("\n")

print names_list


#sort alpha
names_list= sorted(names_list)
print names_list
#names_list=["assi", "depp]

#function to check:
#try middle, exlude above or below, repeat
#check name in middle of list

def checker(new_name, old_names):
	print "\n\ninitializing the checker"
	print "searching for ", new_name
	print "old names", old_names
	
	first= 0
	last= len(old_names)
	namematch= False
	while not namematch and len(old_names) > 3:
		old_names = old_names[first:last]
		print "\n\n***", old_names
		print "length of old names", len(old_names)
		middle= len(old_names)/2
		print "middle item is", old_names[middle], "middle is", middle
		if old_names[middle] == new_name:
			namematch= True
			print "hellyeah", new_name
		else:
			if sorted(list((new_name, old_names[middle])))[0] != new_name:
				print "word is to the right"
				first = middle
			else:
				print "word is to the left"
				last= middle
		t= raw_input("yo")
		
	#elif namematch:
	#	print "HEERE ST HE RESULT", new_name.upper()
	
checker('zotti', names_list)
	



	

