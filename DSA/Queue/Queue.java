
class Q {

    int queue[] = new int[4];
    int front;
    int rear;
    int size;

    public void enQueue(int data) {
        queue[rear] = data;
        rear = (rear + 1) ; //To make it circular
        size = size + 1;

    }

    public int deQueue() {

        int data = queue[front];

        queue[front] = 0;

        front = front + 1;
        size = size - 1;

        return data;

    }

    public void show() {

        for (int i = 0; i < size; i++) {

            System.out.print(" " + queue[(front + i)]);
        }
        System.out.println();
        for (int n : queue) {
            System.out.println(" " + n);
        }
    }
}

public class Queue {

    public static void main(String[] args) {
        Q q = new Q();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(57);
        q.enQueue(90);
        System.out.println("Element Deleted is?" + q.deQueue());
        System.out.println("Element Deleted is?" + q.deQueue());
        

        q.show();

    }

}
