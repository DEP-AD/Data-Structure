import ds.DynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.print();
        dynamicArray.add(100);
        dynamicArray.add(200);
        dynamicArray.print();
        dynamicArray.add(2,15);
        dynamicArray.print();
        dynamicArray.add(2,25);
        dynamicArray.print();
        dynamicArray.add(4,35);
        dynamicArray.print();
        dynamicArray.remove(2);
        dynamicArray.print();
        dynamicArray.remove(-2);
        dynamicArray.print();

    }
}
