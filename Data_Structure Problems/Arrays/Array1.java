import java.util.*;
public class Array1 {     //// example of call by reference...
    public static void updateArr(int marks[]){
        for(int i =0; i< marks.length; i ++){
        marks[i] = marks[i] + 1;

        }
    }
    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5};
        updateArr(marks);  // array works on call by reference...

        //print our marks 
        for(int i =0; i< marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
