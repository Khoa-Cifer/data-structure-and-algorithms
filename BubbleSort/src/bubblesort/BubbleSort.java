/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author Cifer
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int originalArr[] = {29, 10, 14, 37, 14, 5, 2, 1, 6, 42, 25};
        System.out.println("Unsorted Array");
        for (int i : originalArr) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < originalArr.length - 1; i++) {
            for (int j = 0; j < originalArr.length - i - 1; j++) {
                if (originalArr[j] > originalArr[j + 1]) {
                    int temp = originalArr[j];
                    originalArr[j] = originalArr[j + 1];
                    originalArr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for (int i : originalArr) {
            System.out.print(i + " ");
        }
    }

}
