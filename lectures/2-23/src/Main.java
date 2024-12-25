public class Main {
    public static void main(String[] args) {

        Stack stack1 = new Stack<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        while (stack1.peek() != null) {
            System.out.println(stack1.pop());
        }

        Stack stack2 = new Stack<String>();
        stack2.push("Bob");
        stack2.push("Mary");
        stack2.push("Jane");

        while (stack2.peek() != null) {
            System.out.println(stack2.pop());
        }
    }
}