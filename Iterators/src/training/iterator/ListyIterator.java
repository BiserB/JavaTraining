package training.iterator;

import java.util.Iterator;

public interface ListyIterator<T> extends Iterable<T> {

    boolean move();

    boolean hasNext();

    void print();
}
