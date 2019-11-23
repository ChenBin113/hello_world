package array_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {
    private Queue<Integer> queue;
    private Queue<Integer> help;

    public QueueToStack() {
        this.queue = new LinkedList<>();
        this.help = new LinkedList<>();
    }

    public void push(int number) {
        queue.offer(number);
    }

    public Integer peek() {
        if (queue.isEmpty()) {
            return null;
        }
        int res = helper();
        help.offer(res);
        swap();
        return res;
    }

    //�����ݴ� queue ת�Ƶ� help �У�����һ����
    private Integer helper() {
        while (queue.size() > 1) {
            help.offer(queue.poll());
        }
        return queue.poll();
    }

    private void swap() {
        Queue<Integer> temp = queue;
        queue = help;
        help = temp;
    }

    public Integer pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("ջ�ѿ�");
        }
        int res = helper();
        swap();
        return res;
    }
}

class QueueToStackTest {
    public static void main(String[] args) {
        QueueToStack stack = new QueueToStack();
        System.out.println(stack.peek());
        stack.push(1);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
