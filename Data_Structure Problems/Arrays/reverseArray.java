import java.util.*;
public class reverseArray {
    public static void reverse(int nos[]){
    int first = 0;
    int last = nos.length - 1;

    while(first < last){
    //SWAPPING ...
    int temp = nos[last];
     nos[last] = nos[first];
     nos[first] = temp;

     first ++;
     last --;
    }

    }
    public static void main(String[] args) {
        int nos[] = { 1,2,3,4,5};
        
        reverse(nos);
        for(int i =0; i< nos.length; i++){
            System.out.print(nos[i] + " ");
        }
        System.out.println();
    }
}
