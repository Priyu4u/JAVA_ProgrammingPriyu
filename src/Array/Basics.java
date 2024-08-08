package Array;


class Arrays2D{
    void basic(){
        int[][] arr = new int[2][3] ;
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 3;
        arr[1][1] = 3;
        arr[1][2] = 3;

        int[][] arr2 = {{1,2,33},{3,4},{5,6}} ;
        System.out.println(arr.length);

    }
}


class Arrays1D{
    void basic(){
        int[] ages = new int[3] ;
        float[] weights = new float[3] ;
        String[] names = new String[3] ;

        ages[0] = 22;
        ages[1] = 20;
        ages[2] = 18;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        weights[0] = 45.34f;
        weights[1] = 65f;
        weights[2] = 50.56f;
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

        names[0] = "Priyanshu" ;
        names[1] = "Sachin" ;
        names[2] = "Sunny" ;
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String[] girlsName = {"Sita","Radha","Gita"} ;
        for(int i=0; i<3; i++){
            System.out.println(girlsName[i]);
        }

        System.out.println(ages.length);
        System.out.println(names.length);
        System.out.println(weights.length);
    }

}
public class Basics {
    public static void main(String[] args) {
        Arrays1D obj = new Arrays1D();
        obj.basic();
        Arrays2D obj1 = new Arrays2D();
        obj1.basic();
    }
}
