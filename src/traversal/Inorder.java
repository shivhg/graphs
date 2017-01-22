package traversal;

import java.util.Stack;

/**
 * Created by hgshivakumar on 22/01/17.
 */

public class Inorder {
    public static void main(String [] args) {
        Node n = new NodeInitializer().create();
        recursiveInOrder(n);
        System.out.println();
        iterativeInOrder(n);
    }

    public static void recursiveInOrder(Node root) {
        if(root == null) {
            return;
        }
        recursiveInOrder(root.left);
        System.out.print(root.data);
        recursiveInOrder(root.right);
    }

    public static void iterativeInOrder(Node root) {
        Stack <Node> s = new Stack();
        Node cur = root;
        boolean done = true;
        while(done) {
            if(cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            else {
                if (s.empty()) {
                    done = false;
                } else {
                    cur = s.pop();
                    System.out.print(cur.data);
                    cur = cur.right;
                }
            }

        }
    }
}
