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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ArrayList<Integer> arrayHead = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            arrayHead.add(curr.val);
            curr = curr.next;
        }
        ListNode reversed = new ListNode(0);
        ListNode pointer = reversed;
        for(int i=arrayHead.size()-1; i>=0; i--){
            pointer.next = new ListNode(arrayHead.get(i));
            pointer = pointer.next;
        }
        return reversed.next;
    }
}
