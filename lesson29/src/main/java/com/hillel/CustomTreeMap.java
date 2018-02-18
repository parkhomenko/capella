package com.hillel;

public class CustomTreeMap {

  private Node root;

  public void add(Integer key, String value) {

    Node newNode = new Node(key, value);

    if (root == null) {
      root = newNode;
      return;
    }

    Node current = root;
    while (true) {
      if (current.key.equals(key)) {
        current.value = value;
        return;
      }

      if (key < current.key) {
        if (current.left == null) {
          current.left = newNode;
          return;
        }
        current = current.left;
      } else {
        if (current.right == null) {
          current.right = newNode;
          return;
        }
        current = current.right;
      }
    }
  }

  public void traverse() {
    traverseTree(root);
  }

  private void traverseTree(Node current) {
    if (current == null) {
      return;
    }

    traverseTree(current.left);
    System.out.println(current.key + " - " + current.value);
    traverseTree(current.right);
  }

  private class Node {
    private Integer key;
    private String value;

    private Node left;
    private Node right;

    public Node(Integer key, String value) {
      this.key = key;
      this.value = value;
    }
  }

}
