import java.util.*;
public class smallestArray {
    public static int smallestNo(int nos[]){
        int smallest = Integer.MAX_VALUE;

        for ( int i =0; i < nos.length; i ++ ){
            if( smallest > nos[i]){    
                smallest = nos[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int nos[] ={ 2,4,6,5,3};
        System.out.println(" Smallest value is :"+smallestNo(nos));
    }
}
