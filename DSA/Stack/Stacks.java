
/*Woah!
learned about the, increment of top affects a lot.

 */
class Stack {

    int stack[] = new int[6];
    int top = 0;

    public void push(int data) {
        if (top == 6) {

            System.out.println("Stack is full");
        } else {
            stack[top++] = data;
        }

    }

    public void show() {
        for (int n : stack) {
            System.out.print(" " + n);
        }

        System.out.println();

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else{
             int data;
        top--;
        data = stack[top];
        stack[top] = 0;

        return data;

        }
        return -1;
       
    }

    public int peek() {
        int data;

        data = stack[top - 1];

        return data;
    }

    public int size() {

        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

}

public class Stacks {

    public static void main(String[] args) {
        Stack n = new Stack();
        n.push(4);

        n.show();
        n.push(3);

        n.show();
        n.push(784);

        n.show();
        n.push(345);

        n.show();
        n.push(6789);

        n.show();
        n.push(8989);

        n.show();
        n.push(5633);

        n.show();

        System.out.println("Deleted value is: " + n.pop());
        System.out.println("Deleted value is: " + n.pop());
        System.out.println("Deleted value is: " + n.pop());
        System.out.println("Deleted value is: " + n.pop());
        System.out.println("Deleted value is: " + n.pop());
        System.out.println("Deleted value is: " + n.pop());

        // System.out.println("Peek value is: " + n.peek());
        // System.out.println("The size  is: " + n.size());
        System.out.println("The Stack  is Empty?: " + n.isEmpty());

        // n.peek();
        n.pop();
        // n.show();

    }
}
