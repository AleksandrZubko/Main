package leetcode.addTwoNumbers_2;

import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        ListNode l1 = new ListNode(243);
        ListNode l2 = new ListNode(564);
        System.out.println(new Solution().addTwoNumbers(l1, l2));
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = l1.getVal() + "";
        String s2 = l2.getVal() + "";
        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");
        for (String s:arr1
             ) {
            System.out.println(s);
        }
        return null;
    }
}

 //Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

     public int getVal() {
         return val;
     }

     public ListNode getNext() {
         return next;
     }


     public void setNext(ListNode next) {
         this.next = next;
     }
 }
