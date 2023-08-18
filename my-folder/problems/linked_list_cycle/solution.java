import java.lang.Math;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean repeat = true;
        ListNode precur = head;
        // ListNode cur = head;
        // Set<Integer> nums = new HashSet<>();
        for (int i = 0; i <= Math.pow(10, 4); i++) {
            if (precur == null) {
                repeat = false;
                break;
            }
            precur = precur.next;
        }
        /* while (cur != null) {
            if (!nums.contains(cur.val)) {
                nums.add(cur.val);
            } else {
                return true;
            }
            cur = cur.next;
        }
        return false;
        */
        return repeat;
    }
}