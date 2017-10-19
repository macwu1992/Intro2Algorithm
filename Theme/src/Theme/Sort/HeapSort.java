package Theme.Sort;

/**
 * Created by Tong on 2017/10/19.
 */
public class HeapSort {
    public static int[] heapSort(int[] a){

        a = buildHeap(a);
        int length = a.length-1;

        for (int i=(a.length)-1; i>=1; i--){
            int tmp = a[i];
            a[i] = a[0];
            a[0] = tmp;

            heapify(a, --length, 0);
        }

        return a;
    }

    private static int[] buildHeap(int[] a){
        for (int i=(a.length)/2; i>=0; i--) {
            heapify(a, a.length-1, i);
        }

        return a;
    }

    private static int[] heapify(int[] a, int length, int i){
        int largest = i;
        if (2*(i+1) <= length && a[2*(i+1)] > a[largest]) {
            largest = 2*(i+1);
        }

        if (2*(i+1)-1 <= length && a[2*(i+1)-1] > a[largest]) {
            largest = 2*(i+1)-1;
        }

        if (largest != i) {
            int tmp = a[i];
            a[i] = a[largest];
            a[largest] = tmp;

            heapify(a, length, largest);
        }

        return a;
    }
}
