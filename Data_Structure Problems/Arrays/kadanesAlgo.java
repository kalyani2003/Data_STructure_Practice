import java.util.*;
public class kadanesAlgo {
    public static void kadanes(int nos[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        // logic is here .....
        for(int i =0; i< nos.length; i++){
            currSum = currSum + nos[i];
            if(currSum < 0){      // for negative nos currsum = 0;
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max subArray is :"+ maxSum);
    }
    public static void main(String[] args) {
        int nos[] = {-2,-3,4,-1};
        kadanes(nos);
    }
}
