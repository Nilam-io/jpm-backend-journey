
class Node {

    int data;
    Node next;

    Node() {

    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkList {

    Node head;

    public void insert(int data) { //to insert at the end of the list
        Node node = new Node(); // object
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;

        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;

            }
            n.next = node;

        }

    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;

        }
        System.out.println(node.data);
    }

}

public class LinkedListBasic {

    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        // list.add(5);
        // list.add(4, 12);
        // list.remove(3);

        LinkList list = new LinkList();
        list.insert(5);
        list.insert(34);
        list.insert(56);
        list.show();

    }
}
