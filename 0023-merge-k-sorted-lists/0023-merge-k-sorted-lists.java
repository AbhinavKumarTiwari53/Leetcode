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
        if(lists.length==0) return null;
        ListNode h=null;
        ListNode t=null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode l:lists){
            if(l!=null) pq.add(l);
        }
        while(!pq.isEmpty()){
            ListNode l=pq.poll();
            if(t==null){
                h=l;
                t=l;
            }else{
                t.next=l;
                t=l;
            }
            if(l.next!=null){
                l=l.next;
                pq.add(l);
            }
        }
        return h;
    }
}