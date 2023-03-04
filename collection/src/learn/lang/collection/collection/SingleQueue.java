package learn.lang.collection.collection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

public class SingleQueue<E> extends AbstractQueue<E> {

    private E count;

    @Override
    public boolean offer(E e) {
        // insert
        if (count == null) {
            // just null will add
            count = e;
            return true;
        }
        return false;
    }

    @Override
    public E poll() {
        // retrive and remove
        E temp = count;
        count = null;
        return temp;
    }

    @Override
    public E peek() {
        // retrive not remove
        return count;
    }

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(count).iterator();
    }

    @Override
    public int size() {
        return count == null ? 0 : 1;
    }

}
