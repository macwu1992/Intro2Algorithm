package Theme.Sort;
import java.util.Arrays;

/**
 * Created by Tong on 2017/10/17.
 */
public class MergeSort {
    public static int[] mergeSort(int[] a){
        int[] result;

        if (a.length == 1){
            result = a;
        }else {
            int[] firstPart = mergeSort(Arrays.copyOfRange(a, 0, a.length/2));
            int[] secondPart = mergeSort(Arrays.copyOfRange(a, (a.length/2), a.length));
            result = merge(firstPart, secondPart);
        }

        return result;
    }

    private static int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if (a[i] < b[j]){
                result[k] = a[i];
                k++;
                i++;
            }else {
                result[k] = b[j];
                k++;
                j++;
            }
        }

        if (i < a.length){
            for (; i<a.length && k < result.length; i++, k++){
                result[k] = a[i];
            }
        }else if (j < b.length){
            for (; j<b.length && k < result.length; j++, k++){
                result[k] = b[j];
            }
        }

        return result;
    }
}
