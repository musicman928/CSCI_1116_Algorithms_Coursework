import java.util.Arrays;

public class GenericQueue<E> {
    private Node<E> head;

    public GenericQueue() {

    }

    public GenericQueue(Node<E> head) {
        this.head = head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public void enqueue(E e) {
        if (head == null) {
            head = new Node<>(e);
            return;
        }

        Node<E> pointer = head;

        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }

        pointer.setNext(new Node<E>(e));
    }

    public E dequeue() {
        Node<E> temp = head;

        head = head.getNext();

        return temp.getData();
    }

    public void showQueue() {
        Node<E> temp = head;
        System.out.println("Showing queue: ");
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println("");
    }

    public void test() {
        System.out.println("Making a new GenericQueue<Integer>");
        GenericQueue<Integer> testqueue = new GenericQueue<>();
        System.out.println("Enqueuing '1'");
        testqueue.enqueue(1);
        testqueue.showQueue();
        System.out.println("Enqueuing '2'");
        testqueue.enqueue(2);
        testqueue.showQueue();
        System.out.println("Dequeuing");
        testqueue.dequeue();
        testqueue.showQueue();
        System.out.println("Enqueuing '3'");
        testqueue.enqueue(3);
        testqueue.showQueue();

    }
}
