package DSA.LinkedList.DSA_Problem_Leetcode;

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }
}

class Node {

    private ListNode head;

    public void insert(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public ListNode getHead() {
        return head;
    }

    public void display() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;

            int sum = value1 + value2 + carry;

            carry = sum / 10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }
}

public class Add {

    public static void main(String[] args) {

        Node list1 = new Node();

        list1.insert(2);
        list1.insert(4);
        list1.insert(3);

        Node list2 = new Node();

        list2.insert(5);
        list2.insert(6);
        list2.insert(4);

        System.out.print("List 1 : ");
        list1.display();

        System.out.print("List 2 : ");
        list2.display();

        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(
                list1.getHead(),
                list2.getHead());

        System.out.print("Result : ");

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        System.out.println();
    }
}
