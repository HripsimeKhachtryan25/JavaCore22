package chapters.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\n փոխակերպել intը byteով.");
        b = (byte) i;
        System.out.println("i ու b " + i + " " + b);
        System.out.println("\n փոխակերպել doubleը  intով.");
        i = (int) d;
        System.out.println("d ու i " + d + " " + i);
        System.out.println("\n փոխակերպել doubleը   byteով.");

        b = (byte) b;
        System.out.println("d ու b " + d + " " + b);
    }
}
