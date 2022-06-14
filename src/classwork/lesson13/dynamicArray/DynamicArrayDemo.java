package classwork.lesson13.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();
        dynArray.add(7);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(3);
        dynArray.add(7);
        dynArray.add(7);
        dynArray.add(7);
        dynArray.add(7);
        dynArray.add(7);
        dynArray.add(25);
        dynArray.print();
        System.out.println();
        System.out.println(dynArray.isEmpty());
        System.out.println(dynArray.getByIndex(7));
        System.out.println(dynArray.getFirstIndexByValue(7));
        dynArray.set(3,4);
        dynArray.print();
        System.out.println();
        dynArray.add(1,6);
        System.out.println();
        dynArray.delete(4);
        dynArray.print();

    }
}
