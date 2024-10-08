
package org.Ques;

/*13. Insert a node in a sorted circular linked list.
•	Test Case 1:
Input: Circular List = [10 → 20 → 30 → 40 → (back to 10)], Insert 25
Output: Circular List = [10 → 20 → 25 → 30 → 40 → (back to 10)]
•	Test Case 2:
Input: Circular List = [5 → 15 → 25 → (back to 5)], Insert 10
Output: Circular List = [5 → 10 → 15 → 25 → (back to 5)]
*/

public class SortedCircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node insertSorted(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node current = head;
        Node prev = null;

        do {
            prev = current;
            current = current.next;

            if (current.data >= value) {
                break;
            }

        } while (current != head);

        if (current == head && value < head.data) {
            prev.next = newNode;
            newNode.next = head;
            return newNode; 
        }

        prev.next = newNode;
        newNode.next = current;

        return head; 
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
    	SortedCircularLinkedList circularList = new SortedCircularLinkedList();

        // Test Case 1
        Node head1 = circularList.createCircularList(10, 20, 30, 40);
        System.out.print("Test Case 1 - Input Circular List: ");
        circularList.printCircularList(head1);

        head1 = circularList.insertSorted(head1, 25); 
        System.out.print("Output Circular List: ");
        circularList.printCircularList(head1);

        // Test Case 2
        Node head2 = circularList.createCircularList(5, 15, 25);
        System.out.print("Test Case 2 - Input Circular List: ");
        circularList.printCircularList(head2);

        head2 = circularList.insertSorted(head2, 10); 
        System.out.print("Output Circular List: ");
        circularList.printCircularList(head2);
    }
}
