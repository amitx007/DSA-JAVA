package recurssion;

public class part1 {
    public static void main(String[] args) {
        meth1(1);
    }
    public static void meth1(int n){
        System.out.println(n);
        meth2(n+1);
    }
    public static void meth2(int n){
        System.out.println(n);
        meth3(n+1);
    }
    public static void meth3(int n){
        System.out.println(n);
        meth4(n+1);
    }
    public static void meth4(int n){
        System.out.println(n);
        meth5(n+1);
    }
    public static void meth5(int n){
        System.out.println(n);
    }
}
