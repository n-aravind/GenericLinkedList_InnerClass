package com.linked_list;

public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;
    private Node<T> lastNode;

    void add(T value) {

        Node<T> newNode = new Node<T>(value);

        if (this.head == null) {
            this.head = newNode;
        } else {
            this.lastNode.setReference(newNode);
        }
        this.lastNode = newNode;
        size++;
    }


    int size() {
        return size;
    }

    private Node<T> getNodeAtReference(int i) {
        Node<T> node = this.head;
        if (i <= size) {
            int j = 1;
            do {
                if (i == j) {
                    break;
                }
                node = node.getReference();
                j++;
            } while (j <= this.size());
        }
        return node;
    }

    String get(int i) {
        if (this.head == null) {
            return "Linked List is Empty";
        } else if (i == 0) {
            return "Invalid Index: List Index starts from 1";
        } else if (i > this.size) {
            return "Invalid Index:  Out of Bounds";
        } else {
            return "Value at the given index is " + getNodeAtReference(i).getValue();
        }
    }

    void delete(int i) {
        if (i <= 0 || i > this.size) {
            return;
        } else if (i == 1 && size == 1) {
            this.head = null;
            this.lastNode = null;
        } else if (i == 1 && i < size) {
            this.head = this.head.getReference();
        } else if (i == size) {
            getNodeAtReference(i - 1).setReference(null);
            lastNode = getNodeAtReference(i - 1);
        } else {
            getNodeAtReference(i - 1).setReference(getNodeAtReference(i + 1));
        }
        size--;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

    private class Node<T> {
        private T value;
        private Node<T> reference;

        private Node(T value) {
            this.value = value;
            this.reference = null;
        }

        private Node<T> getReference() {
            return reference;
        }

        private void setReference(Node<T> reference) {
            this.reference = reference;
        }

        private T getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    ", reference=" + reference +
                    '}';
        }
    }

}
