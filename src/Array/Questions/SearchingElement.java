package Array.Questions;
class LinearSearching{
    void search(){
        // Search the given element x in the array. If present then return
        // the index , else return -1 (first occurrence in case multiple)
        int[] arr = {5,3,23,35,52,180,86,0} ;
        int x = 52;
        int ans = -1;
        for(int i=0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("Element "+x+" is not present in the array");
        }else{
            System.out.println("Found element "+x+" at index "+ans);
        }



    }
}
public class SearchingElement {
    public static void main(String[] args) {
        LinearSearching obj = new LinearSearching();
        obj.search();


    }
}
