// Java program to delete N nodes after M nodes in a linked list
import java.util.*;

class Solution {

    // Static nested class to define a Node of the linked list
    static class Node {
        int data; // Data part of the node
        Node next; // Pointer to the next node
    }

    // Function to insert a new node at the beginning of the list
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to skip M nodes and delete N nodes in the linked list
    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head; // Pointer to traverse the list
        Node t; // Temporary pointer for deletion

        // Traverse the entire list
        while (curr != null) {
            // Skip M nodes
            for (int count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }

            // If we've reached the end of the list, return
            if (curr == null) {
                return;
            }

            // Start deleting N nodes
            t = curr.next;
            for (int count = 1; count <= N && t != null; count++) {
                Node temp = t; // Temporary node to store current node for deletion
                t = t.next; // Move to the next node
                // Node temp will be garbage collected
            }

            // Connect the current node to the (N+1)th node
            curr.next = t;

            // Move the current pointer to the next node
            curr = t;
        }
    }

    // Main method to test the functionality
    public static void main(String args[]) {
        Node head = null; // Initialize the head of the linked list
        int M = 2, N = 3; // M: Number of nodes to skip, N: Number of nodes to delete

        // Create the linked list
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);

        // Print the initial linked list
        System.out.printf("M = %d, N = %d \nLinked list we have is:\n", M, N);
        printList(head);

        // Perform the skip M and delete N operation
        skipMdeleteN(head, M, N);

        // Print the modified linked list
        System.out.printf("\nLinked list after deletion is:\n");
        printList(head);
    }
}
