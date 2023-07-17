import java.util.*;
public class BinarySearch {
    public static int binarySearch(int nos[], int key){
        int start =0;
        int end = nos.length - 1;            // End = (N - 1)

        while(start <= end){
            int mid = (start + end)/2;

            //Comparisons......
            if ( nos[mid] == key){
                return mid;
            }
            if(nos[mid] < key){  // right search
                start = mid +1;
            }else{
                end = mid - 1;   // left  search
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nos[] = { 1,2,4,6,8,10};
        int key = 2;
        System.out.println("index of key is :"+ binarySearch(nos, key));
    }
}
