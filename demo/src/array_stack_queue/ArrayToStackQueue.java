package array_stack_queue;

public class ArrayToStackQueue {
    public static class ArrayStack {
        private Integer[] arr;
        private Integer size;

        public ArrayStack(int initSize) {
            if (initSize < 0) {
                throw new IllegalArgumentException("ջ�Ĵ�С����С�� 0");
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
                throw new ArrayIndexOutOfBoundsException("ջ������");
            }
            arr[size++] = number;
        }

        public Integer pop() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException("ջ�ѿգ�");
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
                throw new IllegalArgumentException("���г��Ȳ���С�� 0��");
            }
            arr = new Integer[initSize];
            size = 0;
            //first ָ����׵�λ��
            first = 0;
            //last ָ���β��յ�λ��
            last = 0;
        }

        public void offer(int number) {
            if (size == arr.length) {
                throw new ArrayIndexOutOfBoundsException("����������");
            }
            arr[last++] = number;
            last = last < arr.length ? last : 0;
            size++;
        }

        public Integer poll() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException("�����ѿգ�");
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
