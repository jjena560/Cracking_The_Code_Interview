public class ListNode {
    *     int val;
    *     ListNode next;
    *     ListNode() {}
    *     ListNode(int val) { this.val = val; }
    *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    * }*/

class Solution {
       public ListNode deleteDuplicates(ListNode head) {
           HashSet<Integer> set = new HashSet<Integer>();
           ListNode previous = null;
           
           ListNode temp = head;
   
           while(head!=null){
               if(set.contains(head.val)){
                   previous.next = head.next;
               }else{
                   set.add(head.val);
                   
                   previous = head;
               }
               head = head.next;
           }
           return temp;
       }
   }