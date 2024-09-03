package ArrayList;
import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {

        // wrapper class
        Integer i1 = Integer.valueOf(5);
        System.out.println(i1);

        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        // creating arraylist
        ArrayList<Float> l2 = new ArrayList<>();
        ArrayList<Boolean> l3 = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        // add new element
        l1.add(5);
        l1.add(4);
        l1.add(6);
        l1.add(7);

        // get an element at index i
        System.out.println(l1.get(2));
        System.out.println(l1.get(0));

        // print using for loop
        for(int i = 0; i<l1.size(); i++){
            System.out.print (l1.get(i));
        }
        System.out.println();

        // print the arraylist directly
        System.out.println(l1); // [5,4,6,7]

        // adding element at some index
        l1.add(1,19);  // [5,19,4,6,7]
        System.out.println(l1);

        // modifying element at index i
        l1.set(1,13);
        System.out.println(l1);     // [5,13,4,6,7]

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        // removing an element e
        l1.remove(Integer.valueOf(6));
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(7)));    // return boolean
        System.out.println(l1.remove(Integer.valueOf(17)));
        System.out.println(l1);

        // checking if an element exists in arraylist
        // -> returns boolean
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);
        ans = l1.contains(Integer.valueOf(5));
        System.out.println(ans);

        // if you don't specify wrapper class , you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("priyu");
        l.add(5);
        l.add(true);
        System.out.println(l);

        ArrayList<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(9);
        li.add(4);
        li.add(7);
        li.add(4);
        li.add(3);

        // indexOf() method
        // It is used to return the index in the list of the first
        // occurrence of the specified element , or -1 if the list
        // does not contain the element
        System.out.println(li.indexOf(51));   // -1
        System.out.println(li.indexOf(4));      // 4

        // lastIndexOf() method
        // It is used to return the index in the list of the last
        // occurrence of the specified element , or -1 if the list
        // does not contain the element
        System.out.println(li.lastIndexOf(45));
        System.out.println(li.lastIndexOf(4));

        // isEmpty() method
        System.out.println(l1.isEmpty());      // false
        System.out.println(l2.isEmpty());       // true

    }
}
