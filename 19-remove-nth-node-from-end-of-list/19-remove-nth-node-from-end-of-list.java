/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1)
        {
            return null;
        }
        ListNode temp=head;
        int count=0;
        boolean it1=true;
        while(true)
        {
            if(it1)
            {
            if(temp==null)
            {
                temp=head;
                count-=n;
                n=0;
                it1=false;
            }
            else
            {
                count++;
                temp=temp.next;
            }
            }
            else if(temp!=null)
            {
                
                if(count==0)
                   {
                       head=head.next;
                    break;
                   }
                n++;
                if(n==count)
                {
                    temp.next=temp.next.next;
                    break;
                }
                
                temp=temp.next;
            }
            
        }
        return head;
    }
}