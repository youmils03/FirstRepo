//please refer to the Person and Student classes and import them for use with this main method

public class Lesson32
{
    public static void main( String args[] )
    {
        Object a = new Person( "Kyle" , 29 ); //polymorphism
        System.out.println(a);
        //System.out.println(a.getName()); //doesn't work, Object class does not recognize getName()
        
        Object b;
        b = new Student("Luke",1.99); //polymorphism
        System.out.println(b);
        //b.study(); //doesn't compile
      
        Person c = (Person)(b); //explicit cast to subclass
        System.out.println( b.getAge() ); //works, Person recognizes getAge()
        //System.out.println( c.getGPA() ); //doesn't work, Person doesn't recognize getGPA()
        
        Student d = (Student)(b); //explicit cast to subclass
        d.study();
        System.out.println(d); //not the exact same as printing b earlier, but close
    }
}
