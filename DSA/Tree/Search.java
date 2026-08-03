class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Search
{
    static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == key)
        {
            return true;
        }

        return search(root.left, key) || search(root.right, key);
    }

    public static void main(String args[])
    {
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        System.out.println(search(root, 30));
    }
}