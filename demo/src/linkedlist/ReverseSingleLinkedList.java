package linkedlist;

import util.Node;

import static util.InitLinkedList.initLinkedList;
import static util.Print.printLinkedList;

public class ReverseSingleLinkedList {
    public static Node reverseOne(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node new_head = null;
        while (head != null) {
            Node tmp = head.next;
            head.next = new_head;
            new_head = head;
            head = tmp;
        }
        return new_head;
    }

    public static Node reverseTwo(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }


    public static void main(String[] args) {
        Node head = initLinkedList();
        printLinkedList(head);
        Node new_head_one = reverseOne(head);
        printLinkedList(new_head_one);
        Node new_head_two = reverseTwo(new_head_one);
        printLinkedList(new_head_two);
    }
}
