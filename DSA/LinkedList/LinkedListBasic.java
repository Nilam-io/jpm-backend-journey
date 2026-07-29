
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
        System.out.println(node.data); // because at the last node the, condition becomes true
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
        // there is no requirement of any while loop

    }
    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            for( int i =0;i<index-1;i++){
                n =n.next;
            }
           Node n1= n.next;
           n.next = n1.next; // good one thoda dimaag laga yaha! : )



        }
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        if (index == 0) {
            insertAtStart(data);
            
        }
        else{
            
        for (int i = 0; i < index-1; i++) {

            n = n.next;

        }
        node.next = n.next;
        n.next = node;
            
        }


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
        list.insertAtStart(2);
        list.insertAt(3, 36);
        list.deleteAt(2);
        list.show();

    }
}
