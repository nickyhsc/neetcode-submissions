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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        int index = -1;
        int currIndex = 0;
        ListNode curr = head;
        Hashtable<ListNode, Integer> exist = new Hashtable<>();
        while(curr != null){
            if(exist.containsKey(curr)){
                index = exist.get(curr);
                return true;
            }else{
                exist.put(curr, currIndex);
                curr = curr.next;
                currIndex ++;
            }
        }
        return false;
    }
}
