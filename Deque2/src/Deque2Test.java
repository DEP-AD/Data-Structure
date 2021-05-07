import ds2.Deque2;

public class Deque2Test {
    public static void main(String[] args) {

        Deque2 deque2 = new Deque2();

        deque2.enqueue(10);
        deque2.enqueue(20);
        deque2.enqueue(30);
        deque2.dequeue();
        deque2.print();
        deque2.enqueueRear(50);
        deque2.dequeueFront();
        deque2.print();
        System.out.println(deque2.peek());

    }
}
