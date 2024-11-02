package collectionframework.javaarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //adding elements to arraylist object
        arrayList.add(1);
        arrayList.add("Item");
        arrayList.add(2.00);
        arrayList.add('A');

        //Traversing through ArrayList
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //size() function allows to find
        System.out.println("Number of items in the list :" +arrayList.size() );
        //remove() by object name or index
        arrayList.remove(3);

        //Traversing with foreach loop
        for(Object a : arrayList){
            System.out.println(a);
        }

        arrayList.remove("Item");
        System.out.println(arrayList.size());
        //get() allows getting specific elemnet by index
        System.out.println(arrayList.get(0));

        //Traversing using for loop
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        //contains() allows to search for any specific item
        System.out.println(arrayList.contains("Item"));
    }
}
