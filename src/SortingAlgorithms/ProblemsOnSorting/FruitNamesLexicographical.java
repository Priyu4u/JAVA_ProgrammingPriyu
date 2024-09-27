package SortingAlgorithms.ProblemsOnSorting;
// Given an array of names of fruits , you are supposed to sort it in
// lexicographical order using selection sort
public class FruitNamesLexicographical {
    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j=i+1; j<n; j++){
                if(fruits[minIdx].compareTo(fruits[j]) > 0){
                    minIdx = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[minIdx];
            fruits[minIdx] = temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        sortFruits(fruits);
        for(String i : fruits){
            System.out.print(i+" ");
        }
    }
}
