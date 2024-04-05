import java.util.Arrays;
import java.util.Scanner;

public class Questions {
    static int[] smallestAndLargestElement(int[] arr)
    {
        Arrays.sort(arr);

        int[] result = {arr[0], arr[arr.length-1]};

        return result;
    }

    static boolean isSorted(int[] arr)
    {
        boolean check = true;

        for(int i = 1;i < arr.length; i++)
        {
            if(arr[i] < arr[i-1])
            {
                check = false;

                break;
            }
        }
        return check;
    }

    static int lastOccurence(int[] arr, int x)
    {
        int lastindex = -1;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {
                lastindex = i;
            }
        }
        return lastindex;
    }

    static int countOccurrences(int[] arr, int x)
    {
        int count = 0;

        for(int i =0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " Elements : ");

        for(int i=0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x : ");
        int x = sc.nextInt();

        System.out.println("Count of " + x +  " : "  + countOccurrences(arr, x));
        
        System.out.println("Last Index of " + x +  " : "  + lastOccurence(arr, x));
        
        System.out.println("Is Sorted : " + isSorted(arr));

        int[] ans = smallestAndLargestElement(arr);

        System.out.println("Smallest Element : " + ans[0]);

        System.out.println("largest Element : " + ans[1]);

        sc.close();
    }
}
