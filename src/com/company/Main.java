package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {2, 8, 5, 3, 9, 4, 1};
        int len = 7;
        bubSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int len) {
        for (int i = 0; i < len -1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int swap = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }


    //this will check if any swaps occured during a pass. If none occurs the program can exit faster without doing extra loops.
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        boolean swapped = false;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int swap = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = swap;
                    swapped = true;
                }
            }
            if (swapped = false) {
                break;
            }
        }
    }

    public static void bubSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }

        }
    }
}
