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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode (0);
        ListNode pointer = dummy;

        ListNode l1pointer =list1;
        ListNode l2pointer =list2;

        while(l1pointer!=null && l2pointer!=null){
            if (l1pointer.val<l2pointer.val){
                pointer.next=l1pointer;
                l1pointer=l1pointer.next;
            }
            else{
                pointer.next=l2pointer;
                l2pointer=l2pointer.next;
            }
            pointer=pointer.next;

        }
        
        if (l1pointer!=null){
            pointer.next = l1pointer;
        }
        else{
            pointer.next=l2pointer;
        }
        return dummy.next;
    }
}