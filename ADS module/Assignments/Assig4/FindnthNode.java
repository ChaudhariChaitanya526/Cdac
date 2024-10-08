package org.Ques;

/*
5. Find the nth node from the end of a linked list.
•	Test Case 1:
Input: List = [10, 20, 30, 40, 50], n = 2
Output: 40
•	Test Case 2:
Input: List = [5, 15, 25, 35], n = 4
Output: 5
*/

public class FindnthNode {

	Node head;
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
    
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

    public int findNthFromEnd(int n) {
        int length = 0;
        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (n > length) {
            System.out.println("List is shorter than " + n);
            return -1;
        }

        temp = head;
        for (int i = 0; i < length - n; i++) {
            temp = temp.next;
        }

        return temp.data;
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
    	FindnthNode list1 = new FindnthNode();
        list1.insert(10);
        list1.insert(20);
        list1.insert(30);
        list1.insert(40);
        list1.insert(50);
        list1.display();

        System.out.println("Output: " + list1.findNthFromEnd(2)); 

        FindnthNode list2 = new FindnthNode();
        list2.insert(5);
        list2.insert(15);
        list2.insert(25);
        list2.insert(35);
        list1.display();

        System.out.println("Output: " + list2.findNthFromEnd(4)); 
    }
}

