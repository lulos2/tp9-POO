package TPEspecial;

import java.util.Iterator;


public class MyIterator<T> implements Iterator<T>{
    Node<T> pointer;

    public MyIterator(Node<T> cursor) {
        this.pointer = cursor;
    }


    @Override
    public boolean hasNext() {
        return this.pointer != null;
    }

    @Override
    public T next() {
        T value = pointer.getValue();
        pointer = pointer.getNext();
        return value;
    }



}
