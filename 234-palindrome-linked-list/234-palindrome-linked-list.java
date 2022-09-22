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
    public boolean isPalindrome(ListNode head) {
        boolean result = true;
        
        List<Integer> headList = new ArrayList<Integer>();
        
        while(head != null) {
            headList.add(head.val);
            head = head.next;
        }
        
        int length = headList.size();
        int halfLeng = length / 2;
        
        for(int i=0; i<halfLeng; i++) {
            if(headList.get(i) != headList.get(length-i-1)) {
                result = false;
                break;
            }
        }
        
        
        return result;
    }
}