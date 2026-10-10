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
    public ListNode mergeKLists(ListNode[] lists) {
       TreeMap <Integer,Integer> map = new TreeMap <>();

       if (lists!=null){
        for (ListNode head :  lists){
            ListNode current = head;
            while (current !=null){
                map.put(current.val,map.getOrDefault(current.val,0)+1);
                current = current.next;
            }
        }
       }

       ListNode dummy = new ListNode (-1);
       ListNode current = dummy;

       for (Map.Entry<Integer,Integer>entry :map.entrySet()){
            int val = entry.getKey();
            int count = entry.getValue();

            while (count >0){
                current.next = new ListNode (val);
                current = current.next;
                count--;
            }

       }
       return dummy.next;
        
    }
}