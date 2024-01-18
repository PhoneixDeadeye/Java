import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Name is " + name);
        
        System.out.println("Enter your full name : ");
        String fullName = Sc.nextLine();
        System.out.println("Full name is " + fullName);

        // System.out.println("Enter your lucky number : ");
        // int num_1 = sc.nextInt();

        // System.out.println("Lucky number is " + num_1);
        sc.close();
        Sc.close();
    }
}