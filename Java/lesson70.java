public class Person
{
    private int num;
  
    Person( int x )
    {
        this.num = x;
    }
  
    public void addTwo( )
    {
        this.num += 2;
    }
  
    public static int returnTwoMore( int t )
    {
         return t + 2;
    }
  
    public static void addTwoToFirst( int [ ] e )
    {
        e[0] = e[0] + 2;
    }
  
    public static void fail( int x )
    {
        x += 2;
    }
  
    public int getNum( )
    {
          return this.num;
    }
  
    public static void main( String args [ ] )
    {
        int q = 400;
        Person.fail(q);
        System.out.println(q); //expected 402, got 400
      
        Person p = new Person(100);
        p.addTwo( );
        System.out.println( p.getNum() ); //expected 102, got 102
      
        int value = 5000;
        System.out.println( returnTwoMore(value) ); //expected 5002, got 5002
      
        int [ ] array = { 30000 };
        addTwoToFirst( array ); //or Lesson70.addTwoToFirst(array);
        System.out.println( Arrays.toString(array) ); //expected [30002], got [30002]
    }
