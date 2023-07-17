import java.util.*;
public class subArrays {
    public static void printSubArr(int nos[]){
        int ts = 0;
        for (int i =0; i<nos.length; i ++){
            int start = i;
            for(int j =i; j<nos.length; j++){
                int end = j;
                for(int k =start; k<=end; k++){  // only for printing 
                    System.out.print(nos[k]+" " ); // subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray is :"+ts);
    }
    public static void main(String[] args) {
        int nos[] = {2,4,6,8,10};
        printSubArr(nos);
    }
}
