package Arrays.InterviewQuestion_Leetcode_GFG;

public class TrapWater {
    public static int trapwater(int[]height){
        int n = height.length;
        int trapWater = 0;

        // step-1 : find leftMax and rightMax using Auxiliary arrays
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);

        }
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        // step-2 : loop
        for (int i=0; i<n; i++){
        //step-3 : calculate water-level via leftMax and rightMax
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
        //step-4 : then finally calculate trapWater
            trapWater = trapWater+ (waterLevel - height[i]);

        }

        //return total trapWater
        return trapWater;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,7};
        System.out.println("Trap water : "+ trapwater(arr));
    }
}
