import java.util.*;
public class prefixSumSubarray {
    public static void MaxSubarray(int nos[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nos.length];

        prefix[0] = nos[0];
        // calculate prefix array

        for(int i =1; i< prefix.length; i++){
            prefix[i] = prefix[i - 1] + nos[i];
        }

        for(int i =0; i< nos.length; i++){
            int start = i;
               for(int j =i; j< nos.length; j++){
                int end = j;

                currSum = start ==0? prefix[end] : prefix[end] - prefix[start - 1];
                    if(maxSum < currSum){
                        maxSum = currSum;
                    }
               } 
        }
        System.out.println("Max sum is :"+maxSum);
    }
    public static void main(String[] args) {
        int nos[] = {2,4,6,8};
        MaxSubarray(nos);
    }
}
