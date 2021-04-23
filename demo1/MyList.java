package demo1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];



    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        size = capacity;
    }
    public void add(int index, E element) {
        ensureCapacity(size);
        for (int i = size -1; i>=index ; i++ ) {
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;
    }
    public E remove(int index) {
        E e = (E) elements[index];
        for (int i = index; i<size -1; i++){
            elements[i] = elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return e;
    }
    public int size() {
        return size;
    }

    public E[] clone() {
    E[] newElements = (E[]) (new Object[size]);
    System.arraycopy(elements,0, newElements, 0,size);
    elements = newElements;
    return newElements;
    }
    public  boolean contains(E o) {
        for (int i = 0 ; i < size ; i++){
            if (o.equals(elements[i])){
                return true;
            }
        }
        return false;
    }
    public int indexOF(E o) {
        for (int i = 0; i< size; i++) {
            if (o.equals(elements[i])) return  i;
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        minCapacity =size;
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public  E get(int i) {
        if (i < 0 || i >=size)
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds");
        return (E) elements[i];
    }
    public void clear() {
        elements = (E[]) new Object[size];
        size=0;
    }
}
