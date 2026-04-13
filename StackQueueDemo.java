import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Stack (LIFO): " + stack);
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Queue (FIFO): " + queue);
        System.out.println("Queue poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
