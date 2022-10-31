class PBV:
  
    @classmethod
    def tryUpdating(c,x):
      """Class method that shows that x comes in by value, not by reference
      @param x the variable to try concatenating a string onto"""
      x += " is awesome"
      
    def __init__(self,val):
      self.val = val
      
    def update1(self):
      """Solution 1 to the pass by value phenomenon: Use an instance variable"""
      self.val = self.val + " is awesome"
      
    @classmethod
    def update2(c,x):
      """Solution 2 to the pass by value phenomenon: Use a direct return statement
      @param x the variable to concatenate a string onto
      @return the variable with the string concatenated on"""
      return x + " is awesome"
    
    @staticmethod
    def update3(x):
      """Solution 3 to the pass by value phenomenon: Use a list with at least one element"""
      x[0] += " is awesome"

print( chr(84) )
print( chr(85) )
print( chr(86) )

print( ord("$") )
print( ord("5") - ord("4") )  # the ASCII character codes for the digits "5" and "4" should only be off from one another by 1
print( ord("5") )

print( ord(chr(119)) )
print( chr(ord('t') ) )

def f(s,t):
  print( "just gonna return the frozen-set implementation of the zip generator" )
  return frozenset( zip(s,t) )  # unordered and immutable


a = f( (3,0,2) , [9,9,True] )

for k in range(3):
  print( a )


assert list(enumerate([4,4,2]) ) == list( zip( list( range( len( [4,4,2] ) )), [4,4,2]))  # throws an error if False

print( "yup, enumerate is just zip(list(range(len(x))),x)" )

# Pass by value

PBV.tryUpdating(t := "Jake")
print(t)

u = PBV("Stephanie")
u.update1( )
print( u.val )

v = "Blanca"
print( PBV.update2(v) )

w = [ "Teddy" ]
PBV.update3(w)

for x in w:
  print(x)
