package chapters.chapter7;

public class AccessTest1 {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        ob.a = 10;
        ob.b = 20;
//        ob.c = 100;
        ob.setC(100);
        System.out.println("a,b, and c:  " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
