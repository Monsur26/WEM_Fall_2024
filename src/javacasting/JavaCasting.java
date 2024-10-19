package javacasting;

public class JavaCasting {
    public static void main(String[] args) {
        byte e =12;
        int c =e; // implicit casting, widening the range

        long a = 777;
        int d = (int) a; // explicit casting, narrowing the range

        int q = (int) 43.90000;
        System.out.println(q);

        int v =87675;
        String s = String.valueOf(v);
        System.out.println(s);
    }


}
