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
    public int[] nextLargerNodes(ListNode head) {

        ArrayList <Integer > list = new ArrayList<>();

        while (head!=null){
            list.add(head.val);
            head=head.next;
        }

        int arr[]=new int [list.size()];

        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (list.get(j)>list.get(i)){
                    arr[i]=list.get(j);

                    break;
                }

            }

        }
        return arr;
        
    }
}