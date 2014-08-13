/**
 * Created by Happy on 2014/8/13.
 */
public class StraightInsetSort {
    public static void print(int a[], int n, int i) {
        System.out.print(":");
        for (int j = 0; j < 8; j++) {
            System.out.print(a[j]);
        }
        System.out.println();
    }

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

    public static void main(String args[]) {
        int a[] = {3, 1, 5, 7, 2, 4, 9, 6};
        InsertSort(a, 8);
        print(a, 8, 8);
    }
}
