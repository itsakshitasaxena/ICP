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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)  return;
        //break --> reverse --> merge and reorder one by one
        
        ListNode slow=head, fast=head, prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null; // breaking the link of first half from second
        ListNode second=reverse_ll(slow);
        ListNode first=head;
        while(first!=null && second!=null){
            ListNode temp1=first.next; //save
            ListNode temp2=second.next;

            first.next=second; //connect
            if(temp1==null)  break;
            second.next=temp1; //zip

            first=temp1; //move
            second=temp2;
            
        }

    }
    public ListNode reverse_ll(ListNode head){
        ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
}