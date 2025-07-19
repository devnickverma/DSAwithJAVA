import java.util.*;
class QueueUsingJCF{
    public static void main(String[] args) {
        // Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>(); // Or ArrayDeque
        Queue<Integer> q = new ArrayDeque<>(); // Or ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}