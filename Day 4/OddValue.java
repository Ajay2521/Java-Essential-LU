import java.util.*;

public class OddValue{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i = 0; i<5; i++)
        
        {

            System.out.print("\nEnter the value for "+(i+1)+" number : ");

            arr[i] = s.nextInt();

        }

        System.out.print("\nThe odd values from the givent list of integer array is : ");
        
        for (int i = 0 ; i<5 ; i++)
        
        {

            if(arr[i]%2 != 0){

                System.out.print(arr[i]+"\t");

            }

        }

        System.out.println();

    }

}
