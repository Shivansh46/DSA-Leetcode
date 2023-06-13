class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dum1=new ListNode(0);
        ListNode dum2=new ListNode(0);
        ListNode use1=dum1;
        ListNode use2=dum2;
        while(head!=null)
        {
            if(head.val<x)
            {
                use1.next=head;
                use1=use1.next;
            }
            else{
                use2.next=head;
                use2=use2.next;
            }
            head=head.next;
        }
        use2.next=null;
        use1.next=dum2.next;
        return dum1.next;
    }
}