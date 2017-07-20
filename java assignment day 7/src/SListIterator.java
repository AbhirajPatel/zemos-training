/**
 * Created by zemoso on 19/7/17.
 */
public class SListIterator<E> {

    Node<E> current;
    Node<E> head;
    Node<E> temp;
    /**
     * non default constructor (store the head pointer too);
     * @param arg
     */
    SListIterator(Node<E> arg) {
        current = arg;
        head = current;
    }

    /**
     * will check that it has nest element or not.
     * @return
     */
    public boolean hasNext() {

        return current.next != null;
    }
    /**
     * will move the cursor to next element.
     * @return
     */
    public Node<E> Next() {
        current = current.next;
        return current;
    }

    /**
     * this will insert the specified element head of list.
     * @param e
     */
    public void insert(E e) {

        current.next = new Node<E>(e, current.next);
        //current.next = new Node<E>();
        current = current.next;
    }

    /**
     * removing the specified no of item from the begining of list;
     */
    public void remove() {
        current = head;
        if(current.next != null) {
            current.next = current.next.next;
        }
    }

    /**
     * will return element at specified element position
     * @param int_var
     * @return
     */
    public String currentElement(int int_var)
    {
       temp = head;
        while(int_var > 0)
        {
            temp=temp.next;
            int_var--;
        }
       return temp.toString();
    }

}
