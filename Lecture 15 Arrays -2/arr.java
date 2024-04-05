import java.util.Arrays;
import java.util.Scanner;

public class arr {
    static void changeArray(int[] arr)
    {
        for(int i=0; i < arr.length; i++)
        {
            arr[i] = 0;
        }
    }

    static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements : ");

        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " Elements : ");

        for(int i=0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        printArray(arr);

        // int[] arr_2  = arr.clone();

        // int[] arr_2 = Arrays.copyOf(arr, arr.length);

        int[] arr_2 = Arrays.copyOfRange(arr, 0, arr.length);

        System.out.println("Copied Array : ");
        printArray(arr_2);

        // Changing some values of arr_2

        arr_2[0] = 0;
        arr_2[1] = 100;

        System.err.println("Original array after changing arr_2");
        printArray(arr);
        
        System.err.println("Copied array after changing arr_2");
        printArray(arr_2);
 
        sc.close();
    }
    
}