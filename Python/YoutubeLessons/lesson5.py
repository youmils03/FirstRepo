a = input( "What is your name? ")  #input(x) scans for user input
b = "Your name has " + str(len(a)) + " characters in it"
print(b)

u = input( "Give me a number..." )
u = int(u)  #input(x) returns a string so need to convert for numbers
v = int( input( "One more please..." ) )  #can do it on the same line
print( "Then the sum is " + str( u+v ) )  #must convert back to a string
