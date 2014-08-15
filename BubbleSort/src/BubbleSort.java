/**
 * Created by Happy on 2014/8/14.
 */
public class BubbleSort {
    /**
     * To print the array
     *
     * @param a the array which is be printed
     * @param n the element's number in tha array a
     * @param i the index
     */
    public static void print(int a[], int n, int i) {
        System.out.print(i + ":");
        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    /**
     * Sorting array in a bubble sort way
     *
     * @param a the array which is be sorted
     * @param n the element's number in tha array a
     */
    public static void bubbleSort(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //if a[j] < a[j+1], then swap them
                if (a[j] > a[j + 1]) { //The result is the biggest one becomes the last one
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
            print(a, n, i);
        }
    }

    /**
     * Another bubble sort method with improvement.
     * @param a
     * @param n
     */
    public static void improveBubbleSort(int a[], int n) {
        boolean isChange = true;
        for (int i = 0; i < n && isChange; i++) {
            isChange = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    isChange = true;
                }
            }
            print(a, n, i);
        }
    }

    /**
     * the main function
     *
     * @param args
     */
    public static void main(String args[]) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6};
        bubbleSort(a, 8);
    }
}
