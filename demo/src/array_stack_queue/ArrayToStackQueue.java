package array_stack_queue;

public class ArrayToStackQueue {
    public static class ArrayStack {
        private Integer[] arr;
        private Integer size;

        public ArrayStack(int initSize) {
            if (initSize < 0) {
                throw new IllegalArgumentException("栈的大小不能小于 0");
            }
            arr = new Integer[initSize];
            size = 0;
        }

        public Integer peek() {
            if (size == 0) {
                return null;
            }
            return arr[size - 1];
        }

        public void push(Integer number) {
            if (size == arr.length) {
                throw new ArrayIndexOutOfBoundsException("栈已满！");
            }
            arr[size++] = number;
        }

        public Integer pop() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException("栈已空！");
            }
            return arr[--size];
        }
    }

    public static class ArrayQueue {
        private Integer[] arr;
        private Integer size;
        private Integer first;
        private Integer last;

        public ArrayQueue(int initSize) {
            if (initSize < 0) {
                throw new IllegalArgumentException("队列长度不能小于 0！");
            }
            arr = new Integer[initSize];
            size = 0;
            //first 指向队首的位置
            first = 0;
            //last 指向队尾后空的位置
            last = 0;
        }

        public void offer(int number) {
            if (size == arr.length) {
                throw new ArrayIndexOutOfBoundsException("队列已满！");
            }
            arr[last++] = number;
            last = last < arr.length ? last : 0;
            size++;
        }

        public Integer poll() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException("队列已空！");
            }
            int res =  arr[first++];
            first = first < arr.length ? first : 0;
            size--;
            return res;
        }

        public Integer peek() {
            if (size == 0) {
                return null;
            }
            return arr[first];
        }
    }
}
