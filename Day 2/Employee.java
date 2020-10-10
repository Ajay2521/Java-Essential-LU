import java.util.*;

public class Employee{

    // declaring the employee variable name, age and city as global variable

    String Name;

    int Age;

    String City;

    // display function to print details of the employee.

    public static void display(String name,int age,String city)
    
    {

        System.out.print("\n\nThe Name is "+name);

        System.out.print("\n\nThe Age is "+age);

        System.out.print("\n\nThe City is "+city);
        
    }

    // Main function of the program.
    public static void main(String[] args)
    
    {

        // creating object 1.

        Employee e1 = new Employee();
        e1.Name="Maayon";
        e1.Age=19;
        e1.City="Chennai"; 
        
        // calling the function to display the object 1 details.

        display(e1.Name,e1.Age,e1.City);

        System.out.println();
        
        // creating object 2.
        
        Employee e2 = new Employee();
        e2.Name="Ajay";
        e2.Age=19;
        e2.City="Cbe";

        // calling the function to display the object 2 details.
        
        display(e2.Name,e2.Age,e2.City);
        
        System.out.println();
        
    }

}