package com.hillel;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList implements Iterable {

  private Node first;
  //private Node last;

  public CustomLinkedList() {
    first = null;
    last = null;
  }

  public void add(int element) {
    Node current = new Node(element, null);

    if (first == null) {
      first = last = current;
    } else {
      last.next = current;
      last = current;
    }
  }

  public int get(int index) {
     int currentIndex = 0;
     Node current = first;

     while (current != null && currentIndex < index) {
       currentIndex++;
       current = current.next;
     }

     if (current == null) {
       throw new NoSuchElementException();
     }

     return current.value;
  }

  public int poll() {
    return 0;
  }

  public int peek() {
    return 0;
  }

  public void introduceCycle(int index) {
  }

  public boolean hasCycle() {
    return false;
  }

  @Override
  public Iterator iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator {

    Node current;

    ListIterator() {
      current = first;
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public Object next() {
      int val = current.value;
      current = current.next;
      return val;
    }
  }

  private class Node {

    int value;
    Node next;

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

  }
}
