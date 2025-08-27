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
// Java Solution
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current = head;
        ListNode prev = null;
        ListNode second = head.next;
        while (current != null && current.next != null) {
            ListNode up = current.next.next;
            ListNode temp = current.next;
            current.next.next = current;
            current.next = up;
            if (prev != null) {
                prev.next = temp;
            }
            prev = current;
            current = up;
        }
        return second;
    }
}