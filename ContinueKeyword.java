public class ContinueKeyword {
    public static void main(String[] args) {
        
        myloop : for(int num = 1; num <= 50; )
        {
            if(num % 3 == 0 )
            {
                num++;

                continue myloop ;
            }
            System.out.println(num);

            num++;
        }
    }
}
