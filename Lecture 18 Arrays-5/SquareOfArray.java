import java.util.Scanner;

public class SquareOfArray {
    /*
    Given an integer array 'a' sorted in non-decreasing order
    , return an array of the squares of each number sorted 
    in non-decreasing order
     */
    
    static void printArray(int[] arr)
    {
        int n = arr.length;

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] sortSquares(int[] arr)
    {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n-1;

        while (left <= right) 
        {
            if(Math.abs(arr[left]) >= Math.abs(arr[right]))
            {
                ans[k--] = arr[left] * arr[left];
                left++;
            }    
            else
            {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original array : ");
        printArray(arr);

        int[] ans = sortSquares(arr);
        System.out.println("Sorted array : ");
        printArray(ans);      
        
        sc.close();
    }
}
