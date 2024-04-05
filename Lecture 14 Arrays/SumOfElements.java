public class SumOfElements {
    public static void main(String[] args) {
        ArrayEx obj = new ArrayEx();

        obj.sumOfArray();
        
        obj.maxElement();

        obj.searchElement();
    }
}

class ArrayEx {
    public void sumOfArray()
    {
        int[] arr = {1, 4, 5, 6, 9};

        int sum = 0;

        for(int i=0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println("The sum of Elements in the array is : " + sum);
    }

    public void maxElement()
    {
        int[] arr = {10, 4, 5, 6, 9};

        int max = 0;
        
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is : " + max);
    }

    public void searchElement()
    {
        // Linear Search
        
        int[] arr = {10, 4, 5, 6, 9};

        int x = 5;

        int ans = -1;

        for(int i = 0 ; i < arr.length; i++)
        {
            if(x==arr[i])
            {
               ans = i; 
               
               break;
            } 
        }
        
        if(ans == -1)
        {
            System.out.println("Not Found.");
        }
        else
        {
            System.out.println("Found "+ x + " at index " + ans);
        }
    }
}