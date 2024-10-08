package org.Ques;


/*6. Remove duplicates from a sorted linked list.
•	Test Case 1:
Input: List = [1, 1, 2, 3, 3, 4]
Output: List = [1, 2, 3, 4]
•	Test Case 2:
Input: List = [7, 7, 8, 9, 9, 10]
Output: List = [7, 8, 9, 10]
*/




public class Removeduplicate {
	
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
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
        }
    }

    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;  
            } else {
                current = current.next;  
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
	
	
    public static void main(String[] args) {

    	Removeduplicate list1 = new Removeduplicate();
        list1.insert(1);
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(3);
        list1.insert(4);
        System.out.print("Original List 1: ");
        list1.display();
        list1.removeDuplicates();
        System.out.print("After Removing Duplicates: ");
        list1.display();  

        Removeduplicate list2 = new Removeduplicate();
        list2.insert(7);
        list2.insert(7);
        list2.insert(8);
        list2.insert(9);
        list2.insert(9);
        list2.insert(10);
        System.out.print("Original List 2: ");
        list2.display();
        list2.removeDuplicates();
        System.out.print("After Removing Duplicates: ");
        list2.display();  
    }
}
