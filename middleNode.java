/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode faster = head;
        ListNode slower = head;
        
        while(faster != null && faster.next != null){
            faster = head.next.next;
            slower = head.next;
        }
        return slower;
    }
}
