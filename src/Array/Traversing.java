package Array;
class Traverse2D{
    void ages(){
        int[][] stuAge = {{22,23},{45,24},{34}} ;
        // Traversing using for loop
        System.out.println("\nTraversing using for loop");
        // using array.length property
        for(int i=0; i<stuAge.length; i++){
            // lenght : stuAge[i].length
            for(int j=0; j<stuAge[i].length; j++){
                System.out.print(stuAge[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Traverse1D{
   void names(){
       String[] stuNames = new String[5] ;
       stuNames[0] = "Priyanshu" ;
       stuNames[1] = "Sunny" ;
       stuNames[2] = "Sachin" ;
       stuNames[3] = "Prabhat" ;
       stuNames[4] = "Pranshu" ;

       // printing or traversing using for loop
       System.out.println("\ntraversing using for loop");
       for(int i=0; i<5; i++){
           System.out.println(stuNames[i]);
       }

       // traversing using for each loop
       System.out.println("\ntraversing using for each loop");
       for(String name : stuNames){
           System.out.println(name);
       }

       // traversing using while loop
       System.out.println("\ntraversing using while loop");
       int i=0;
       while (i<stuNames.length){
           System.out.println(stuNames[i]);
           i++;
       }

   }
}
public class Traversing {
    public static void main(String[] args) {
        Traverse1D obj = new Traverse1D();
        obj.names();
        Traverse2D obj1 = new Traverse2D();
        obj1.ages();

    }
}
