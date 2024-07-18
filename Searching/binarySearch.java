package Searching;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {

        int arr[] = new int[10000000];
        int tar = 7777777;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // int index = Arrays.binarySearch(arr, tar);
        int index = binarySearch(arr, tar);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(index);
        }

    }

    private static int binarySearch(int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {

            int middle = low + (high - low) / 2;

            int value = arr[middle];
            System.out.println(value);
            if (value < tar)
                low = middle + 1;
            else if (value > tar)
                high = middle - 1;
            else
                return middle;

        }
        return -1;
    }
}
