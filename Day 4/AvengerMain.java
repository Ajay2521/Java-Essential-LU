
import java.util.*;

class Avenger {

    public String Name;
    public int Age;
    public String Weapon;
    public String Planet;

    Scanner s = new Scanner(System.in);
    
    public void getDetails(){

        System.out.print("\nEnter Avenger Name : ");
        Name=s.nextLine();

        System.out.print("\nEnter Avenger Age : ");
        Age=s.nextInt();
        
        System.out.print("\nEnter Avenger Weapon : ");
        Weapon=s.next();
        s.nextLine();

        System.out.print("\nEnter Avenger Planet : ");
        Planet=s.nextLine();

    }

    public void displayDetails(){

        System.out.print("\n\nHey "+Name);
        System.out.print("\n\n"+Name+" age is "+Age);
        System.out.print("\n\n"+Name+" weapon is "+Weapon);
        System.out.print("\n\n"+Name+" is from "+Planet);

    }

}

public class AvengerMain {

    public static void main(String[] args){

        Avenger[] avengers=new Avenger[5];

        for(int i=0; i<5; i++)
        {

            avengers[i]=new Avenger();
            System.out.println("\n\nEnter "+(i+1)+" avenger details...\n");
            avengers[i].getDetails();

        }
        
        for(int i=0; i<5; i++)
        {

            System.out.println("\n\n\nDetails of "+(i+1)+" avenger is...");
            avengers[i].displayDetails();
         
        }

        System.out.println();

    }

}