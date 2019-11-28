package linkedlist;

import util.Node;

import java.util.Stack;

public class IsPalindromeList {
    // need n extra space
    public static boolean isPalindromeOne(Node head) {
        if (head == null || head.next == null) return true;
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null) {
            if (head.value != stack.pop().value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    // need n/2 extra space
    public static boolean isPalindromeTwo(Node head) {
        if (head == null || head.next == null) return true;
        // These steps ensure the rigth point can be the exactly position.
        Node right = head.next;
        Node cur = head;
        while (cur.next != null && cur.next.next != null) {
            right = right.next;
            cur = cur.next.next;
        }

        Stack<Node> stack = new Stack<>();
        while (right != null) {
            stack.push(right);
            right = right.next;
        }

        while (!stack.isEmpty()) {
            if (stack.pop().value != head.value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }


    public static boolean isPalindromeThree(Node head) {
        if (head == null || head.next == null) return true;
        Node n1 = head;
        Node n2 = head;
        // n1 will be the end of left part or center
        while (n2.next != null && n2.next.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
        }
        // n2 will be the begin of right part
        n2 = n1.next;
        n1.next = null;

        // convert the right part
        Node n3 = null;
        while (n2 != null) {
            n1 = n2.next; // save next node
            n2.next = n3;
            n3 = n2;
            n2 = n1;
        }
        // n3 point the end of list; n2 & n1 is null
        // n3 | n2 | n1
        n1 = head;
        n2 = n3;

        boolean res = true;
        // compare n1 n3; n2 save the end of list
        while (n1 != null && n3 != null) {
            if (n1.value != n3.value) {
                res = false;
                break;
            }
            n1 = n1.next;
            n3 = n3.next;
        }

        // reconvert the right part
        // reconvert the end of list
        n3 = n2.next;
        n2.next = null;

        // n1 | n3 | n2
        while (n3 != null) {
            n1 = n3.next; // save the node
            n3.next = n2;
            n2 = n3;
            n3 = n1;
        }

        return res;
    }


    public static void printLinkedList(Node node) {
        System.out.print("Linked List: ");
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        printLinkedList(head);
        System.out.print(isPalindromeOne(head) + " | ");
        System.out.print(isPalindromeTwo(head) + " | ");
        System.out.println(isPalindromeThree(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindromeOne(head) + " | ");
        System.out.print(isPalindromeTwo(head) + " | ");
        System.out.println(isPalindromeThree(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        printLinkedList(head);
        System.out.print(isPalindromeOne(head) + " | ");
        System.out.print(isPalindromeTwo(head) + " | ");
        System.out.println(isPalindromeThree(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindromeOne(head) + " | ");
        System.out.print(isPalindromeTwo(head) + " | ");
        System.out.println(isPalindromeThree(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        printLinkedList(head);
        System.out.print(isPalindromeOne(head) + " | ");
        System.out.print(isPalindromeTwo(head) + " | ");
        System.out.println(isPalindromeThree(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindromeOne(head) + " | ");
        System.out.print(isPalindromeTwo(head) + " | ");
        System.out.println(isPalindromeThree(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindromeOne(head) + " | ");
        System.out.print(isPalindromeTwo(head) + " | ");
        System.out.println(isPalindromeThree(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindromeOne(head) + " | ");
        System.out.print(isPalindromeTwo(head) + " | ");
        System.out.println(isPalindromeThree(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindromeOne(head) + " | ");
        System.out.print(isPalindromeTwo(head) + " | ");
        System.out.println(isPalindromeThree(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");
    }

}
