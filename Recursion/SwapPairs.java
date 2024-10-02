package Recursion_Basic_Adv;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val;}
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode second = head.next;
        ListNode third = second.next;
        second.next= head;
        head.next = swapPairs(third);
        return second;
    }
}
