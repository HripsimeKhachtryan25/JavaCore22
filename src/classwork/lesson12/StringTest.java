package classwork.lesson12;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String name = "Poxos Poxosyan Poxosi";
//        name = name.trim();
//        System.out.println(name.trim());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        String ly = "asdsfly";
//        System.out.println(ly.endsWith("ly"));
//
//  String subName = name.substring(6,15);
//        System.out.println(subName);

        char[] chars = name.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                result += "o".toUpperCase();
            } else {
                result += chars[i];
            }
        }
        System.out.println(result);

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));

        }


    }
}
