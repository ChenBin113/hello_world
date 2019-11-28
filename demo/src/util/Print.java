package util;

public class Print {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.print("This is an empty linked-list.");
            return;
        }
        System.out.println("Print linked-list ...");
        while (head != null) {
            System.out.print(head.value + "  ");
            head = head.next;
        }
        System.out.println();
    }
}
