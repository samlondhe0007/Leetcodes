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
    public ListNode doubleIt(ListNode head) {
        head=reverseIt(head);
        ListNode current = head ;
        int carry=0;

        while(current!=null){
            int value = current.val * 2 + carry;
            current.val =value%10;
            carry = value/10;

        if (current.next ==  null && carry>0 ){
            current.next= new ListNode (carry);
            break;
        }

        current = current.next;
    }
        head = reverseIt(head);
        return head;
}

        public ListNode reverseIt(ListNode head){
            ListNode prev=null;
            ListNode temp=head;
            ListNode current = head;
           
           while(current !=null){
            temp = current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;       
    }
}