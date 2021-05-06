import ds.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        /**stack.push(30);
        stack.push(40);*/
        System.out.println(stack.isEmpty());
        stack.print();
        System.out.println(stack.size());


    }
}
