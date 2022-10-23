a = 5 > 2
b = 16 < 10 + 6
print( a or b )
print( a and b )
c = not a 
print( c or ("y" in "milk") )

k = 42 > 90
g = 42 > 50
h = 42 > 30
i = 42 > 0

if k:
    print( "apple" )  # NOT printed, because k is false
elif g:
    print( "orange" )  # NOT printed, because g is false
elif h:
    print( "banana" ) # printed, because h is true
elif i:
    print( "peach" )  # NOT printed, even though i is true
else:
    print( "all else" )  # NOT printed, because at least one of k, g, h, and i was true


