package LinkedLists;


   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode prev = null;
        if(lists.length==0 ){
            return null;
        }
        ListNode head = null;
        for(ListNode node : lists){
           if(node==null){
               continue;
           }
            if(head == null){
                head = node;
            }
            ListNode temp = node;
            if(prev!=null){
                prev.next=temp;
            }
            while(temp.next!=null){
                temp=temp.next;
            }
            prev=temp;
        }
        
        ListNode t1 = head;
        
        
        while(t1!=null){
            ListNode t2 =t1;
            while(t2!=null){
                if(t1.val>=t2.val){
                    int swap = t1.val;
                    t1.val=t2.val;
                    t2.val=swap;
                    
                }
                t2=t2.next;
            }
            t1=t1.next;
        }
        return head;
    }
}
