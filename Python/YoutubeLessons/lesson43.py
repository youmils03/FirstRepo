import re as R

print( "sup" , "dude" , "not" , "much" )  # sup dude not much

# print(x,y,...) prints x, then a space, then y, then a space, ... all on the same line

def isMatch(p,w):
    if R.match(p,w):
        return True
    else:
        return False

def isSearch(p,w):
    if R.search(p,w):
        return True
    else:
        return False


string = "Boston has basketball"
print( ( R.search( r"has" , string ) ).group( ) )
print( ( R.search( r"has" , string ) ).span( ) )
print( R.sub( r"Boston" , "San Antonio" , string ) )

print( isMatch( r"...t" , string ) )  # true, does not begin with 3 characters and then t
print( isMatch( r"ball$" , string ) )  # false, re.match( ) does not match on the end of a string
print( isSearch( r"b.ll$" , string ) )  # true, string ends with b, then something, then ll
print( isSearch( r"^bal." , string ) )  # false, string does not begin with bal then a letter

print( R.findall( r"a" , string ) )
print( set( R.findall( r"a" , string ) ) )  # would only have 1 element... "a" (no duplicates in a set)

myNumber = "804-555-1964"

print( isMatch( r"[0-9][0-9][0-9]" , myNumber ) )  # True, string begins with 3 digits
print( isSearch( r"[^0-9][^0-9]" , myNumber ) ) # False, there are never 2 consecutive non-digits
print( isSearch( r"^[^0-9]" , myNumber ) )  # False, ^ checks for beginning. Begins with a digit.
print( isSearch( r"-..64$" , myNumber ) )  # True, ends with dash, then 2 chars, then 64

# We want a list with all occurrences of having at least 2 repetitions of XYZ-
# They have to be consecutive, and it needs to occur 2 or 3 consecutive times
# This occurs once, at the beginning: 804-555-
# The resultant list contains only the UNIT/ATOMIC repetition matched, which was [0-9][0-9][0-9]
print( R.findall( r"([0-9][0-9][0-9]-){1,3}" , myNumber ) )

print( isSearch( r"(ice){2,4}" , "ice cream and ice cubes" ) )  # never does ice occur 2-4 times consecutively
print( R.findall( r"^(44){2,3}" , "44444" ) )  #Does 44444 begin with 2 or 3 repetitions of "44"? Yes, it begins with "44"+"44"

x = R.search( r"[^0-9].." , myNumber )
print( x.group( ) )  # the string that was matched, one of them
print( R.findall( r"[^0-9].." , myNumber ))  # all occurrences that were matched, in a list
print( x.group(0) )

groupPattern = r"a(b(c))(defg)((h)i)(j)klmno(p(q(r)))(s(t))uv(wx)."
a = "abcdefghijklmnopqrstuvwxyz"
W = R.match( groupPattern , a )

print( "W.group(): " , W.group( ) )  # the entire substring matched, here 25 of 26 letters
  # W.group( ) == W.group( 0 ) if W == re.match( r"myPattern" , myWordToCheck )
print( "W.groups(): " , W.groups( ) ) # a tuple containing all groups in r"myPattern"
print( "W.group(0): " , W.group(0) )  # the entire substring matched, here 25 of 26 letters
print( "W.group(1): " , W.group(1) )  # first group

for s in range(2,60):
    try:
        print( "W.group(" + str(s) + "): " , W.group(s) )
    except Exception as E:
        print( E )
        print( "For that reason, I'm leaving this loop" )
        break



"""
| = or metacharacter
"""


print( isMatch( r"[0-2]|[7-9]" , "41" ) )  # false, 41 does not begin with a 0, 1, 2, 7, 8, or 9
print( isSearch( r"4|[a-c]...e$" , "oranges and apples" ) )  # false, neither regex applies
print( isSearch( r"4$|^6" , "66" ) ) # true, 66 either ends with 4 or begins with 6
