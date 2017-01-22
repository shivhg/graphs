package traversal;

import java.util.Stack;

/**
 * Created by hgshivakumar on 22/01/17.
 */
public class Postorder {
    public static void main(String [] args) {
        Node n = new NodeInitializer().create();
        recursivePostOrder(n);
        System.out.print("\n");
        iterativePostOrder(n);
    }

    public static void recursivePostOrder(Node root) {
        if(root == null) {
            return;
        }
        recursivePostOrder(root.left);
        recursivePostOrder(root.right);
        System.out.print(root.data);
    }

    public static void iterativePostOrder(Node root) {
        Stack<Node> s = new Stack();
        s.push(root);
        Node cur = root;
        Node prev = null;

        while(true) {
            if (s.empty()) {
                break;
            }
            cur = s.pop();
            if(prev != null && cur.right == prev) {
                System.out.print(cur.data);
                prev = cur;
                continue;
            }

            if(prev != null && cur.left == prev) {

                if(cur.right != null) {
                    s.push(cur);
                    s.push(cur.right);
                } else {
                    System.out.print(cur.data);
                }
                prev = cur;
                continue;
            }

            if(cur.left != null) {
                s.push(cur);
                s.push(cur.left);
                prev = null;
            } else {
                System.out.print(cur.data);
                if(cur.right != null) {
                    s.push(cur.right);
                }
                prev = cur;
            }
        }
    }
}
