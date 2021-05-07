import ds.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.enqueueRear(100);
        deque.enqueueRear(200);
        deque.print();
    }
}
