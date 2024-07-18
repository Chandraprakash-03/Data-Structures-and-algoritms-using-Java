package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
