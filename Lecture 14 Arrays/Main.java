class ArraysExample
{
    void multiArrays()
    {
        // int[][] arr_1 = new int[5][3];

        int[][] arr = {{56, 43, 6}, {34, 7, 8}, {12, 56, 8}};

        // int[][][] arr_3 = new int[5][3][2];

        // System.out.println(arr[0][0]);

        // System.out.println(arr[0][1]);
        
        // System.out.println(arr[0][2]);

        
        // System.out.println(arr[1][0]);

        // System.out.println(arr[1][1]);
        
        // System.out.println(arr[1][2]);

        
        // System.out.println(arr[2][0]);

        // System.out.println(arr[2][1]);
        
        // System.out.println(arr[2][2]);

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }

    void demoArrays()
    {
        int[] ages = new int[3];

        float[] weights = new float[3];

        String[] names = {"rohan", "rahul", "raj", "abc"};
        
        // System.out.println(ages.length);

        // System.out.println(weights.length);
        
        // System.out.println(names.length);

        ages[0] = 34;

        ages[1] = 12;

        ages[2] = 45;

        // ages[5] = 45;

        weights[0] = 23.8f;

        weights[1] = 11.1f;

        weights[2] = 87.5f;

        // System.out.println(ages[0]);

        // System.out.println(ages[1]);
        
        // System.out.println(ages[2]);
        
        // For loop for travesing the array

        for(int i  = 0; i < ages.length; i++)
        {
            System.out.println(ages[i]);
        }

        /* For Each loop */
        for(int age : ages)
        {
            System.out.println(age);
        }

        // While loop

        int i = 0;

        while(i < ages.length)
        {
            System.out.println(ages[i]);

            i = i + 1;
        }


        System.out.println(names[0]);

        System.out.println(names[1]);
        
        System.out.println(names[2]);
    }
}

public class Main{
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        
        obj.demoArrays();

        obj.multiArrays();
    }
}