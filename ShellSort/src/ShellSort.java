/**
 * Created by Happy on 2014/8/18.
 */
public class ShellSort {
    public static void print(int a[], int n, int i) {
        System.out.print(i + " ");
        for (int j = 0; j < n; j++) {
            System.out.print(a[j]);
        }
        System.out.println();
    }

    public static void shellInsertSort(int a[], int n, int dk) {
        for (int i = dk; i < n; i++) {
            if (a[i] < a[i - dk]) {
                int j = i - dk;
                int x = a[i];
                a[i] = a[i - dk];
                while (j >= 0 && x < a[j]) {
                    a[j + dk] = a[j];
                    j -= dk;
                }
                a[j + dk] = x;
            }
            print(a, n, i);
        }
    }

    public static void shellSort(int a[], int n) {
        int dk = n / 2;
        while (dk >= 1) {
            shellInsertSort(a, n, dk);
            dk = dk / 2;
        }
    }

    public static void main(String args[]) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6};
        shellSort(a, 8);
    }
}
