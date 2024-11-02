package collectionframework.linkedlist;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Mango");
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Orange");

        for (String s: linkedList){
            System.out.println(s);
        }
        System.out.println(linkedList.size());
        linkedList.remove(2);
        System.out.println(linkedList.get(2));

        // Arraylist and Linked list contains all the same functions, LinkedList allows more function

        //allows adding value to begining or ending of the list
        linkedList.addFirst("Peach");
        linkedList.addLast("Pineapple");

        for (String s: linkedList){
            System.out.println(s);
        }

        linkedList.removeLastOccurrence("Orange");


    }
}
