/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort;

/**
 *
 * @author Cifer
 */
public class MergeSort {

    public static void main(String[] args) {
        int originalArr[] = {29, 10, 14, 37, 14, 5, 2, 1, 6, 42, 25};
        System.out.println("Unsorted array:");
        for (int num : originalArr) {
            System.out.print(num + " ");
        }
        System.out.println("");
        mergeSort(originalArr);
        System.out.println("Sorted array:");
        for (int num : originalArr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return; // Base case: Array of length 1 is already sorted
        }

        // Divide the array into two halves
        int mid = array.length / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[array.length - mid];

        // Populate the left and right halves
        for (int i = 0; i < mid; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            rightHalf[i - mid] = array[i];
        }

        // Recursively sort each half
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge the sorted halves
        merge(leftHalf, rightHalf, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;

        // Compare elements from left and right halves and merge them into the original array
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                array[mergedIndex++] = left[leftIndex++];
            } else {
                array[mergedIndex++] = right[rightIndex++];
            }
        }

       
    }
}
