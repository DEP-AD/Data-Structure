import ds.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println(stack.isEmpty());
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.isEmpty());
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        //System.out.println(stack.size());


    }
}
