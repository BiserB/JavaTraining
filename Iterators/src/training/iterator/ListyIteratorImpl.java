package training.iterator;

import java.util.*;
import java.util.function.Consumer;

public class ListyIteratorImpl<T> implements ListyIterator<T>{

    private List<T> list;
    private int index;

    public ListyIteratorImpl(T... items) {

        this.list = new ArrayList<T>(Arrays.asList(items));
        this.index = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new InternalIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        while(this.iterator().hasNext()){
            action.accept(this.iterator().next());
        }
    }

    @Override
    public boolean move() {
        if (this.hasNext()){
            this.index++;
            return true;
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override
    public void print() {
        if (this.list.size() == 0){
            throw new UnsupportedOperationException("Invalid Operation!");
        }

        if (this.iterator().hasNext()){
            System.out.println(this.list.get(index));
        }
    }

    private final class InternalIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public T next() {
            return list.get(index++);
        }

    }
}
