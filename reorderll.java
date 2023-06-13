class Solution {
    public void reorderList(ListNode head) {
         ListNode slow=head;
         ListNode fast=head;
         while(fast.next!=null && fast.next.next!=null)
         {
             slow=slow.next;
             fast=fast.next.next;
         }
         ListNode curr=slow.next;
         slow.next=null;
         ListNode prev=null;
         while(curr!=null)
         {
             ListNode temp=curr.next;
             curr.next=prev;
             prev=curr;
             curr=temp;
         }
         ListNode startind=head;
         ListNode endind=prev;
         ListNode nextl=null;
         ListNode nextr=null;
         while(startind!=null && endind!=null)
         {
            nextl=startind.next;
            startind.next=endind;
            nextr=endind.next;
            endind.next=nextl;

            startind=nextl;
            endind=nextr;

         }
    }
}
