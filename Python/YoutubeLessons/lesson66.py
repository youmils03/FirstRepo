from json import loads, dumps

class FrozenDictionary:  # generate a FrozenDictionary class, like we did for Stacks (lesson 54) and Queues (lesson 55)

    def __init__(d, myDictionary):  # the first "input" to an instance method or class method is not actually an input
        d.dictionary = myDictionary
        
    def __len__(t):  # length of a frozen dictionary given by the length of the dictionary which implements the frozen dictionary
        return len(t.dictionary)
        
    def __getitem__(s,item):
        if not (item in s.dictionary):
            return "Doesn't exist here. Never will. (Frozen)"
        else:
            return s.dictionary.get(item)  # or s.dictionary[item]
    
    def __setitem__(s,item,value):
        if not ( s.dictionary[item] == value ):  # Unless the assignment we're trying to make is for the same value...
            raise TypeError( "Cannot modify the key-value pairs in a frozen dictionary" )  # IMMUTABLE
            
    def get(s,item):
        if item in s.dictionary:
            return s.dictionary.get(item)  # define get(x) for a frozen dictionary by get(x) for a regular dictionary
        else:
            return "Doesn't exist here. Never will. (Frozen)"
            
    def __str__(self):  # string representation of a frozen dictionary. Just apply the concise formatted string
        return f"{self.dictionary}"
        
    def __contains__(self,item):
        print( self.dictionary )
        return eval( "not (item not in self.dictionary.keys( ))" )  # eval converts the string to a boolean
              # Double negatives just for fun. y in frozen dictionary D if and only if y in E.keys( ), where E was the
              # dictionary which implemented D
              
    def containsValue( self , value ):
        return eval( "value in (self.dictionary).values( )" )
        
    def __add__(self,other):
      """
      Defines the combination/sum/concatenation of two frozen dictionaries
      For the first dictionary being added, simply grab all those key-value pairs
      For the second dictionary being added, grab only the key-value pairs such that the key does not already exist in the first dictionary
    
      @param other, the frozen dictionary to combine with the current dictionary  
      @return the combined frozen dictionary"""
  
      implementingDictionary = dict( )  # empty dictionary
    
      for k in self.dictionary.keys( ):
          implementingDictionary.update( { k : self.dictionary[k] } )  # or implementingDictionary[k] = self.__dictionary.get(k)
    
      for v in other.dictionary.keys( ):
          if not (v in self):  # invokes the __contains__ magic method as defined above
              implementingDictionary[v] = other.dictionary[v]
          else:             # unnecessary code
              pass          # else/pass not needed. Implied.
            
      return FrozenDictionary( implementingDictionary )  # convert it to a FrozenDictionary and return it
    
    @classmethod
    def generateFrozen1( c , myDictionary ):
        return FrozenDictionary( myDictionary )
        
    @staticmethod
    def generateFrozen2( myDictionary ):
        return FrozenDictionary( myDictionary )
        
    def keys(s):
        return s.dictionary.keys( )
        
    def values(s):
        return s.dictionary.values( )
        
    def items(s):
        return s.dictionary.items( )
        
    def __eq__(u,v):  # recall the __eq__ magic method? See lesson 36 for a refresher
      """
      Defines what F==G means for two frozen dictionaries F and G
      """
      result = True
      try:
        assert set( u.keys( ) ) == set( v.keys( ) )  # the keys are unique but unordered, so compare the sets not the lists/tuples
        for x in u.keys( ):
            if not ( v[x] == u[x] ):  # if any of the values don't match...
                result = False  #...then they're not the same frozen dictionary
                break
      except AssertionError as DifferentSizes:
        result = False

      return result
    
        
a = "{\"A\": 95, \"B\": 85, \"C\": 75, \"F\": \"not good\"}"
print( type(a) )
print( len(a) )
print( type( a := loads(a) ) )
print( len(a) )
print( a["C"] )
print( a.get( "B" ) )

frozen1 = FrozenDictionary( a )  # constructor to generate a Frozen Dictionary
frozen2 = FrozenDictionary.generateFrozen1( a )  # factory (class) method to generate a Frozen Dictionary
frozen3 = FrozenDictionary.generateFrozen2( a )  # factory (static) method to generate a Frozen Dictionary

print( len(frozen2) == len(frozen3) )  # both values are constant and should be equal to each other. Invokes the __len__ magic method

print( frozen1[ "A" ] )  # invokes __getitem__ defined above
print( frozen3.get( "F" ) )  # invokes get defined above
# print( 95 in frozen3 )  # invokes __contains__ defined above
# print( frozen3.containsValue(94) or frozen3.containsValue(94+1) )  # invokes containsValue defined above 

print( frozen1 == frozen2 )  # invokes __eq__ defined above

u = {4:44,5:55,6:66}
v = {7:77,8:88,6:99}  # one key shared with u
u , v = FrozenDictionary(u), FrozenDictionary(v)  # tuple unpacking
print( u + v )  # invokes __add__, then __str__
