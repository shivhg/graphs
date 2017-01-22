import java.util.Stack;
import java.util.Arrays;

/**
 * Created by hgshivakumar on 22/01/17.
 */


public class Preorder {
    public static void main(String [] args) {
        Node n = new Tree().create();
        recursivePreOrder(n);
        System.out.print("\n");
        iterativePreOrder(n);
    }

    public static void recursivePreOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data);
        recursivePreOrder(root.left);
        recursivePreOrder(root.right);
    }

    public static void iterativePreOrder(Node root) {
        Stack <Node>s = new Stack();
        s.push(root);

        while(!s.empty()) {
            Node cur = s.pop();
            System.out.print(cur.data);
            if(cur.right != null) { s.push(cur.right); }
            if(cur.left != null) { s.push(cur.left); }
        }
    }
}
