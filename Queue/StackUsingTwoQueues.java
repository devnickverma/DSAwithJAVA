import java.util.*;

class StackUsingTwoQueues {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push operation
        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop operation
        public int pop() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }

            int top = -1;
            if (!q1.isEmpty()) {
                while (q1.size() > 1) {
                    q2.add(q1.remove());
                }
                top = q1.remove();
            } else {
                while (q2.size() > 1) {
                    q1.add(q2.remove());
                }
                top = q2.remove();
            }

            return top;
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }

            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
