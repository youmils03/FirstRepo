class Queue:

    def __init__(q):  # generates a new queue based on a list which is initially empty
        q.__items = [ ]
        
    def __len__(self):  # defines the length of an instance of the Queue class
        return len(self.__items)
        
    def isEmpty(self):
        """Defines what it means for a queue to be empty. Determine whether the length of its implementing list is zero
        
        @return True if the list implementing the queue is empty, False otherwise"""
        return len(self) == 0
    
    def push(u,item): 
        """
        Adds an item to the end of the queue and optionally returns it
        
        NOTE: In the Youtube video, I add to the beginning and remove from the end
        In THIS implementation, I will add to the end and remove from the beginning
        
        @param item the item to add
        @return item the new item added to the end (back) of the queue
        """
        u.__items.append(item)
        return item
        
    def peek(x):
        """Returns but does not remove the item at the front of the queue
        
        @return the end of the queue
        """
        return x.__items[0]
        
    def pop(sun):  # sun is just an instance method designator, not an input to this function
        """Returns AND removes the item at the front of the queueu
        
        @return the end of the queue which is being removed as a result of invoking this method"""
        
        val = sun.__items[0]  # Record the first element to a variable
        sun.items = sun.__items[1:]  # Chop off the first element
        return val  # Return the element that was removed from self.items
    
   
    def printQueue(self):
        for w in self.__items:
            print(w)
   

u = Queue( )
print( u.push(32) )  # 32 is the first value in the queue. Print a 32
u.push(38)  # [32,38]
u.push( "watermelon" )  #[32,38,"watermelon"]
u.push( "walnut" )  # [32,38,"watermelon","walnut"]
u.push( u.peek( ) )  # adds another 32 to the end of the list [32, 38, "watermelon", "walnut", 32]
print( u.pop( ) )  # returns and removes the 32 at the end of the list. Prints another 32,
u.printQueue( )  # prints [38, "watermelon", walnut",32]
