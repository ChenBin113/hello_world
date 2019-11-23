package array_stack_queue;

import java.util.Stack;

public class MyStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int number) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(number);
        } else {
            int temp = this.stackMin.peek();
            if (temp < number) {
                this.stackMin.push(temp);
            } else {
                this.stackMin.push(number);
            }
        }
        this.stackData.push(number);
    }

    public Integer pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Õ»ÒÑ¿Õ£¡");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public Integer getMin() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Õ»ÒÑ¿Õ£¡");
        }
        return this.stackMin.peek();
    }
}

class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        System.out.println(stack.getMin());
        stack.push(2);
        System.out.println(stack.getMin());
        stack.push(3);
        System.out.println(stack.getMin());
        stack.push(0);
        System.out.println(stack.getMin());
        stack.push(-1);
        System.out.println(stack.getMin());
        stack.pop();
    }
}