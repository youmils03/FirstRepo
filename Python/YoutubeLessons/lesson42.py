from re import sub as awesomeSubstitution
from re import match as M, search as S

"""
re.sub( r"a" , "b" , "c" ) returns "c" with all instances of "a" replaced by "b"
"""

s = "Denver is a cool city, and Denver has a lot of cool activities"
print( awesomeSubstitution( r"Denver" , "Phoenix" , s ) )
print( s.replace( "Denver" , "Phoenix" ) )  # recall this functionality we studied in lesson 23

def isMatch( pattern , wordToCheck ):
    if M(pattern,wordToCheck):
        return True
    else:
        return False

def isSearch( pattern , wordToCheck ):
    if S(pattern,wordToCheck):
        return True
    else:
        return 5 > 8

"""
. matches ANY character
^ matches the beginning of a string
$ matches the end of a string
"""

L = "lobster"
print( isMatch( r"lob...." , L ) )  # True, L begins with lob and then 4 other characters
print( isMatch( r"lob.." , L ) )  # True, L begins with lob and then 2 other characters
print( isMatch( r"lob............." , L ) )  # False, L does not fit this regular expression
print( isSearch( r"lob...." , L ) )  # True, lob and then 4 other characters exist in L
print( isSearch( r"lob." , L ) )  # True, lob and then 1 other character exists in L
print( isMatch( r"ster" , L ) )  # False, L does not begin with ster
print( isSearch( r"ster" , L ) )  # True, ster exists in L

N = "magazine"
print( isMatch( r"^zine" , N ) )  # False, N does not begin with zine
print( isSearch( r"^zine" , N ) )  # False, N does not begin with zine
print( isMatch( r"zine$" , N ) )  # False, re.match( ) cannot validate matches at the end
print( isSearch( r"zine$" , N ) )  # True, N ends with zine
