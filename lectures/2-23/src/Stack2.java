import java.util.ArrayList;

public class Stack2<T> {
    private ArrayList<T> arr;

    public Stack2() {
        this.arr = new ArrayList<>();
    }

    public void push(T value) {
        arr.add(0, value);
    }

    public T pop() {
        if (arr.size() == 0) {
            return null;
        } else {
            return this.arr.remove(0);
        }
    }

    public T peek() {
        if (arr.size() == 0) {
            return null;
        } else {
            return this.arr.get(0);
        }
    }
}
