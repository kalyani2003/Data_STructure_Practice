import java.util.*;
public class LargestArray {
    public static int largestNo( int nos[]){
        
        int largest = Integer.MIN_VALUE;  // MEANS -INFINITY

        for (int i =0; i < nos.length; i ++){
            if( largest < nos[i]){
                largest = nos[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int nos [] = { 1,5,7,3,2};
       
        System.out.println("largest no is :"+ largestNo(nos));
    }
}
