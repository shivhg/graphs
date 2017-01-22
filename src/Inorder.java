import java.util.Stack;
import java.util.Arrays;
/**
 * Created by hgshivakumar on 22/01/17.
 */
class Node {
    Node left;
    Node right;
    int data;

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class Tree {
    Node create() {
        Node n4 = new Node(4, null, null);
        Node n5 = new Node(5, null, null);
        Node n6 = new Node(6, null, null);
        Node n7 = new Node(7, null, null);
        Node n2 = new Node(2, n4, n5);
        Node n3 = new Node(3, n6, n7);
        Node n1 = new Node(1, n2, n3);
        /*         1
              2        3
           4    5    6   7

         */

        return n1;
    }
}


public class Inorder {
    public static void main(String [] args) {
        Node n = new Tree().create();
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
