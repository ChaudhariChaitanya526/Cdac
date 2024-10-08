package org.Ques;

/*
2. Reverse a singly linked list.
•	Test Case 1:
Input: List = [1, 2, 3, 4, 5]
Output: List = [5, 4, 3, 2, 1]
•	Test Case 2:
Input: List = [10, 20, 30]
Output: List = [30, 20, 10]
*/


public class ReveserList {
	
	static class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	
	
	private Node head;

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
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current;      
            current = next;      
        }
        head = prev; 
    }

    public void display() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
            if (current != null) System.out.print(", ");
        }
        System.out.println("]");
    }
	
	
	
    public static void main(String[] args) {
        // Test Case 1
    	ReveserList list1 = new ReveserList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        System.out.print("Original List: ");
        list1.display(); 
        list1.reverse();
        System.out.print("Reversed List: ");
        list1.display(); 
    }
}
