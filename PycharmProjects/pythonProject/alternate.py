import json


class Person:

    def __init__(x):
        print( "create" )

    def __enter__(y):
        print( "with..." )

    def __exit__(self,x,y,z):
        print( "exiting" )

    def __del__(self):
        print( "deleting" )

    @classmethod
    def myMethod( c ):
        myDictionary = { True : int(True) , False : int(False) , str(5) : "five" }
        stringDictionary = json.dumps( myDictionary )
        print( len(stringDictionary) , stringDictionary )
        W = "{\"walrus\" : 44, \"elephant\": 70}"
        X = json.loads(W)
        print( len(X) )
        print( X["ele" + "phant"] // 9 )


def ssh(a):
    print( "ssh -X automation@10.30.28.84" )
    if a>1:
        ssh(a-1)


ssh(4)



x1 = Person( )  # __init__
del x1  # __del__
with Person() as x2:  #__init__ --> __enter__ --> body --> __exit__
    print( "sup" )
del x2  # __del__
Person.myMethod()


"""
Python reviewables:
73 NEW: Context Manager and the del magic method
74 NEWISH: Inheritance and Abstraction
75: Static and class methods and variables, factory methods
76: User Input, Docstrings, and String Formatting
77: Generators, Iterators, and Inner Functions
78: Review of Decorators
79: Review of Regular Expressions
80: Review of Callable Instances

Java reviewables:
73 NEW: Data structure #13 and overview
74 NEWISH: Data structure 14 and review of iterators
SIX CORE REVIEW LESSONS OF IMPORTANT TAKEAWAYS
75 More Inheritance and Abstraction Theory / Review / this(a,b)
76 Characterizations of Attributes: class/instance/method/final/public/protected/private
77 instanceof and User Input
78 Review of Sorting Algorithms
79 Review of Searching Algorithms
80 Review of Matrix Techniques and Numeric Types

THEN A BRIEFER REVIEW TO OUTLINE FUNDAMENTALS AGAIN
81. Lessons 1-6 review
82. Lessons 7-10 review
83. Lessons 11-13 review
84. Lessons 14-17 review
85. Lessons 18-20 review
86. Lessons 21-24 review
87. Lessons 25-28 review
88. Lessons 29-31 review
89. Lessons 32-35 review
90. Lessons 36-38 review
91. Lessons 39-42 review
92. Lessons 43-45 review
93. Lessons 46-49 review
94. Lessons 50-52 review
95. Lessons 53-56 review
96. Lessons 57-59 review
97. Lessons 60-63 review
98. Lessons 64-66 review
99. Lessons 67-70 review
100. Lessons 71-74 review

60 C# videos
"""

basketball = (5,3,2,3,9)
print( zip(list(basketball),basketball) )

a = iter(basketball)
print( list(a) )


