
package org.Ques;

/*14. Check if two linked lists intersect, and find the intersection point if they do.
•	Test Case 1:
Input: List1 = [1 → 2 → 3 → 4 → 5], List2 = [6 → 7 → 4 → 5]
Output: Intersection Point = 4
•	Test Case 2:
Input: List1 = [10 → 20 → 30 → 40], List2 = [15 → 25 → 35]
Output: No Intersection
*/

public class TwoLinkedListsIntersect {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node getIntersection(Node head1, Node head2) {
        if (head1 == null || head2 == null) return null;

        int len1 = getLength(head1);
        int len2 = getLength(head2);

        if (len1 > len2) {
            head1 = advanceList(head1, len1 - len2);
        } else {
            head2 = advanceList(head2, len2 - len1);
        }

        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1; 
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return null; 
    }

    private int getLength(Node head) {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    private Node advanceList(Node head, int steps) {
        Node current = head;
        for (int i = 0; i < steps; i++) {
            current = current.next;
        }
        return current;
    }

    public Node createList(int... values) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    	TwoLinkedListsIntersect checkIntersection = new TwoLinkedListsIntersect();

        Node list1 = checkIntersection.createList(1, 2, 3, 4, 5);
        Node list2 = checkIntersection.createList(6, 7);
        list2.next.next = list1.next.next; 

        System.out.print("Test Case 1 - Input List1: ");
        checkIntersection.printList(list1);
        System.out.print("Test Case 1 - Input List2: ");
        checkIntersection.printList(list2);

        Node intersection1 = checkIntersection.getIntersection(list1, list2);
        if (intersection1 != null) {
            System.out.println("Intersection Point = " + intersection1.data);
        } else {
            System.out.println("No Intersection");
        }

        Node list3 = checkIntersection.createList(10, 20, 30, 40);
        Node list4 = checkIntersection.createList(15, 25, 35);

        System.out.print("Test Case 2 - Input List1: ");
        checkIntersection.printList(list3);
        System.out.print("Test Case 2 - Input List2: ");
        checkIntersection.printList(list4);

        Node intersection2 = checkIntersection.getIntersection(list3, list4);
        if (intersection2 != null) {
            System.out.println("Intersection Point = " + intersection2.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}
