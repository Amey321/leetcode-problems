class Solution {
    public int trap(int[] height) {
        int amount=0;
        int n=height.length;
        int l=1;
        int r=n-2;
        int left_wall=height[0];
        int right_wall=height[n-1];
        while(l<=r)
        {
            if(left_wall<right_wall)
            {
                
                left_wall=Math.max(left_wall,height[l]);
                amount+=left_wall-height[l];
                l++;
                
            }
            else
            {
                right_wall=Math.max(right_wall,height[r]);
                amount+=right_wall-height[r];
                r--;
            }
            
        }
        return amount;
    }
}