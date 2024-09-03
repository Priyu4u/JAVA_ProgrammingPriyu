package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {
    static void reverseList(ArrayList<Integer> l){
        int i = 0, j = l.size()-1;
        while (i<j){
            Integer temp = Integer.valueOf(l.get(i));
            l.set(i,l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(7);
        System.out.println("Original Arraylist : "+l);
//        reverseList(l);
//        System.out.println("Reversed Arraylist : "+l);
        Collections.reverse(l);
        System.out.println("Reversed Arraylist using inbuilt method: "+l);
        Collections.sort(l);
        System.out.println("Sorted in ascending order : "+l);

        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Sorted in descending order : "+l);

    }
}
