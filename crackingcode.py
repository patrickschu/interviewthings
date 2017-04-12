import hashlib

print(hashlib.algorithms_available)


obbi=hashlib.sha1("man oh man").hexdigest()

print obbi

#1.2
#given two strings, decide if one is a permutation of the other

def permutationfinder(str_one, str_two):
	list_one= sorted(list(str_one))
	list_two= sorted(list(str_two))
	print list_one, list_two
	if list_one == list_two:
		print "permutation it is"
	else:
		print "no permutaion here!"
		
	

#permutationfinder("assi", "issa")


#we have nodes we add to the queue
nodes=[1,2,10,20]
#first in, first out
#add node to stack
#3 STACKS & QUEUES
class MyStack(object):
	def __init__(self):
		self.stack=[]
	def add(self, inputi):
		self.stack.append(inputi)

	
	
t=MyStack()

for x in range(0,20):
	t.add(x)

#print t

#chptr 4
#TREES
class Node(object):
	def __init__(self,children):
		if len(children) == 2:
			self.left_branch, self.right_branch=children
		else:
			self.left_branch= children
tree=Node([1, 2])

t=Node([1, 2])
print t
##THIS NEEDS WORK
def traverse(node):
	if not any((node.left_branch, node.right_branch)):
		print "Exit, Error w/ start_node"
	else:
		print "Let's traverse"
		traverse(node.right_branch)
		traverse(node.left_branch)
		#traverse
	
		
	
		

traverse(Node([1,2]))
