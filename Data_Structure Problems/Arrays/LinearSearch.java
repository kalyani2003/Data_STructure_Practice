import java.util.*;
public class LinearSearch {
    public static int linearSearch(int numbers[], int key){
        for ( int i =0; i< numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;    // if no not exist in the list...
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 20;

        int index = linearSearch(numbers,key);
        if (index == -1){
            System.out.println("not present");
        }
        else{
        System.out.println("key is at index " + index);
            }
    }
}
