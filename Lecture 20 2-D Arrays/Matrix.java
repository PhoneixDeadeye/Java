import java.util.Scanner;

public class Matrix {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][]a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Wrong Input - Multiplication not possible");
        }
        
        int[][] multiply = new int[r1][c2];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2 ; j++){
                for(int k = 0; k < c1; k++){
                    multiply[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        printMatrix(multiply);
    }
    
    static void add(int[][] a, int r1, int c1, int b[][], int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition not possible");
            return;
        }
        
        int[][] sum = new int[r1][c2];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
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

        System.out.println("Enter the number of rows and colums of matrix 2 : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        System.out.println("Enter matrix elements ");
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of matrix 1 and matrix 2 is : ");
        add(a, r1, c1, b, r2, c2);

        System.out.println("Multiplication of matrix 1 and matrix 2 is : ");
        multiply(a, r1, c1, b, r2, c2);

        sc.close();
    }
}
