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
        if(lists.length== 0 ) return null;
    PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
     for(ListNode node : lists){
        if(node!=null)
        pq.add(node);
     }
    ListNode head = null;
    ListNode tail = null;
    while(pq.size()>0){
        ListNode node = pq.poll();
        if(tail == null ){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        if(node.next != null){
            node = node.next;
                pq.add(node);
            }
        }
        return head;
    }
}