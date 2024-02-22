/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsort;

/**
 *
 * @author Cifer
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int originalArr[] = {29, 10, 14, 37, 14, 5, 2, 1, 6, 42, 25};
        System.out.println("Unsorted Array");
        for (int i : originalArr) {
            System.out.print(i + " ");
        }
        int size = originalArr.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (originalArr[i] < originalArr[min_idx]) {
                    min_idx = i;
                }
            }

            // put min at the correct position
            int temp = originalArr[step];
            originalArr[step] = originalArr[min_idx];
            originalArr[min_idx] = temp;
        }
        System.out.println("");
        System.out.println("Sorted Array");
        for (int i : originalArr) {
            System.out.print(i + " ");
        }
    }

}
