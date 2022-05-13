package chapters.chapter2;

public class IfSample {

    public static void main(String[] args) {

        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("xը փոքր է yից");

        x = x * 2;
        if (x == y) System.out.println("xը հավասար է yին");

        x = x * 2;
        if (x > y) System.out.println("xը մեծ է yից");

        if (x == y) System.out.println("x = y");


    }
}
