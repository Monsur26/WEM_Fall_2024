package collectionframework.javaarraylist;

import java.util.ArrayList;

public class JavaArrayListPractice {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList();
        arrayList.add("Name");
        arrayList.add("Name1");
        arrayList.add("Name2");
        arrayList.add("Name");
        arrayList.add("Name3");
        arrayList.add("Name");

        for (String s: arrayList){
            System.out.println(s);
        }
        System.out.println("************** ********************* **********");
        arrayList.remove("Name");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        //Updating value
        arrayList.add(0,"Game");



    }
}
