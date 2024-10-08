package org.Ques;

/*11. Flatten a multilevel doubly linked list.
•	Test Case 1:
Input: List = [1 → 2 → 3, 3 → 7 → 8, 8 → 10 → 12]
Output: Flattened List = [1 → 2 → 3 → 7 → 8 → 10 → 12]
•	Test Case 2:
Input: List = [1 → 2 → 3, 2 → 5 → 6, 6 → 7 → 9]
Output: Flattened List = [1 → 2 → 5 → 6 → 7 → 9 → 3]
*/

public class FlattenMultilevelList {

    // Definition for a Node in the doubly linked list
    static class Node {
        int data;
        Node next;
        Node child;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
            this.prev = null;
        }
    }

    // Method to flatten the multilevel doubly linked list
    public Node flatten(Node head) {
        if (head == null) return null;

        Node dummy = new Node(0); // Dummy node to help in flattening
        Node lastAdded = dummy; // Keep track of the last added node

        lastAdded = flattenList(head, lastAdded); // Flatten the list

        return dummy.next; // Return the flattened list starting from the next of dummy
    }

    // Recursive method to flatten the list
    private Node flattenList(Node node, Node lastAdded) {
        Node current = node; // Pointer to traverse the current list

        while (current != null) {
            lastAdded = addNode(lastAdded, current); // Add the current node to the flattened list

            if (current.child != null) {
                lastAdded = flattenList(current.child, lastAdded); // Flatten the child list
            }

            current = current.next; // Move to the next node
        }

        return lastAdded; // Return the last added node for further additions
    }

    // Helper method to add a node to the flattened list
    private Node addNode(Node lastAdded, Node newNode) {
        lastAdded.next = newNode; // Link the last added node to the new node
        newNode.prev = lastAdded; // Set the previous of the new node
        return newNode; // Return the new node as the last added node
    }

    // Method to create a chain of nodes
    private Node createChain(Node start, int... values) {
        Node current = start; // Start from the given node
        for (int value : values) {
            Node newNode = new Node(value); // Create a new node
            current.next = newNode; // Link the new node
            newNode.prev = current; // Set the previous of the new node
            current = newNode; // Move to the new node
        }
        return current; // Return the last node in the chain
    }

    // Method to print the list
    public void printList(Node head) {
        Node current = head; // Pointer to traverse the list
        while (current != null) {
            System.out.print(current.data + " → "); // Print the data
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        FlattenMultilevelList flattenList = new FlattenMultilevelList();

        // Test Case 1
        Node head1 = new Node(1);
        flattenList.createChain(head1, 2, 3);

        head1.next.child = new Node(7);
        flattenList.createChain(head1.next.child, 8, 10, 12);

        System.out.print("Test Case 1 - Input List: ");
        flattenList.printList(head1);
        Node flattened1 = flattenList.flatten(head1);
        System.out.print("Flattened List: ");
        flattenList.printList(flattened1);

        // Test Case 2
        Node head2 = new Node(1);
        flattenList.createChain(head2, 2, 3);

        head2.next.child = new Node(5);
        flattenList.createChain(head2.next.child, 6, 7, 9);

        System.out.print("Test Case 2 - Input List: ");
        flattenList.printList(head2);
        Node flattened2 = flattenList.flatten(head2);
        System.out.print("Flattened List: ");
        flattenList.printList(flattened2);
    }
}
