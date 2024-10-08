package org.Ques;

/*
1. Implement a singly linked list with basic operations: insert, delete, search.
•	Test Case 1:
Input: Insert 3 → Insert 7 → Insert 5 → Delete 7 → Search 5
Output: List = [3, 5], Found = True
•	Test Case 2:
Input: Insert 9 → Insert 4 → Delete 4 → Search 10
Output: List = [9], Found = False
*
*/

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
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

    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
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
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(3);
        list1.insert(7);
        list1.insert(5);
        list1.delete(7);
        list1.display(); 
        System.out.println("Found: " + list1.search(5)); 

    }
}
