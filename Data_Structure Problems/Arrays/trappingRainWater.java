import java.util.*;
public class trappingRainWater {
    public static int  trapWater(int height[]){
        int n = height.length;
        
        // CALCULATE LEFT MAX BOUNDARY - ARRAY
        int leftmax[] =new int[n];
        leftmax [0] = height[0];
        for(int i =1; i < n; i ++){
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // CALCULATE RIGHT MAX BOUNDARY - ARRAY
        int rightmax[] = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i>= 0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i + 1]);
        }
        int trappedWater = 0;
        //LOOP
        for(int i = 0; i < n; i++){

            //WATERLEVEL = MIN(LEFTMAX BOUND, RIGHTMAX BOUND)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            // TRAPPED WATER = WATERLEVEL - HEIGHT[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapWater(height));
    }
}
