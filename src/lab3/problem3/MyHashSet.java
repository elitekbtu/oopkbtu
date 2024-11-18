package lab3.problem3;
import java.util.HashSet;

public class MyHashSet<T> implements MyCollection<T> {
    private HashSet<T> set = new HashSet<>();
    
    @Override
    public boolean add(T element) {
        return set.add(element);
    }
    
    @Override
    public boolean remove(T element) {
        return set.remove(element);
    }
    
    @Override
    public boolean contains(T element) {
        return set.contains(element);
    }
    
    @Override
    public int size() {
        return set.size();
    }
    
    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }
    
    @Override
    public void clear() {
        set.clear();
    }
}