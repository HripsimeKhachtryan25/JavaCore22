package classwork.lesson14;

public class StringExample2 {
    public static void main(String[] args) {
        String name = "poxos";
        String name1 = "poxos";
        String name2 = new String("poxos");
//        name += "ik";
        boolean result = name.equals(name1);


        System.out.println(result);
    }
}
