package homework.practicehomework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework pm = new PracticeHomework();
        System.out.println(pm.convert(3));
        System.out.println(pm.calceAge(20));
        System.out.println(pm.nextNumber(20));
        System.out.println(pm.isSnameNum(1,2));
        System.out.println(pm.lessThanOrEqualToZero(-5));
        System.out.println(pm.reverseBool(false));
        int[] array1 = {1,2,3,4};
        int [] array2 = {1,2,3};
        System.out.println(pm.maxLength(array1,array2));


    }

}
