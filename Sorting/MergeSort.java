package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

        mergeSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return;
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0;
        int j = 0;

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = arr[i];
            } else {
                rightArray[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;

        }
    }
}
