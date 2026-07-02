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
        if(lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for(ListNode l : lists){
            if(l!=null) pq.add(l);
        }
        ListNode h=null;
        ListNode t=null;
        while(!pq.isEmpty()){
            ListNode n=pq.poll();
            if(t==null){
                h=n;
                t=n;
            }else{
                t.next=n;
                t=n;
            }
            if(n.next!=null){
                n=n.next;
                pq.add(n);
            }
        }
        return h;
    }
}