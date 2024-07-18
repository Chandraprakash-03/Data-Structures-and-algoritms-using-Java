package DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        // dynamicArray.add("B");
        // dynamicArray.add("B");
        // dynamicArray.add("B");

        // dynamicArray.insert(1, "C");
        dynamicArray.delete("C");
        System.out.println(dynamicArray.search("B"));

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.capacity);
    }

}
