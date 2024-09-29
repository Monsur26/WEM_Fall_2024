package practice;

import lecture.Variables;

public class Transfer {
    public static void main(String[] args) {
        // //Variables is a public class, so reference can be made anywhere within the same package or outside the package
        Variables variables = new Variables();
        // DefaultAccess can not be referred here because it resides on another package
       // DefaultAccess defaultAccess = new DefaultAccess();
    }
}
