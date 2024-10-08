package org.Ques;

/*3. Detect a cycle in a linked list.
•	Test Case 1:
Input: List = [1 → 2 → 3 → 4 → 5 → 3 (cycle)]
Output: Cycle Detected
•	Test Case 2:
Input: List = [6 → 7 → 8 → 9]
Output: No Cycle
*/

public class Detectcycle {	
	
	class Node {
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

    public void createCycle(int pos) {
        if (head == null) {
        	return;
        }

        Node current = head;
        Node cycleNode = null;
        int count = 0;

        while (current.next != null) {
            if (count == pos) {
                cycleNode = current;
            }
            current = current.next;
            count++;
        }

        if (cycleNode != null) {
            current.next = cycleNode; 
        }
    }

    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         
            fast = fast.next.next;    

            if (slow == fast) {
                return true;          
            }
        }
        return false;                 
    }
	
	
    public static void main(String[] args) {
    	
    	Detectcycle list1 = new Detectcycle();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        list1.createCycle(2); 
        System.out.println("Output: " + (list1.hasCycle() ? "Cycle Detected" : "No Cycle")); 

        Detectcycle list2 = new Detectcycle();
        list2.insert(6);
        list2.insert(7);
        list2.insert(8);
        list2.insert(9);
        System.out.println("Output: " + (list2.hasCycle() ? "Cycle Detected" : "No Cycle")); 
}
}
