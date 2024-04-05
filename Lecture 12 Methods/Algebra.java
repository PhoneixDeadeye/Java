import java.util.Scanner;

class Alg
{
    int a;

    int b;
    
    int add(int a, int b)
    {
        int ans = a + b;
        
        return ans;
    } 

    int sub()
    {
        return a - b;
    }

    int multiply()
    {
        return a * b;
    }
}

public class Algebra {
    public static void main(String[] args) {
        // Alg obj = new Alg();

        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();

        // int b = sc.nextInt();

        // System.out.println("Sum of numbers is");

        // int ans = obj.add(a, b);

        // System.out.println(ans);

        // sc.close();

        System.out.println(Math.sqrt(24));
        System.out.println(Math.sqrt(16));

        System.out.println(Math.floor(5.3));
        System.out.println(Math.floor(5.8));

        System.out.println(Math.ceil(5.3));
        System.out.println(Math.ceil(5.8));
    }
    
}