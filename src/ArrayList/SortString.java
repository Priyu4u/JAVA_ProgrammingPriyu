package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        l.add("Priyanshu");
        l.add("Gupta");
        l.add("Welcome");
        l.add("You");
        System.out.println("Original : "+l);
        // sort according to consonant number
        Collections.sort(l);
        System.out.println("Sort : "+l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Reverse Sort : "+l);


    }
}
