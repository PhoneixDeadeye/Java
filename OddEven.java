import java.util.Scanner;

public class OddEven {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }

        /*
         * (num%2==0)?System.out.println("even"):System.out.println("odd");
         */
        sc.close();
    }
}
