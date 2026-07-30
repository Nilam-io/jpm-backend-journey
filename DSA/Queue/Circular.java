
class Q {

    int queue[] = new int[4];
    int front;
    int rear;
    int size;

    public void enQueue(int data) {
        if (!isFull()) {

            queue[rear] = data;
            rear = (rear + 1) % 4; //To make it circular
            size = size + 1;
        } else {
            System.out.println("The Queue is Full");
        }

    }

    public int deQueue() {
        int data = queue[front];

        if (!isEmpty()) {
            
            queue[front] = 0;

            front = front + 1;
            size = size - 1;

        } else {
            System.out.println("the Queue is Empty");
        }

        return data;

    }

    public void show() {

        for (int i = 0; i < size; i++) {

            System.out.print(" " + queue[(front + i) % 4]);
        }
        System.out.println();
        for (int n : queue) {
            System.out.println(" " + n);
        }
    }

    public int getsize() {
        return size;
    }

    public boolean isEmpty() {
        return getsize() == 0;
    }

    public boolean isFull() {
        return getsize() == 4;
    }

}

public class Circular {

    public static void main(String[] args) {
        Q q = new Q();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(57);
        q.enQueue(90);
        System.out.println("Element Deleted is?" + q.deQueue());
        System.out.println("Element Deleted is?" + q.deQueue());
        q.enQueue(23);
        q.enQueue(78);
        q.enQueue(102);
        q.enQueue(450);

        q.show();

    }

}
