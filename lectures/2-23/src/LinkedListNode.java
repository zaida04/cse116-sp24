public class LinkedListNode<T> {
    private T value;
    private LinkedListNode next;

    public LinkedListNode(T val, LinkedListNode next) {
        this.value = val;
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public String toString() {
        String out = "";
        out += this.value;
        if (this.next != null) {
            out += this.next.toString() + " ";
        }
        return out;
    }

    public LinkedListNode<T> getNext() {
        return this.next;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> first = new LinkedListNode<>(1, null);
        first = new LinkedListNode<>(2, first);
        first = new LinkedListNode<>(3, first);
        String out = first.toString();
        System.out.println(out);
    }
}
