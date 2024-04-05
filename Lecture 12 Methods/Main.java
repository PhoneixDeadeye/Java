class Student {
    int rollNo;

    String studentName;
}

class Alg
{
    int a;

    int b;

    Alg(int x, int y)
    {
        System.out.println("Constructor of Algebra class called.");

        a = x;

        b = y;
    }
    
    int add()
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

public class Main {
    public static void main(String[] args) {
       // Student obj1 = new Student();
        
        Alg obj = new Alg(5, 7);

        // obj1.rollNo = 1;

        // obj1.studentName = "Rohan";

        int ans = obj.add();

        System.out.println(ans);

        System.out.println(obj.sub());

        System.out.println(obj.multiply());

        // System.out.println(obj1.rollNo);

        // System.out.println(obj1.studentName);

        // Student obj2 = new Student();

        // obj2.rollNo = 2;

        // obj2.studentName = "Rahul";

        // System.out.println(obj2.rollNo);

        // System.out.println(obj2.studentName);
    }
}
