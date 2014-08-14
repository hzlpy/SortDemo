/**
 * Created by Happy on 2014/8/13.
 */
public class StraightInsetSort {
    /**
     * To print the array
     *
     * @param a the array which is be printed
     * @param n the element's number in the array
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
     * Sorting array in a straight sort way
     *
     * @param a the array which is be sorted
     * @param n the element's number in the array
     */
    public static void InsertSort(int a[], int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                int j = i - 1;
                int x = a[i];
                a[i] = a[i - 1];
                while (j >= 0 && x < a[j]) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = x;
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
        InsertSort(a, 8);
    }
}
