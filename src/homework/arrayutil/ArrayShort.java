package homework.arrayutil;

public class ArrayShort {
    public static void main(String[] args) {
        int[] numbers = {55, 42, 4, -2, 7, 12, 5, 65};
        int num;
        for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] <numbers[i + 1]) {
                    num = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = num;
                    i = -1;
                }
            }
        for (int x : numbers) {
            System.out.print(x+ " ");
        }





        }

    }
