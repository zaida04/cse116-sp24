package trees;
import trees.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> tree = new TreeNode<>(3);

        tree.setLeft(1);
        tree.left.setLeft(0);
        tree.left.setRight(2);

        tree.setRight(4);
        tree.right.setRight(5);
        System.out.println(tree.printTree());


        TreeNode<Integer> tree2 = new TreeNode<Integer>(2);
        tree2.setRight(4);
        tree2.right.setLeft(3);
        System.out.println(tree2.printTree());
    }
}
