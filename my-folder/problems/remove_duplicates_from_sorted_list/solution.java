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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prenode = new ListNode(-1);
        ListNode cur = prenode;
        int focus = -101;

        while(head != null) {
            if (head.val != focus) {
                cur.next = head;
                focus = head.val;
                cur = cur.next;
            }
            head = head.next;
        }
        cur.next = null;
        return prenode.next;
    }
}