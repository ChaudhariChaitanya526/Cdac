
package org.Ques;

/*
 * 12. Split a circular linked list into two halves.
•	Test Case 1:
Input: Circular List = [1 → 2 → 3 → 4 → 5 → 6 → (back to 1)]
Output: List1 = [1 → 2 → 3], List2 = [4 → 5 → 6]
•	Test Case 2:
Input: Circular List = [10 → 20 → 30 → 40 → (back to 10)]
Output: List1 = [10 → 20], List2 = [30 → 40]

 */

public class CircluarLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node[] splitCircularList(Node head) {
        if (head == null) return new Node[]{null, null};

        Node slow = head; 
        Node fast = head; 

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = head; 
        Node head2 = slow.next; 

        slow.next = head1; 
        fast.next = head2; 

        return new Node[]{head1, head2}; 
    }

    public Node createCircularList(int... values) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            Node newNode = new Node(values[i]);
            current.next = newNode;
            current = newNode;
        }
        current.next = head; 

        return head;
    }

    public void printCircularList(Node head) {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " → ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to " + head.data + ")");
    }

    public static void main(String[] args) {
    	CircluarLinkedList circularList = new CircluarLinkedList();

        Node head1 = circularList.createCircularList(1, 2, 3, 4, 5, 6);
        System.out.print("Test Case 1 - Input Circular List: ");
        circularList.printCircularList(head1);

        Node[] result1 = circularList.splitCircularList(head1);
        System.out.print("List1: ");
        circularList.printCircularList(result1[0]);
        System.out.print("List2: ");
        circularList.printCircularList(result1[1]);

        Node head2 = circularList.createCircularList(10, 20, 30, 40);
        System.out.print("Test Case 2 - Input Circular List: ");
        circularList.printCircularList(head2);

        Node[] result2 = circularList.splitCircularList(head2);
        System.out.print("List1: ");
        circularList.printCircularList(result2[0]);
        System.out.print("List2: ");
        circularList.printCircularList(result2[1]);
    }
}
