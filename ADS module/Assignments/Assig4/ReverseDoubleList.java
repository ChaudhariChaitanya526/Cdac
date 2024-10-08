package org.Ques;


/*8. Reverse a doubly linked list.
•	Test Case 1:
Input: List = [5, 10, 15, 20]
Output: List = [20, 15, 10, 5]
•	Test Case 2:
Input: List = [4, 8, 12]
Output: List = [12, 8, 4]
*/

public class ReverseDoubleList {
	
	class Node {
	    int data;
	    Node prev, next;

	    Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}
	
	Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
	
    public static void main(String[] args) {
    	ReverseDoubleList list1 = new ReverseDoubleList();
        list1.insert(5);
        list1.insert(10);
        list1.insert(15);
        list1.insert(20);
        System.out.print("Original List 1: ");
        list1.traverse();
        list1.reverse();
        System.out.print("Reversed List 1: ");
        list1.traverse();  

        ReverseDoubleList list2 = new ReverseDoubleList();
        list2.insert(4);
        list2.insert(8);
        list2.insert(12);
        System.out.print("Original List 2: ");
        list2.traverse();
        list2.reverse();
        System.out.print("Reversed List 2: ");
        list2.traverse();  
    }
}

