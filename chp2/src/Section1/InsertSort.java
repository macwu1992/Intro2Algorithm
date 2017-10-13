package Section1;

/**
 * Created by Tong on 2017/10/13.
 */
public class InsertSort {
    public static void insertSort(int[] a){
        for (int i=1; i<a.length; i++){
            int key = a[i];
            int j = i-1;

            while(j >= 0 && key<a[j]){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = key;
        }
    }
}
