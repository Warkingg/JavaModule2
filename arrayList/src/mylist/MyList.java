package mylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){ }
    public MyList(int capicity){

    }
    public void add(int index ,E e){
        int newSize = elements.length * 2;
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = e;
    }
    public E remove(int index){
        return
    }
    public int size(){
        return
    }
    public E clone(){

    }
    public boolean contains(E o){
        return
    }
    public int indexOf(){
        return
    }
    public boolean add(E o){
        return
    }
    public void ensureCapacity(int minCapacity){

    }
    public E get(){
        return
    }
    public void clear(){

    }

}
