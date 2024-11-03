package collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        //to add key value option
        map.put("user1","Monsur");
        map.put("user2","Rayhan");
        map.put("user3","Faruk");
        map.put("user4","Jamal");
        map.put("user5","Umar");

        //getting specific value
        System.out.println(map.get("user1"));

        // remove allows by only specifying key or specifying both key and value
       // map.remove("user1");
        map.remove("user1", "Monsur");

        System.out.println(map.get("user4"));

        System.out.println(map.size());

        //conatinsvalue() or containkey() allows search by either key or value and gives true false as answers

        System.out.println(map.containsValue("Faruk"));
        System.out.println(map.containsKey(1));

        // traversing through map
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
    }
}
