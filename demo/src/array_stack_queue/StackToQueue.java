package array_stack_queue;

import java.util.Stack;

public class StackToQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackToQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void offer(int number) {
        this.stack1.push(number);
        addStack2();
    }

    public Integer peek() {
        if (this.stack2.isEmpty()) {
            return null;
        }
        return this.stack2.peek();
    }

    private void addStack2() {
        while (!this.stack1.isEmpty()) {
            this.stack2.push(this.stack1.pop());
        }
    }

    public Integer poll() {
        if (this.stack2.isEmpty()) {
            throw new RuntimeException("∂”¡–“—ø’£°");
        }
        return this.stack2.pop();
    }
}


class StackToQueueTest {
    public static void main(String[] args) {
        StackToQueue queue = new StackToQueue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}