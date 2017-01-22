package traversal;

/**
 * Created by hgshivakumar on 22/01/17.
 */
public class NodeInitializer {
    public Node create() {
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
