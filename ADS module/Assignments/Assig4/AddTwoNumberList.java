package org.Ques;


/* 9. Add two numbers represented by linked lists.
•	Test Case 1:
Input: List1 = [2 → 4 → 3], List2 = [5 → 6 → 4] (243 + 465)
Output: Sum List = [7 → 0 → 8]
•	Test Case 2:
Input: List1 = [9 → 9 → 9], List2 = [1] (999 + 1)
Output: Sum List = [0 → 0 → 0 → 1]
*/


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class AddTwoNumberList {
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }
    
    

    public static void main(String[] args) {

        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);
        
        printList(list1);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);
        
        printList(list2);

        ListNode result1 = addTwoNumbers(list1, list2);
        System.out.print("Sum List 1: ");
        printList(result1); 

    }
}
