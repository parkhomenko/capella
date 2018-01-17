package com.hillel;

public class CustomHashMap {

  private Node[] elements;
  private final static int SIZE = 16;

  public CustomHashMap() {
    elements = new Node[SIZE];
  }

  /**
   * This method stores element into hash map
   * @param key a key parameter
   * @param value a value parameter
   */
  public void put(Student key, Grade value) {
    Node node = new Node(key, value, null);
    int hashCode = key.hashCode();
    int index = calculateIndex(hashCode);

    if (elements[index] == null) {
      elements[index] = node;
      return;
    }

    Node current = elements[index];
    while (current != null) {
      if (current.key.equals(key)) {
        current.value = value;
        return;
      }
      current = current.next;
    }

    elements[index] = node;
  }

  private int calculateIndex(int hashCode) {
    return Math.abs(hashCode) % SIZE;
  }

  public Grade get(Student key) {
    int hashCode = key.hashCode();
    int index = calculateIndex(hashCode);

    Node node = elements[index];

    while (node != null) {
      if (node.key.equals(key)) {
        return node.value;
      }
      node = node.next;
    }

    return null;
  }

  private class Node {
    private Student key;
    private Grade value;
    private Node next;

    public Node(Student key, Grade value, Node next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }
}
