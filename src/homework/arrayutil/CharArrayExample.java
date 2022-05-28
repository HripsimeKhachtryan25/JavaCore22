package homework.arrayutil;

import com.sun.org.apache.xpath.internal.objects.XString;

public class CharArrayExample {
    public static void main(String[] args) {
//        1) Ունենք հետևյալ մասիվը՝
//char[] chars = {'j','a','v','a','l,'o','v', 'e'};
//ունենք նաև մի սինվոլ՝ char c = 'o';
//Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int countC = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                countC++;

            }
        }
        System.out.println("c փոփոխականի քանակը մասիվի մեջ ->" + (countC));
//2) Ունենք հետևյալ մասիվը՝
//char[] chars2 = {'j','a','v','a','l,'o','v', 'e'};
//պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char charMiddle, charMidd;
        charMiddle = chars[chars.length / 2];
        charMidd = chars[(chars.length / 2) - 1];
        System.out.print(charMiddle + " ");
        System.out.println(charMidd);
// 3) Ունենք հետևյալ մասիվը՝՝
//char[] chars3 = {'j','a','v','a','l,'o','l', 'y'};
//պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        int lastNum = chars3[chars3.length - 1];
        int previousNum = chars3[chars3.length - 2];
        if (previousNum == 'l' && lastNum == 'y') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
//4) Ունենք հետևյալ մասիվը՝
//char[] bobArray = {'b','a',b','o','l','a'};
////Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
////օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
        char[] bobArray = {'a', 'a', 'b', 'o', 'l', 'b'};
        boolean bobText = false;
        for (int i = 0; i < bobArray.length-2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobText = true;
                break;
            }
        }
        System.out.println(bobText);

//5) Ունենք հետևյալ մասիվը՝
//char[] text = {' ',' ','b','a','r','e','v',' ',' '};
//պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }


        }

    }
}
