//IMPORT THESE CLASSES INTO SEPARATE JAVA FILES

public class Person
{
    private String name;
    private int age;
  
    Person( String u , int v )
    {
        this.name = u;
        this.age = v;
    }
  
    Person( )
    {
        this( "Henry" , 30 );
    }
  
    Person( int e )
    {
        this( "John" , e );
    }
 
    //no constructor specified to only accept a name but provide a default age. Can write one on your own
  
    public String getName( )
    {
        return this.name;
    }
  
    public int getAge( )
    {
          return age;
    }
  
    public void setName( String p )
    {
          this.name=p;
    }
  
    public void setAge( int zebra )
    {
          this.age = zebra;
    }
  
    public String toString( )
    {
          return this.name + " is " + this.age + " years old";
    }
}

public class Student extends Person
{
    private double GPA;
    
    Student( String name , int a , double GPA )
    {
        super( name , a ); 
        this.GPA = GPA;
        if( this.GPA < 2 )
        {
            System.out.println( "slacker!" );
        }
    }
    
    Student( )
    {
        super( 22 );
        this.GPA = 3.64; //creates a 22-year-old named John with a GPA of 3.64
    }
    
    Student( String f , double d )
    {
        super( );
        this.GPA = d; //creates a 30-year-old named Henry with the GPA specified by d
    }
    
    Student( int x )
    {
        super( "Quentin" , x );
        GPA = 2.80; //creates Quentin with a 2.80 GPA and the age specified by x
    }
    
    public String getName( )
    {
        return super.getName( ); //unnecessary, happens by default due to inheritance
    }
    
    public void setAge( int j )
    {
        super.setAge(j); //unnecssary, happens by default due to inheritance
    }
    
    public String toString( )
    {
        return super.toString( ) + " and has GPA " + this.GPA;
    }
    
    public double getGPA( )
    {
        return this.getGPA( );
    }
    
    public void study( )
    {
        this.GPA += 0.05;
    }
    
    public static void main(String args[] )
    {
        Student a = new Student( "Amber" , 36 , 0.64 );
        Student b, c, d;
        b = new Student();
        c = new Student(64);
        d = new Student("Eddie",3.16);
        Student [] classroom = {d,c,b,a};
        
        for( Student s : classroom )
        {   
            System.out.println( (s.getName()).lastIndexOf( "e" ) );
            s.setAge( 1 + s.getAge() );
            System.out.println( s.setAge() );
            System.out.println( "GPA for " + s.getName() + " before studying: " + s.getGPA() );
            s.study();
            System.out.println( "GPA for " + s.getName() + " after studying: " + s.getGPA() );
            System.out.println(s);
        }
    }
}
    
