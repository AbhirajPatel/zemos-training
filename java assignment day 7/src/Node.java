/**
 * Created by zemoso on 19/7/17.
 */
public class Node<E> {
    E e;
    Node<E> next;

    /**
     * default constructor to just to assign element to null.
     */
    Node(){
        this.e = null;
        this.next = null;
    }
    Node(E e, Node<E> next) {
        this.e = e;
        this.next = next;
    }
    Node(E e) {
        this.e = e;
        this.next = null;
    }
    @Override
    public String toString() {
        if(e == null)
            return "null";


        return e.toString();
    }

}
