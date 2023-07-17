import java.util.*;
public class pairsArray {
    public static void printPairs(int nos[]){
        int tp = 0;
        for(int i =0; i< nos.length; i ++){
            int curr = nos[i];   // 2,4,6,8,10
            for(int j =i+1; j< nos.length; j++ ){
                System.out.print("(" +curr +","+nos[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs is :"+ tp);
    }
    public static void main(String[] args) {
        int nos[] = {2,4,6,8,10};
        printPairs(nos);
    }
}
