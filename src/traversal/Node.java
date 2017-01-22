package traversal;

/**
 * Created by hgshivakumar on 22/01/17.
 */
public class Node {
    public Node left;
    public Node right;
    public int data;

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
