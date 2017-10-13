package Theme.Sort;

/**
 * Created by Tong on 2017/10/13.
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] a){
        for (int i = 0; i<a.length; i++){
            for (int j = a.length-1; j>i; j--){
                if (a[j] < a[j-1]){
                    swap(a, j, j-1);
                }
            }
        }

        return a;
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = 0;

        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
