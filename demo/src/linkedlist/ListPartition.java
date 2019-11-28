package linkedlist;

import util.Node;

import static util.InitLinkedList.initLinkedList;
import static util.Print.printLinkedList;

public class ListPartition {
    public static Node listPartitionOne(Node head, int pivot) {
        if (head == null || head.next == null) return head;
        Node cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        Node[] arr = new Node[count];
        cur = head;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cur;
            cur = cur.next;
        }

        // sort part of linkedlist
        partition(arr, pivot);

        int i;
        for (i = 0; i < arr.length - 1; i++) {
            arr[i].next = arr[i + 1];
        }
        arr[i].next = null;
        return arr[0];
    }

    private static void partition(Node[] arr, int pivot) {
        int less = -1;
        int more = arr.length;
        int cur = 0;
        while (cur < more) {
            if (arr[cur].value < pivot) {
                swap(arr, cur, less + 1);
                less++;
                cur++;
            } else if (arr[cur].value == pivot) {
                cur++;
            } else {
                swap(arr, cur, more - 1);
                more--;
            }
        }
    }

    private static void swap(Node[] arr, int cur, int position) {
        Node tmp = arr[cur];
        arr[cur] = arr[position];
        arr[position] = tmp;
    }


    public static Node listPartitionTwo(Node head, int pivot) {

    }

    public static void main(String[] args) {
        Node head1 = initLinkedList();
        printLinkedList(head1);
        int pivot1 = 6;
        System.out.println("-------------pivot = " + pivot1 + "-------------");
        head1 = listPartitionOne(head1, pivot1);
        printLinkedList(head1);

        Node head2 = initLinkedList();
        printLinkedList(head2);
        int pivot2 = 4;
        System.out.println("-------------pivot = " + pivot2 + "-------------");
        head2 = listPartitionTwo(head2, pivot2);
        printLinkedList(head2);
    }

}
