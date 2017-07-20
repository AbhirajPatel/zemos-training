/**
 * Created by zemoso on 19/7/17.
 */

public class SList<E> {

    private Node<E> headLink = new Node<E>();

    SListIterator<E> iterator() { return new SListIterator<E>(headLink); }
@Override
public String toString() {
    if(headLink.next == null) return "SList: [blank]";

    SListIterator<E> it = this.iterator();
    String str = new String();
    while(it.hasNext()) {

        str=str+it.Next()+" , " ;
    }
    return str ;
}
}




