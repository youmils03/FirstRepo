import itertools as phoenix


for r in phoenix.count(22):  #itertools.count(x) yields x,x+1,x+2,x+3,...
    if r > 27:
        break
    print("Value: " + str(r))


t = 9 , 2 , 3 , 9 
s = 0

for q in phoenix.cycle(t):
    print( "Cycling now: " + str(q) )
    s += 1
    if s > 10:
        break
    else:  # Meaningless else statement after if-->break
        continue  # Meaningless continue statement at end of loop

counter = 0
for h in phoenix.repeat( [5,2] ):
    if counter == 6:
        break
    print( h )
    counter = counter+1  # or counter += 1


myPredicate = ( lambda p : p % 4 == 0 )
myIterable = ( 36 , 32 , 28 , 33 , 24 , 24 , 16 , 27 , 5 )

for F in phoenix.takewhile( myPredicate , myIterable ):
    print( 100 + F )


c1 = [3,2,3,[3,2,3]]
c2 = (9,4,[9,4],(9,4))
c3 = {5,5,5,5,5}

for c4 in phoenix.chain(c1,c2,c3,{2,4},c3):
    print(c4)


print( tuple( phoenix.chain( [4,2] , {5,9} , (1,3) , list(range(3) ) ) ) )


myCharacters = [ "APP" , "LE" , "SAU" , "CE" ]

print( list( phoenix.accumulate( myCharacters ) ) )


v1 = ( 9 , 3 , 2 , True )
v2 = [ "Fall" , False , 44 ]
v4 = [ ]  # empty list

for v3 in phoenix.product(v2,v1):
    v4.append(v3)


print(v4)  # a list of tuples, as itertools.product(x,y) yields tuples


quesadilla = [ 5 , "green hat" , "red hat" , True , False ]

j = 0

for k in phoenix.permutations(quesadilla):
    j += 1

print(j)  # can you guess this? (Hint: use a permutations function from the math module)
