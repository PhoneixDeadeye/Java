import java.util.Scanner;

public class SumBetweenIndices {
    /*
    Given an array of integers of size n. Answer q queries 
    where you need to print the sum of values in a given
    range of indices from 1 to r(both excluded).
    Note : The values of 1 and r in queries follow 1- 
    based indexing.
     */

    static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     
    static int[] makePrefixSumArray(int[] arr)
    {
        int n = arr.length;
          for(int i = 1; i < n; i++)
        {
            arr[i] += arr[i-1];
        }
        return arr;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
 
        System.out.println("Enter " + n + " elements");
        for(int i = 1; i <= n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);
        
        int[] prefSum = makePrefixSumArray(arr);
        
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();

        while(q-- > 0)
        {
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];

            System.out.println("Sum : " + ans);
        }

        sc.close();
    }
}
