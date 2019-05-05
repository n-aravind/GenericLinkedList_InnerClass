package com.linked_list;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();
        System.out.println(myLinkedList.get(5));

        myLinkedList.add("Aravind");
        myLinkedList.add("Gil");
        myLinkedList.add("Cobol");
        myLinkedList.add("Java");
        myLinkedList.add("Raja");
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(5));
        myLinkedList.delete(3);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(5));

        LinkedList<Integer> intLinkedList = new LinkedList<Integer>();
        System.out.println(intLinkedList.get(5));

        intLinkedList.add(10);
        intLinkedList.add(20);
        intLinkedList.add(30);
        intLinkedList.add(40);
        intLinkedList.add(50);
        System.out.println(intLinkedList.size());
        System.out.println(intLinkedList.get(3));
        System.out.println(intLinkedList.get(5));
        intLinkedList.delete(3);
        System.out.println(intLinkedList.size());
        System.out.println(intLinkedList.get(3));
        System.out.println(intLinkedList.get(5));

        LinkedList<Object> genericLinkedList = new LinkedList<Object>();
        System.out.println(genericLinkedList.get(5));

        genericLinkedList.add("Aravind");
        genericLinkedList.add(20);
        genericLinkedList.add(30);
        genericLinkedList.add("Java");
        genericLinkedList.add(50);
        System.out.println(genericLinkedList.size());
        System.out.println(genericLinkedList.get(3));
        System.out.println(genericLinkedList.get(5));
        genericLinkedList.delete(3);
        System.out.println(genericLinkedList.size());
        System.out.println(genericLinkedList.get(3));
        System.out.println(genericLinkedList.get(5));
    }
}
