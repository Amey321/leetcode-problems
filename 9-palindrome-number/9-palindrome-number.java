class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10==0)
        {
            if(x==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        int temp=x;
        int rem=0;
        int m=0;
        while(temp!=0)
        {
            rem=temp%10;
            temp=temp/10;
            m=(m*10)+rem;
        }
        if(m==x)
        {
            return true;
        }
        else
        {
            return false;
        }
 
    }
}