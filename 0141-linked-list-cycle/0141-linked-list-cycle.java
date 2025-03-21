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
        Set<ListNode> set = new HashSet();
        ListNode node = head;
        while (node != null) {
            if (!set.add(node)) {
                return true;
            }
            node = node.next;
        }

        return false;
    }
}