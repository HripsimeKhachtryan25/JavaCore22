package homework.practicehomework;

public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;
    }


    int calceAge(int years) {

        return years * 365;
    }

    int nextNumber(int number) {
        return number + 1;
    }


    boolean isSnameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean reverseBool(boolean value) {
        return !value;
    }

    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;
        } else {
            return array2.length;
        }
    }

}



