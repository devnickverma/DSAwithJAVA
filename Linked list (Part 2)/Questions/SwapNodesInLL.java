// Java program to swap two nodes in a linked list without swapping data
class Node {
    int data; // Data stored in the node
    Node next; // Pointer to the next node

    // Constructor to initialize a node
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    Node head; // Head of the linked list

    // Function to swap two nodes in the linked list
    public void swapNodes(int x, int y) {
        // If both nodes to be swapped are the same, no action is needed
        if (x == y) {
            return;
        }

        // Search for node with value x and track its previous node
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // Search for node with value y and track its previous node
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, return
        if (currX == null || currY == null) {
            return;
        }

        // Update previous node references for x and y
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // Swap the next pointers of x and y
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // Function to add a new node at the beginning of the linked list
    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    // Function to print the linked list
    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Solution llist = new Solution();

        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        // Print the original linked list
        System.out.println("Linked list before swapping:");
        llist.printList();

        // Swap nodes with values 4 and 3
        llist.swapNodes(4, 3);

        // Print the updated linked list
        System.out.println("Linked list after swapping:");
        llist.printList();
    }
}
