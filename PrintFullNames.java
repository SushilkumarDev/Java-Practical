
// Write a class with the name Name. The class needs two fields (instance variables) with names firstName and lastName both of type string.  

// Write the following methods (instance methods):

// Method named getFirstName without any parameter, it needs to return the value of firName field.
// Method name getLastName without any parameter, it needs to return the value of lastName field.
// Method named setFirstName with one parameter of type string, it needs to set the value of firstName field.
// Method named setLastName with one parameter of type string, it needs to set the value of lastName field.
// Method named getName without any parameters, it need to return the full name i.e. “firstName space lastName”.
//   For example ,  

// setFirstName(“Sudhir”)-> set the value of firstName as “Sushilkumar”.
// setLastName(“Dhangar”)-> set the value of lastName as “Yadav”.
// getName()-> it will return the full name as “Sushilkumar Yadav”.


public class PrintFullNames
{
    String firstName;
    String lastName;
  
    public String getFirstName ()
    {
        return firstName;
    }
    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName ()
    {
        return lastName;
    }
    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }
    public String getName ()
    {
        return getFirstName () + " " + getLastName ();
    }
    
    public static void main (String[]args)
    {
        PrintFullNames obj = new PrintFullNames ();
        obj.setFirstName ("Sushilkumar");
        obj.setLastName ("Yadav");
        String name = obj.getName ();
        System.out.println (name);
    }
}