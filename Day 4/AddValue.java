import java.util.*;

public class AddValue{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int arr[] = new int[5];

        int sum=0;

        for(int i = 0; i<5; i++)
        
        {

            System.out.print("\nEnter the value for "+(i+1)+" number : ");

            arr[i] = s.nextInt();

        }

        for (int i = 0 ; i<5 ; i++)
        
        {

            sum=sum+arr[i];

        }

        System.out.print("\nThe sum value from the givent list of integer array is : "+sum+"\n");
        
    }

}
