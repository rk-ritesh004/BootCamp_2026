import java.util.*;
class node {
    int data;
    node left, right;
    node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class levelorder {
    static node buildtree(int arr[], int i) {
        if (i >= arr.length)
            return null;
        node root = new node(arr[i]);
        root.left = buildtree(arr, 2 * i + 1);
        root.right = buildtree(arr, 2 * i + 2);
        return root;
    }
    static void LOT(node root) {
        if (root == null)
            return;
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                node curr = q.remove();
                level.add(curr.data);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            System.out.println(level);
        }
    }
    public static void main(String arg[]) {
        int arr[] = {1, 2, 3, 4, 5};

        node root = buildtree(arr, 0);

        LOT(root);
    }
}