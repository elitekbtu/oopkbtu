package lab3.problem3;

public interface MyCollection<T> {
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
    void clear();
    MyIterator<T> iterator();
    interface MyIterator<E> {
        boolean hasNext();
        E next();
    }
}