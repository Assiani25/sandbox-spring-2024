package org.example.sandbox.project3initial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


public class Bag<T> implements Container<T> {
    private ArrayList<T> items;

    public Bag() {
        items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    // Extra credit: Implement forEach method
    @Override
    public void forEach(Consumer<? super T> action) {
        items.forEach(action);
    }

    // Extra credit: Implement spliterator method
    @Override
    public Spliterator<T> spliterator() {
        return items.spliterator();
    }
}