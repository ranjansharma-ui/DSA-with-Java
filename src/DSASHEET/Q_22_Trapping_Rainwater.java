package DSASHEET;

public class Q_22_Trapping_Rainwater {
    public static int TrappingRainwater(int[] height){ // O(n)
        int n = height.length;

        //calculate leftMax boundaries
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //calculate rightMax boundaries
        int rightMAx[] = new int[n];
        rightMAx[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            rightMAx[i] = Math.max(rightMAx[i+1],height[i]);
        }

        int trappedWater = 0;
        //loop
        for (int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i],rightMAx[i]);

            // using formula that  considerate in the copy
            trappedWater = trappedWater + (waterlevel - height[i]);
            // if the given the width so will be included that
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int ans = TrappingRainwater(height);
        System.out.println("Trapped Water : "+ans);

    }
}
