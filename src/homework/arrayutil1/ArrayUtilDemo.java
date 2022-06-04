package homework.arrayutil1;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 1, 9, 6};
        ArrayUtil au = new ArrayUtil();
        System.out.println(au.max(numbers));
        System.out.print(au.min(numbers));
        System.out.println();
        System.out.print(au.countElem(numbers));
        System.out.println();
        System.out.print(au.countElement(numbers));
        System.out.println();
        System.out.print(au.result(numbers));
        System.out.println();
       au.sortArray(numbers);
        System.out.println();
       au.sortArray1(numbers);

    }
}
