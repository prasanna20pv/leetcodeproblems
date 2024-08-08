class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode fast = head;
        int length =1;
        while(fast.next!=null){
            fast = fast.next;
            length++;
        }
        fast.next=head;
        ListNode slow=head;
        for(int i=0;i<length-k%length-1;i++){
            slow = slow.next;
        }
        ListNode Head = slow.next;
        slow.next = null;       
        return Head;
    }
}