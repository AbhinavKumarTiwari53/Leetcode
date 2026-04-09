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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        if(list1!=null) pq.add(list1);
        if(list2!=null) pq.add(list2);
        ListNode h=null;
        ListNode t=null;
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