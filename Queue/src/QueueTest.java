import ds.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.print();
        System.out.println(queue.contains(40));
        System.out.println(queue.contains(60));
        System.out.println(queue.peek());
        queue.clear();
        queue.print();
        queue.dequeue();

    }
}
