package collectionframework.javaarraylist;

import java.util.ArrayList;
import java.util.List;

public class Ruuner {
    public static void main(String[] args) {
        Students student1 = new Students(1,"John","11122 Hiillybilly", 21322);
        Students student2 = new Students(2,"Mary","76 gh ave",9876);
        Students student3 = new Students(3,"Ryan","54 franklin blvd",8764);

        List<Students> stdList = new ArrayList<>();
        stdList.add(student1);
        stdList.add(student2);
        stdList.add(student3);

        for (Students s : stdList){
            System.out.println(s.stdiD +","+s.studentName+ ","+ s.stdAddress + ","+ s.cellNo);

        }
    }
}
