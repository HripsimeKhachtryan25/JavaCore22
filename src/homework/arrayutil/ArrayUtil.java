package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        double result = 0;
        int i;
        for (i = 0; i < array.length; i++)

            result = result + array[i];
        System.out.print("   միջին թվաբանականը հավասար է" + result / array.length);
        System.out.print("   մասիվի էլեմենտների գումարը հավասար  է " + result);


//  max-ը մասիվի ամենամեծ թիվը
        int max;
        if (array[0] > array[1]) {

            max = array[0];
        } else {
            max = array[1];

        }
        for (int j = 2; j < array.length - 1; j++)

            if (max > array[j]) {
                max = max;
            } else {
                max = array[j];
            }

        System.out.print("    մասիվի ամենամեծ թիվը" + max);
//        min-ը մասիվի ամենափոքր թիվն է
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

        System.out.println("   մասիվի ամենափոքր թիվը " + min);

// տպել մասիվի զույգ էլեմենտները և նրանց քանակը
        int countElem = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                countElem++;
                System.out.println(array[j]);

            }

        }
        System.out.println("մասիվի զույգ էլեմենտների քանակը հավասար է " + countElem);
// տպել մասիվի կենտ էլեմենտները և նրանց քանակը
        int countElement = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                countElement++;
                System.out.println(array[j]);
            }
        }
        System.out.println("մասիվի կենտ էլեմենտների քանակը հավասար է" + countElement);
    }
}
