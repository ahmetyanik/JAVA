package denemek;

public class A {
    public void m1() {
        System.out.println("A");
    }
    public static void main(String[] args) {
        A a =  new B();
        a.m1();
    }
}