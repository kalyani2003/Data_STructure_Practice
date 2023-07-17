import java.util.*;
public class minSubArray {
    public static void printMinSubArr(int nos[]){
        int currSum =0;
        int minSum =Integer.MAX_VALUE;
        for (int i =0; i<nos.length; i++){
            int start =i;
            for(int j= i; j<nos.length; j++){
                int end = j;
                currSum =0;
                for(int k =start; k<=end; k++){
                    currSum = nos[k] - currSum;
                }
                System.out.println(currSum);
                if(minSum > currSum){
                    minSum = currSum;
                }
            }
        }
        System.out.println(" minimum sum is :"+minSum);
    }
    public static void main(String[] args) {
        int nos[] = {2,4,6,8};
        printMinSubArr(nos);
        
    }
}
