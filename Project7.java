package project7;

import java.util.Random;
import java.util.Arrays;

public class Project7 {

    public static int[] populateArray(int[] arr) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1001);
        }
        return arr;

    }

    public static void sortAlgorithms(int[] arr) {
        long start, time;
        SortingAlgorithms.mergeCompare = 0;
        SortingAlgorithms.quickChange = 0;
        SortingAlgorithms.quickCompare = 0;
        SortingAlgorithms.partitionCount = 0;

        start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSort(arr.clone());
        time = System.currentTimeMillis() - start;
        System.out.printf("|%-9s", time + " ms");

        start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSortCS(arr.clone());
        time = System.currentTimeMillis() - start;
        System.out.printf("|%-9s", time + " ms");

        start = System.currentTimeMillis();
        SortingAlgorithms.selectionSort(arr.clone());
        time = System.currentTimeMillis() - start;
        System.out.printf("|%-9s", time + " ms");

        start = System.currentTimeMillis();
        SortingAlgorithms.insertionSort(arr.clone());
        time = System.currentTimeMillis() - start;
        System.out.printf("|%-9s", time + " ms");

        start = System.currentTimeMillis();
        SortingAlgorithms.mergeSort(arr.clone());
        time = System.currentTimeMillis() - start;

        System.out.printf("|%-13s|%-14d|%-9s", "Not Available", SortingAlgorithms.mergeCompare, time + " ms");

        start = System.currentTimeMillis();
        SortingAlgorithms.quickSort(arr.clone(), 0, arr.length - 1);
        time = System.currentTimeMillis() - start;

        System.out.printf("|%-13d|%-14d|%-10d|%-9s", SortingAlgorithms.quickChange, SortingAlgorithms.quickCompare, SortingAlgorithms.partitionCount, time + " ms");

        start = System.currentTimeMillis();
        SortingAlgorithms.javaSort(arr.clone());
        time = System.currentTimeMillis() - start;
        System.out.printf("|%-13s|%-14s|%-9s", "Not Available", "Not Available", time + " ms");

        start = System.currentTimeMillis();
        SortingAlgorithms.yourSort(arr.clone());
        time = System.currentTimeMillis() - start;
        System.out.printf("|%-9s\n", time + " ms");

        System.out.println("===============|=============|==============|=========|=============|==============|=========|=============|==============|=========|=============|==============|=========|=============|==============|=========|=============|==============|==========|=========|=============|==============|=========|=============|==============|========");

    }

    public static void main(String[] args) {

        int[] one_K = new int[1000];
        populateArray(one_K);

        int[] twenty_K = new int[20000];
        populateArray(twenty_K);

        int[] hundred_K = new int[100000];
        populateArray(hundred_K);

        int[] twohundred_K = new int[200000];
        populateArray(twohundred_K);

        System.out.printf("%-15s|%-38s|%-38s|%-38s|%-38s|%-38s|%-49s|%-38s|%-38s\n", "Algorithm", "Bubble Sort", "Bubble SortCS", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort", "Java Sort", "Cocktail Sort");
        System.out.println("===============|=============|==============|=========|=============|==============|=========|=============|==============|=========|=============|==============|=========|=============|==============|=========|=============|==============|==========|=========|=============|==============|=========|=============|==============|========");

        System.out.printf("%-15s|%-13s|%-14s|%-9s|%-13s|%-14s|%-9s|%-13s|%-14s|%-9s|%-13s|%-14s|%-9s|%-13s|%-14s|%-9s|%-13s|%-14s|%-10s|%-9s|%-13s|%-14s|%-9s|%-13s|%-14s|%-9s\n", "Array Size", "Swap Count", "Compare Count", "Time(ms)", "Swap Count", "Compare Count", "Time(ms)", "Swap Count", "Compare Count", "Time(ms)", "Swap Count", "Compare Count", "Time(ms)", "Swap Count", "Compare Count", "Time(ms)", "Swap Count", "Compare Count", "Partitions", "Time(ms)", "Swap Count", "Compare Count", "Time(ms)", "Swap Count", "Compare Count", "Time(ms)");
        System.out.println("===============|=============|==============|=========|=============|==============|=========|=============|==============|=========|=============|==============|=========|=============|==============|=========|=============|==============|==========|=========|=============|==============|=========|=============|==============|========");

        System.out.printf("%-15s", "1000");

        sortAlgorithms(one_K.clone());

        System.out.printf("%-15s", "20000");

        sortAlgorithms(twenty_K.clone());

        System.out.printf("%-15s", "100000");

        sortAlgorithms(hundred_K.clone());

        System.out.printf("%-15s", "200000");

        sortAlgorithms(twohundred_K.clone());

    }

}
