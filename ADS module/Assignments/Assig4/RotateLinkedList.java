package org.Ques;

/*10. Rotate a linked list by k places.
•	Test Case 1:
Input: List = [10, 20, 30, 40, 50], k = 2
Output: List = [30, 40, 50, 10, 20]
•	Test Case 2:
Input: List = [5, 10, 15, 20], k = 3
Output: List = [20, 5, 10, 15]
*/

public class RotateLinkedList {
	
	class ListNode {
	    int val;
	    ListNode next;

	    ListNode(int val) {
	        this.val = val;
	        this.next = null;
	    }
	}
	
	private ListNode head;

    public void addNode(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void rotate(int k) {
        if (head == null || head.next == null || k == 0) {
            return;
        }

        ListNode current = head;
        int length = 1; 
        while (current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head;

        k = k % length; 
        int breakPoint = length - k; 
        current = head;

        for (int i = 1; i < breakPoint; i++) {
            current = current.next;
        }

        head = current.next;
        current.next = null;
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {

    	RotateLinkedList list1 = new RotateLinkedList();
        list1.addNode(10);
        list1.addNode(20);
        list1.addNode(30);
        list1.addNode(40);
        list1.addNode(50);

        System.out.print("Original List: ");
        list1.printList(); 
        list1.rotate(2);
        System.out.print("Rotated List by 2: ");
        list1.printList(); 

        RotateLinkedList list2 = new RotateLinkedList();
        list2.addNode(5);
        list2.addNode(10);
        list2.addNode(15);
        list2.addNode(20);

        System.out.print("Original List: ");
        list2.printList(); 
        list2.rotate(3);
        System.out.print("Rotated List by 3: ");
        list2.printList(); 
    }
}



