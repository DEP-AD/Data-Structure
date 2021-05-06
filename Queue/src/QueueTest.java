import ds.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.print();

    }
}
