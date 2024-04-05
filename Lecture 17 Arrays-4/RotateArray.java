import java.util.Scanner;

public class RotateArray {
    /*
    Rotate the given array 'a' by k steps, where k is 
    non-negative. k can be greater than n as well.
     */
    
    static int[] rotate(int[] arr, int k)
    {
        int n = arr.length;

        k = k % n;

        int[] ans = new int[n];
        
        int j = 0;

        for(int i = n-k; i < n; i++)
        {
            ans[j++] = arr[i];
        }

        for(int i = 0; i < n-k; i++)
        {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println("Enter the number of Elements : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");
        for(int i =0 ; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k : ");
        int k = sc.nextInt();

        System.out.println("original Array : ");
        printArray(arr);
        
        int[] ans = rotate(arr, k);

        System.out.println("Array after rotation : ");
        printArray(ans);   
        
        sc.close();
    }
}
