package trees;

public class TreeNode<T> {
    public TreeNode<T> left;
    public TreeNode<T> right;

    public T value;

    public TreeNode(T value) {
        this.value = value;
    }

    public void setLeft(T value) {
        this.left = new TreeNode<>(value);
    }

    public void setRight(T value) {
        this.right = new TreeNode<>(value);
    }

    public String printTree() {
        String out = "";

        if (this.left != null) {
            out += this.left.printTree();
        }

        out += this.value.toString() + " ";

        if (this.right != null) {
            out += this.right.printTree();
        }

        return out;
    }
}