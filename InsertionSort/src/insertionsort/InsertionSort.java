/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

import java.util.Scanner;

/**
 *
 * @author Ulquiorra Cifer
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {29, 10, 14, 37, 14, 5, 2, 1, 6, 42, 25};
        int n;
        System.out.println("Array before sorted");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
        System.out.println("Array after sorted");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
