package Searching;

public class Linearsearch {
    public static void main(String[] args) {
        int[] array = { 0, 6, 9, 5, 6, 7, 8, 3, 2 };

        int index = LinearSearch(array, 7);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int LinearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
