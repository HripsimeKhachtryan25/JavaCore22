package classwork.lesson14;

public class A {
    public int a = 10;

    void meth() {
        B b = new B();
        System.out.println(b.b);
    }

    class B {
        int b = 20;

        void meth() {
            System.out.println(a);
        }
    }
}
