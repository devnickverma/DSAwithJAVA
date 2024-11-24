// Class to find the intersection point of two linked lists
class Solution {

    // Static nested class to define a Node of the linked list
    static class Node {
        int data; // Data part of the node
        Node next; // Pointer to the next node

        // Constructor to create a new node with given data
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to find the intersection node of two linked lists
    public Node getIntersectionNode(Node head1, Node head2) {
        // Traverse the second list
        while (head2 != null) {
            Node temp = head1;

            // For each node in the second list, traverse the first list
            while (temp != null) {
                // If nodes are the same, intersection is found
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next; // Move to the next node in the first list
            }
            head2 = head2.next; // Move to the next node in the second list
        }

        // Return null if no intersection is found
        return null;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create an instance of the class
        Solution list = new Solution();

        // Initialize two linked lists
        Node head1, head2;
        head1 = new Node(10); // Head of the first list
        head2 = new Node(3);  // Head of the second list

        // Add nodes to the second list
        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        // Create intersection point
        newNode = new Node(15);
        head1.next = newNode; // Add to the first list
        head2.next.next.next = newNode; // Add to the second list

        // Add more nodes to the first list
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null; // End the first list

        // Find and print the intersection point
        Node intersectionPoint = list.getIntersectionNode(head1, head2);

        if (intersectionPoint == null) {
            System.out.println("No Intersection Point");
        } else {
            System.out.println("Intersection Point: " + intersectionPoint.data);
        }
    }
}
