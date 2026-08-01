
class Nnode {

    int data;
    Nnode left;
    Nnode right;

    Nnode(int data) {
        this.data = data;
    }
}

class Tree {

    Nnode root;

    public void insert(int data) {
        root = insertRec(root, data);

    }

    public Nnode insertRec(Nnode root, int data) {

        if (root == null) {
            root = new Nnode(data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);

        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        }

        return root;

    }

    public void inorder() {
        inorderRec(root);

    }

    public void inorderRec(Nnode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
}

public class Binary {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(8);
        t.insert(78);
        t.insert(34);
        t.insert(28907);
        t.insert(10);
        t.insert(0);
        t.inorder();

    }

}
