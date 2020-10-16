import java.util.*;

public class OddValue{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int arr[] = new int[5];

        arr[0] = 15;

        arr[1] = 20;
        
        arr[2] = 31;

        arr[3] = 45;

        arr[4] = 50;

        System.out.print("\nThe Value present in the integer array is :\t");

        for (int i = 0 ; i<5 ; i++)
        
        {

            System.out.print(arr[i]+"\t");

        }

        System.out.print("\n\nThe odd values from the givent list of integer array is :\t");

        for (int i = 0 ; i<5 ; i++)
        
        {

            if(arr[i]%2 != 0)
            {

                System.out.print(arr[i]+"\t");
            }

        }
        
        System.out.println();
        
    }

}
