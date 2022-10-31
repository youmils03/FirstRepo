from keyword import iskeyword

# REVIEW OF RUNNING MODULE AS A SCRIPT
if __name__ == "__main__":  # running a module as a script

    # REVIEW OF KEYWORD.ISKEYWORD(X)
    print( iskeyword( "water bottle" ) )
    print( iskeyword( "fortress" ) )
    print( iskeyword( "fortress"[0:3:1] ) )
    print( iskeyword( "range" ) )
    print( iskeyword( "LEN".lower( ) ) )

    # REVIEW OF TYPE(X) (and map(function,iterable))
    print( list( map( type , [ 5 , 3.2 , "eating" , not False , [9,2] , (3,0,1,3) , frozenset( {15,162} ) , {100} ] ) ) )

    #EXEC FUNCTION
    exec( "print( 23 + 36 )" )
    exec( "print( \"Hello, what is your name?\" )" )
    exec( "s = 24" )
    print( s // 2 )  # 12 

    command1 = "print( u := 600 + 2 )"
    command2 = "print( u > 400 )"
    command3 = "print(" + "type(u))"
    for cmd in ( command1 , command2 , command3 ):  # tuple
        exec(cmd)

    #ITERATORS

    a = list( "apple" )  # ["a","p","p","l","e"]

    b = iter(a)
      
    print(b)

    print( "a is a " , type(a) , ", b is a " , type(b) )

    print( tuple(b) )

    for c in b:
        print( c )

    M = ( 64, 69 ) + ( 73 , 70 , 66 )  # combined tuple
    N = iter(M)

    while True:
        try:
          print( next(N) )
        except StopIteration:
          print( "iterated through it already" )
          break
    
