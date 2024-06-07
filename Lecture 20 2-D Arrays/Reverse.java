import java.util.Scanner;

public class Reverse {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverse(int[][] a){
        for(int i = 0; i < a.length; i++){
            int k = a[i].length-1;
            for(int j = 0; j < k; j++){
                int temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
                k--;
            }
        }
        printMatrix(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix 1 : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();        
        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix elements ");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }

        reverse(a);
        
        sc.close();
    }
}
