import java.util.ArrayList;
import java.util.Collections;

public class Problems {

    static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size() - 1;

        while(i < j){
            Integer temp =Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List " + list);
        Collections.reverse(list);
        //reverseList(list);
        System.out.println("Reversed List " + list);
        Collections.sort(list);
        System.out.println("Ascending order " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order " + list);


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Hello");
        l1.add("From");
        l1.add("Rohan");
        l1.add("Agarwal");
        System.out.println("Original List " + l1);
        Collections.sort(l1);
        System.out.println("Sorted List (Asc) " + l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Sorted List (Desc) " + l1);
    }
}
