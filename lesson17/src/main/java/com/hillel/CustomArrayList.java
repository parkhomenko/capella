package com.hillel;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayList implements CustomList {

  private static final int BASE_SIZE = 10;
  private String[] array;
  private int size;

  public CustomArrayList() {
    //array = new String[BASE_SIZE];
    this(BASE_SIZE);
  }

  public CustomArrayList(int capacity) {
    array = new String[capacity];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(String element) {
    if (size > array.length) {
      resizeArray();
    }
    array[size] = element;
    size++;
  }

  private void resizeArray() {
  }

  @Override
  public void add(int index, String element) {

  }

  @Override
  public boolean remove(String element) {
    return false;
  }

  @Override
  public String remove(int index) {
    return null;
  }

  @Override
  public void clear() {

  }

  @Override
  public String get(int index) {
    if (index > size || index < 0) {
      throw new NoSuchElementException("Такого элемента не существует");
    }
    return array[index];
  }

  @Override
  public void set(int index, String element) {

  }

  @Override
  public int indexOf(String element) {
    return 0;
  }

  @Override
  public Iterator iterator() {
    return new ListIterator();
  }

  public Iterator backwardIterator() {
    return new BackwardListIterator();
  }

  private class ListIterator implements Iterator {

    private int current;

    ListIterator() {
      current = 0;
    }

    @Override
    public boolean hasNext() {
      return current < size;
    }

    @Override
    public Object next() {
      if (current >= size) {
        throw new NoSuchElementException();
      }

      return array[current++];
    }
  }

  private class BackwardListIterator implements Iterator {

    private int current;

    BackwardListIterator() {
      current = size - 1;
    }

    @Override
    public boolean hasNext() {
      return current >= 0;
    }

    @Override
    public Object next() {
      return array[current--];
    }
  }
}
