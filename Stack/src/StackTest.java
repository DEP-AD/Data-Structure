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
        System.out.println(stack.size());
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.contains(70);
        System.out.println(stack.peek());
        //stack.contains(70);
        stack.print();
        System.out.println(stack.size());
        stack.clear();
        System.out.println(stack.size());
        stack.print();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.contains(100));
        stack.print();


    }
}
