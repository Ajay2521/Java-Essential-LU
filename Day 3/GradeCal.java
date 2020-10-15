import java.lang.*;
import java.util.*;

public class GradeCal{

    public static void main(String[] args)
    
    {

        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter your Name : ");
        String Name = s.next();

        System.out.print("\nEnter Mark 1 out of 100 : ");
        int m1 = s.nextInt();
 
        System.out.print("\nEnter Mark 2 out of 100 : ");
        int m2 = s.nextInt();
        
        System.out.print("\nEnter Mark 3 out of 100 : ");
        int m3 = s.nextInt();
        
        System.out.print("\nEnter Mark 4 out of 100 : ");
        int m4 = s.nextInt();
        
        System.out.print("\nEnter Mark 5 out of 100 : ");
        int m5 = s.nextInt();
        
        double Avg = (m1+m2+m3+m4+m5)/5;

        if ( Avg >= 90 && Avg < 101 )
        
        {

            System.out.println("\nYour percentage is "+Avg+" for which you have got A grade.");

        }

        else if ( Avg >= 80 && Avg < 90 )
        
        {

            System.out.println("\nYour percentage is "+Avg+" for which you have got B grade.");

        } 

        else if ( Avg >= 70 && Avg < 80 )
        
        {

            System.out.println("\nYour percentage is "+Avg+" for which you have got C grade.");

        }

        else if ( Avg >= 60 && Avg < 70 )
        
        {

            System.out.println("\nYour percentage is "+Avg+" for which you have got D grade.");

        }

        else if ( Avg >= 50 && Avg < 60 )
        
        {

            System.out.println("\nYour percentage is "+Avg+" for which you have got E grade.");

        }
        
        else
        
        {

            System.out.println("\nSorry You have failed.");

        }


    }

}