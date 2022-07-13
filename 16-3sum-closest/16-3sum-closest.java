class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[nums.length-1];
        for(int index=0; index<nums.length-2;index++)
        {
            int a_pointer=index+1;
            int b_pointer=nums.length-1;
            while(a_pointer<b_pointer)
            {
                int sum=nums[index]+nums[a_pointer]+nums[b_pointer];
                if(sum>target)
                  {
                      b_pointer=b_pointer-1;
                  }
                else
                  {
                      a_pointer=a_pointer+1;
                  }
                
            if(Math.abs(sum-target)<Math.abs(result-target))
            {
                result=sum;
            }
            }
        }
        return result;
        
    }
}