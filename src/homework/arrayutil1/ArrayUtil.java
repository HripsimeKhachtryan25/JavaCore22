package homework.arrayutil1;

public class ArrayUtil {
    //  max-ը մասիվի ամենամեծ թիվը
    int max(int[] array) {

        int max = array[0];

        for (int j = 1; j < array.length; j++) {

            if (array[j] > max) {
                max = array[j];
            }
        }
        return max;
    }

    //        min-ը մասիվի ամենափոքր թիվն է
    int min(int[] array) {
        int min;
        if (array[0] < array[1]) {
            min = array[0];
        } else {
            min = array[1];
        }
        for (int k = 2; k < array.length - 1; k++)
            if (min < array[k]) {
                min = min;
            } else {
                min = array[k];
            }
        return min;
    }

    // տպել մասիվի զույգ էլեմենտները և նրանց քանակը
    int countElem(int[] array) {
        int countElem = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                countElem++;
                System.out.print(array[j] + " ");

            }

        }
        return countElem;

    }

    // տպել մասիվի կենտ էլեմենտները և նրանց քանակը
    int countElement(int[] array) {


        int countElement = 0;
        for (int j = 0;
             j < array.length; j++) {
            if (array[j] % 2 != 0) {
                countElement++;
                System.out.print(array[j] + " ");

            }
        }

        return countElement;
    }

    //     մասիվի էլեմենտների գումարը հավասար  է
    int result(int[] array) {
        for (int i = 0; i < array.length; i++) {


        }
        int result = 0;
        int i;
        for (i = 0; i < array.length; i++)

            result = result + array[i];

        return result;
    }

    //    միջին թվաբանականը հավասար է
    int average(int[] array) {
        for (int i = 0; i < array.length; i++) {


        }
        int result = 0;
        int i;
        for (i = 0; i < array.length; i++)

            result = result + array[i];

        int average = result / array.length;
        return average;
    }

    //   սորտավորում մեծից փոքր
    void sortArray(int[] array) {
        int sortArray;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }

        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    // սորտավորում փոքրից մեծ
    void sortArray1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
    }


}
























