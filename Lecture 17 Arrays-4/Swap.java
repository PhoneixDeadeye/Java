public class Swap {
    static void swap(int a, int b)
    {
        System.out.println("Original Values before swap");

        System.out.println("a : " + a);

        System.out.println("b : " + b);

        int temp = a;

        a = b;

        b = temp;

        System.out.println("Values after swap");

        System.out.println("a : " + a);

        System.out.println("b : " + b);
    }

    static void swapWithoutTemp(int a, int b)
    {
        System.out.println("Original Values before swap");

        System.out.println("a : " + a);

        System.out.println("b : " + b);

        a = a + b;

        b = a - b;
        
        a = a - b;

        System.out.println("Values after swap");

        System.out.println("a : " + a);

        System.out.println("b : " + b);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        // swap(a, b);

        swapWithoutTemp(a, b);
    }
}
