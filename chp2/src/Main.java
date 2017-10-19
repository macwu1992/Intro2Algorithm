import Theme.Sort.HeapSort;
import Theme.Sort.MergeSort;

/**
 * Created by Tong on 2017/10/13.
 */
public class Main {
    public static void main(String[] args){
        int a[] = {5,2,4,6,1};

//        int b[] = {1,1,1,1,1};
//        int c[] = {0,0,0,0,1};

        //InsertSort.insertSort(a);
        //int[] result = Practice2_1_4.binaryAddition(b, c);
//        int[] result = MergeSort.mergeSort(a);

        int[] result = HeapSort.heapSort(a);

        for (int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
