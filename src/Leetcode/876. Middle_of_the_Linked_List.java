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

// 876. Middle of the Linked List
//Important Node 
//In linked list, when you return a node, you are returning the entire remaining chain from that node.
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }
        ListNode temp = head;
        int count =0;

        while(temp != null){
            temp = temp.next ;
            count++;
        }
        int mid = count/2;
        temp= head;
        for(int i = 0; i < mid; i++){
            temp = temp.next;
        }

        return temp;
        
    }
}
