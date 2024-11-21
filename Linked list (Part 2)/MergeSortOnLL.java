public class LinkedList {

    // Node class to represent each element in the linked list
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize node with data and null next pointer
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // Points to the first node of the list
    public static Node tail; // Points to the last node of the list
    public static int size;  // Stores the size of the linked list

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        // Step 1: Create a new node with the given data
        Node newNode = new Node(data);
        size++; // Increment the size

        // If the list is empty, set head and tail to the new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: Point newNode's next to the current head
        newNode.next = head;

        // Step 3: Move head to the newNode
        head = newNode;
    }

    // Method to add a node at the end of the list
    public void addLast(int data) {
        // Step 1: Create a new node with the given data
        Node newNode = new Node(data);
        size++; // Increment the size

        // If the list is empty, set head and tail to the new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: Point tail's next to the newNode
        tail.next = newNode;

        // Step 3: Move tail to the newNode
        tail = newNode;
    }

    // Method to print the linked list
    public void print() {
        if (head == null) {
            System.out.print("Linked List is empty");
            return;
        }

        Node temp = head;
        // Traverse and print each node's data
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to add a node at a specific index
    public void add(int idx, int data) {
        if (idx == 0) { // If index is 0, add at the beginning
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        // Traverse to the (idx-1)th node
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // Insert newNode between temp and temp.next
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to remove the first node
    public int removeFirst() {
        if (size == 0) { // If list is empty, return error value
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // If only one node, reset head and tail
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data; // Store data of the node to be removed
        head = head.next; // Move head to the next node
        size--;
        return val;
    }

    // Method to remove the last node
    public int removeLast() {
        if (size == 0) { // If list is empty, return error value
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // If only one node, reset head and tail
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Traverse to the (size - 2)th node
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // Store data of the last node
        prev.next = null; // Remove link to the last node
        tail = prev; // Update tail
        size--;
        return val;
    }

    // Method for iterative search of a key
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        // Traverse the list and check each node's data
        while (temp != null) {
            if (temp.data == key) {
                return i; // Return index if key is found
            }
            i++;
            temp = temp.next;
        }

        return -1; // Return -1 if key is not found
    }

    // Recursive helper method for search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1; // Base case: key not found
        }

        if (head.data == key) {
            return 0; // Base case: key found at current node
        }
        int idx = helper(head.next, key); // Recursive search in the next node
        return idx == -1 ? -1 : idx + 1; // Return index if key is found
    }

    // Public method to initiate recursive search
    public int resSearch(int key) {
        return helper(head, key);
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        // Traverse the list and reverse links
        while (curr != null) {
            next = curr.next; // Save the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev to current
            curr = next; // Move to next node
        }

        head = prev; // Update head to the new front
    }

    // Method to delete the nth node from the end
    public void deleteNthfromEnd(int n) {
        // Calculate the size of the list
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) { // If the nth node is the head
            head = head.next;
            return;
        }

        // Traverse to the (sz - n)th node
        Node prev = head;
        for (int i = 1; i < sz - n; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next; // Remove the nth node from the end
    }

    // Method to find the middle node using slow-fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Slow will be at the middle node
    }

    // Method to check if the linked list is a palindrome
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true; // A single node or empty list is a palindrome
        }

        // Step 1: Find the middle of the list
        Node midNode = findMid(head);

        // Step 2: Reverse the second half of the list
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // Right half head after reverse
        Node left = head;

        // Step 3: Check if left half matches the reversed right half
        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; // List is a palindrome
    }

    public static  boolean isCycle(){
        Node slow = head;
        Node fast = head;
         
        while (fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                return true; // Cycle exist
            }
        }
        return false; // Cycle Doesn't exist
    }

    public static void removeCycle() {
        // Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                cycle = true; // Cycle exists
                break;
            }
        }
        
        if (!cycle) {
            return; // No cycle
        }

        // Find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove Cycle -> set last node's next to null
        if (prev != null) {
            prev.next = null;
        } else {
            // Handle case when cycle is directly at the head and only contains one node
            fast.next = null;
        }
    }

    public static Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node left, Node right) {
        Node result = new Node(-1); // Temporary dummy node
        Node res = result;

        while (left != null && right != null) {
            if (left.data < right.data) {
                result.next = left;
                left = left.next;
            } else {
                result.next = right;
                right = right.next;
            }
            result = result.next;
        }

        result.next = (left != null) ? left : right;
        return res.next; // Return the merged list, skipping the dummy node
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) { // Base condition
            return head;
        }

        // Find the middle of the linked list
        Node mid = getMiddle(head);

        // Split the linked list into two halves
        Node rightHead = mid.next;
        mid.next = null; // Disconnect the left part

        // Recursively sort both halves
        Node leftSorted = mergeSort(head);
        Node rightSorted = mergeSort(rightHead);

        // Merge the sorted halves
        return merge(leftSorted, rightSorted);
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1); 
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println("Original Linked List:");
        ll.print();

        // Update the head with the sorted list
        ll.head = mergeSort(ll.head);

        System.out.println("\nSorted Linked List:");
        ll.print();
    }

}
