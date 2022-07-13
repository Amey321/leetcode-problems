class Solution {
    public int searchInsert(int[] nums, int target) {
        int output=0;
        if(target>nums[nums.length-1])
        {
            return nums.length;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                output=i;
                break;
            }
            if((i+1)< nums.length && nums[i]<target && nums[i+1]> target)
            {
                output=i+1;
            }
        }
        return output;
    }
}