package org.Ques;

/* 7. Implement a doubly linked list with insert, delete, and traverse operations.
•	Test Case 1:
Input: Insert 10 → Insert 20 → Insert 30 → Delete 20
Output: List = [10, 30]
•	Test Case 2:
Input: Insert 1 → Insert 2 → Insert 3 → Delete 1
Output: List = [2, 3]
*/



public class DoubleLinkedList {
	
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

    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current != null) {
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
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
    	
    	DoubleLinkedList list1 = new DoubleLinkedList();
        list1.insert(10);
        list1.insert(20);
        list1.insert(30);
        System.out.print("Original List 1: ");
        list1.traverse();
        list1.delete(20);
        System.out.print("After Deleting 20: ");
        list1.traverse();  

        DoubleLinkedList list2 = new DoubleLinkedList();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);
        System.out.print("Original List 2: ");
        list2.traverse();
        list2.delete(1);
        System.out.print("After Deleting 1: ");
        list2.traverse();  
    }
}
