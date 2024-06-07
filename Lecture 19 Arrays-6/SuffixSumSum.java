import java.util.Scanner;

public class SuffixSumSum {

    static int arraySum(int[] arr){
        int totalSum = 0;

        for(int i=0; i < arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum = arraySum(arr);
        int suffixSum = 0;
        int len = arr.length - 1;

        for(int i = len; i >= 0; i--){
            suffixSum += arr[i];
            int prefixSum = totalSum - suffixSum;
            if(suffixSum == prefixSum){
                return true;
            }    
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();    
        }

        System.out.println("Equal Partition Possible : " + equalSumPartition(arr));
        
        sc.close();
    }
}
