import java.util.Scanner;

public class MultiDimensionalArray {

    static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();

        
        int[][] arr = new int[r][c];

        System.out.println("Enter " + r*c + " elements ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // int[][] arr2 = {{1, 5, 6},
        //                 {7, 9, 11},
        //                 {0, 1, 1}
        //             };

        printArray(arr);

        sc.close();
    }    
}
