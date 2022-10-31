class Stack:

    def __init__(s):
        """Generates a new stack based on no initial elements"""
        s.items = []

    def __len__(s):
        """Gives the number of elements in the stack

        @return the size of the list, giving the length of the stack object"""

        return len(s.items)

    def isEmpty(self):

        """Defines what it means for a stack to be empty

        @return True if and only if the length of the list representing
        the stack is empty"""
        return len(self) == int(False)  # 0

    def push(self,item):
        """Adds an item onto the top of the stack and returns it

        @return the new element being added to the top of the stack"""
        self.items.insert( 0 , item )
        return item

    def pop(s):
        """Returns and removes the topmost element of the stack

        @return the topmost element which is being removed by calling this method"""
        toRemove = s.items[0]
        s.items.remove(toRemove)
        return toRemove

    def peek(s):
        """Peeks at the top of the stack without removing the element

        @return the uppermost element, without removing it"""
        return s.items[0]

    def printStack(self):
        """Print the stack, from uppermost element to bottommost"""
        for element in self.items:
            print(element)


S = Stack( )
S.push(42)
S.push(49)
S.push(52)
print( S.pop( ) )
print( len(S) )
print( S.peek( ) )
S.push(64)
S.push(70)
S.push(S.peek())
S.printStack( )
print( S.isEmpty( ) )
