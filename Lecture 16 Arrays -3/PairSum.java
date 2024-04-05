import java.util.Scanner;

public class PairSum{
    /* 
    Question - 
    Find the total number of pairs in the Array whose sum 
    is equal to the value of x
     */

    static int pairSum(int[] arr, int target)
    {
        int n = arr.length;

        int ans = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter target sum : ");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));

        sc.close();

    }
}