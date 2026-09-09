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
    public boolean isPalindrome(ListNode head) {
        Stack <Integer> stack = new Stack<>();

        ListNode dummy=new ListNode (0);
        dummy.next=head;
        ListNode pointer = dummy.next;

        while(pointer!=null){
            stack.push(pointer.val);
            pointer =pointer.next;
        }

        pointer = dummy.next ;

        while(pointer!=null){
            if (pointer.val!=stack.pop()){
                return false;   
            }
            pointer=pointer.next;
        }
        return true;
    }
}