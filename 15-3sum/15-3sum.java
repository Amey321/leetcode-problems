class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        Arrays.sort(nums);
        if(nums.length<3)
        {
            return res;
        }
        for(int index=0;index<nums.length-2;index++)
        {
            if(index==0 || (index>0 && nums[index]!=nums[index-1]))
            {
                int l=index+1;
                int r=nums.length-1;
            
            while(l<r)
            {
                int sum=nums[index]+nums[l]+nums[r];
                if(sum==0)
                {
                  res.add(Arrays.asList(nums[index],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1])
                    {
                        l++;
                    }
                    while(l<r && r<nums.length-1 && nums[r]==nums[r+1])
                    {
                        r--;
                    }
                }
                else if(sum>0)
                {
                    r--;
                }
                else if(sum<0)
                {
                    l++;
                }
            }
            }
        }
        return res;
    }
}