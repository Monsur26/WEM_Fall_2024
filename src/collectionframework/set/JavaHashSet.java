package collectionframework.set;

import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add("Ajay");
        set.add("Vijay");
        set.add("Ajay");
        set.add("Ravi");
        set.add("Jake");

        //Set does not allow duplicate elements
        // Do not maintain any insertion order
        for (Object e: set){
            System.out.println(e);
        }
        System.out.println(set.contains("Terry"));
        // requires to mention the item value
        set.remove("Vijay");

    }
}
