import com.sun.istack.internal.Nullable;

public class Node<E> {
    public Node<E> next;
    public E data;

    Node() {

    }

    Node(E data) {
        this.data = data;
        next = null;
    }

    Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;

    }

    public void setData(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }
}
