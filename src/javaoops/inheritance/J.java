package javaoops.inheritance;

public abstract class J {
    int b;
    int c;

    public J(int b, int c){
        this.b=b;
        this.c=c;

        int sum = b+c;
        System.out.println(sum);
    }
    public J(){

    }
}
