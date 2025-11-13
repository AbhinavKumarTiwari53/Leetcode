class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode l = new ListNode(0);
        ListNode r = new ListNode(0);
        ListNode lt = l;
        ListNode rt = r;
        while(head != null){
            if(head.val < x){
                lt.next = head;
                lt = lt.next;
            }
            else{
                rt.next = head;
                rt = rt.next;
            }
            head = head.next;
        }
        lt.next = r.next;
        rt.next = null;
        return l.next;
    }
}