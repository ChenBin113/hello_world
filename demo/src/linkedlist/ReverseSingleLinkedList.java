package linkedlist;

import util.Node;

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
}
