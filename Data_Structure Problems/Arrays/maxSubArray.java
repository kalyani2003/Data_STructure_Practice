import java.util.*;
public class maxSubArray {
    public static void printMaxSubArr(int nos[]){
        int currSum = 0;
        int maxSum = 0; // or we can write INTEGER.MIN_VALUE.....

        for (int i =0; i <nos.length; i ++){
            int start = i;
            for(int j=i; j< nos.length; j++){
                int end = j;
                currSum = 0; // it matters alot bcz value is change.....
                for(int k = start; k<= end; k++){
                    // SubArray sum 
                    currSum = nos[k]+ currSum;
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is :"+ maxSum);
    }
public static void main(String[] args) {
    int nos[] ={2,4,6,8,10};
    printMaxSubArr(nos);
}
}
