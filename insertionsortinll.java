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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode previnsert=new ListNode(0);
        ListNode toinsert=new ListNode(0);
        dummy.next=head;
        while(head!=null && head.next!=null)
        {
            if(head.val<head.next.val)
            {
                head=head.next;
            }
            else
            {
                previnsert=dummy;
                toinsert=head.next;
                while(previnsert.next.val<toinsert.val)
                {
                    previnsert=previnsert.next;
                }
                head.next=toinsert.next;
                toinsert.next=previnsert.next;
                previnsert.next=toinsert;
            }
        }
        return dummy.next;
    }
}

/*
ListNode dummy=new ListNode(0);
        ListNode toinsert=new ListNode(0);
        ListNode previnsert=new ListNode(0);

        dummy.next=head;
        while(head!=null && head.next !=null)
        {
            if(head.val<=head.next.val)
            {
                head=head.next;
            }
            else
            {
                toinsert=head.next;
                previnsert=dummy;
                while(previnsert.next.val<toinsert.val)
                {
                    previnsert=previnsert.next;
                }
                head.next=toinsert.next;
                toinsert.next=previnsert.next;
                previnsert.next=toinsert;
            }
            
        }
        return dummy.next;
        */