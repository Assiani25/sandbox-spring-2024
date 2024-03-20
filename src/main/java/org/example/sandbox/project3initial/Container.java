package org.example.sandbox.project3initial;

public interface Container<T> extends Iterable<T> {
   boolean isEmpty();
   int size();
   void add(T item);
}
