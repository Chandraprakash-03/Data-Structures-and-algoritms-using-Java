package Searching;

public class interpolationSearch {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 5096 };
        int index = interpolation(arr, 1024);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }

    private static int interpolation(int[] arr, int val) {

        int high = arr.length - 1;
        int low = 0;

        while (val >= arr[low] && val <= arr[high] && low <= high) {

            int probe = low + (high - low) * (val - arr[low]) / (arr[high] - arr[low]);

            System.out.println("probe:" + probe);

            if (arr[probe] == val) {
                return probe;
            } else if (arr[probe] < val) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }

        }

        return -1;
    }
}
