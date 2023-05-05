import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(452);

        stack.push(632);

        stack.push(12);

        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(23);
        queue.add(2153);
        queue.add(5123);
        queue.add(2335);
        System.out.println(queue);
        System.out.println(queue.size());
        for(int i=0;i<4;i++){
            queue.remove();
        }
        System.out.println(queue.size());

        System.out.println(queue);


        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(34);
        deque.addLast(523);
        deque.addFirst(2019);
        deque.addLast(241);

        System.out.println(deque);






    }
}