package org.Ques;

/*4. Merge two sorted linked lists.
•	Test Case 1:
Input: List1 = [1, 3, 5], List2 = [2, 4, 6]
Output: Merged List = [1, 2, 3, 4, 5, 6]
•	Test Case 2:
Input: List1 = [10, 15, 20], List2 = [12, 18, 25]
Output: Merged List = [10, 12, 15, 18, 20, 25]
*/

public class MergeTwoList {
	
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

    public MergeTwoList merge(MergeTwoList list2) {
    	MergeTwoList mergedList = new MergeTwoList();
        Node current1 = head;
        Node current2 = list2.head;

        while (current1 != null || current2 != null) {
            if (current1 == null) {
                mergedList.insert(current2.data);
                current2 = current2.next;
            } else if (current2 == null) {
                mergedList.insert(current1.data);
                current1 = current1.next;
            } else if (current1.data < current2.data) {
                mergedList.insert(current1.data);
                current1 = current1.next;
            } else {
                mergedList.insert(current2.data);
                current2 = current2.next;
            }
        }

        return mergedList;
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
        // Test Case 1
    	MergeTwoList list1 = new MergeTwoList();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);
        list1.display(); 

        MergeTwoList list2 = new MergeTwoList();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);
        list2.display(); 

        MergeTwoList mergedList1 = list1.merge(list2);
        System.out.print("Test Case 1: Merged List = ");
        mergedList1.display(); 

        // Test Case 2
        MergeTwoList list3 = new MergeTwoList();
        list3.insert(10);
        list3.insert(15);
        list3.insert(20);

        MergeTwoList list4 = new MergeTwoList();
        list4.insert(12);
        list4.insert(18);
        list4.insert(25);

        MergeTwoList mergedList2 = list3.merge(list4);
        System.out.print("Test Case 2: Merged List = ");
        mergedList2.display();
    }
}


