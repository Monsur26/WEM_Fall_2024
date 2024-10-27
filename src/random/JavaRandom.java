package random;

import java.util.Random;

public class JavaRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);

        System.out.println(a);
        String s= "ubdihaib"+a;
    }
}
