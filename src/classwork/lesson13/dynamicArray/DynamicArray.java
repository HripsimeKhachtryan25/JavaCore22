package classwork.lesson13.dynamicArray;

public class DynamicArray {
    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length) {
            int[] temp = new int[array.length + 10];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[size] = value;
        size++;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");


        }


    }

    public boolean isEmpty() {
        return size == 0;
    }

    int getByIndex(int a) {
        if (a < array.length) {
            return array[a];
        } else {
            return 0;
        }
    }

    int getFirstIndexByValue(int value) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                temp++;
                return i;
            } else if (temp > 0) {
                return i;
            }
        }
        return value;
    }

    void set(int index, int value) {
        index = value;
        array[index] = value;

    }

    void add(int index, int value) {
        int temp = array[value];
        index = value;
        array[index] = value;

        System.out.println(temp);
        value = value + 1;
        for (int i = 0; i < value; i++) {
            System.out.print(array[i] + " ");
        }


        System.out.print(temp + " " + value + " ");


        for (int i = array[value]; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }


    void delete(int index) {
        System.out.print(array[index]);
        array[index] = 0;
        System.out.println("-" + array[index] + " ");
    }

}
