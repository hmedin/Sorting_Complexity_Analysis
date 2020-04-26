package project7;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void BubbleSort(int[] array) {
        long compare = 0;
        long change = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                compare++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    change++;
                }
            }
        }
        System.out.printf("|%-13d|%-14d", change, compare);
    }

    public static void BubbleSortCS(int[] array) {
        long compare = 0;
        long change = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                compare++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    change++;
                    swap = true;
                }

            }
            if (!swap) {
                break;
            }

        }
        System.out.printf("|%-13d|%-14d", change, compare);

    }

    public static void selectionSort(int[] arr) {
        long change = 0;
        long compare = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                compare++;
                if (arr[j] < arr[index]) {
                    index = j;
                    change++;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;

        }
        System.out.printf("|%-13d|%-14d", change, compare);

    }

    public static void insertionSort(int arr[]) {

        long change = 0;
        long compare = 0;
        int i, key, j;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            compare++;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                change++;
                compare++;
            }

            arr[j + 1] = key;
        }
        System.out.printf("|%-13d|%-14d", change, compare);

    }

    static long mergeCompare = 0;

    public static void mergeSort(int[] array) {

        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l);
        mergeSort(r);
        merge(array, l, r, mid, array.length - mid);

    }

    private static void merge(int[] array, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            mergeCompare++;
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;

            } else {
                array[k] = r[j];
                j++;

            }
            k++;
        }

        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }

    }

    static long quickCompare = 0;
    static long quickChange = 0;
    static int partitionCount = 0;

    public static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            partitionCount++;
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {

            quickCompare++;
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                quickChange++;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        quickChange++;

        return i + 1;
    }

    public static void javaSort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void yourSort(int a[]) {
        boolean swapped = true;
        int start = 0;
        int end = a.length;
        long compare = 0;
        long change = 0;

        while (swapped == true) {

            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                compare++;
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                    change++;
                }
            }

            if (swapped == false) {
                break;
            }

            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                compare++;
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                    change++;
                }
            }

            start = start + 1;
        }
        System.out.printf("|%-13d|%-14d", change, compare);
    }

}
