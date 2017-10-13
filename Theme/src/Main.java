import Theme.Sort.BubbleSort;

/**
 * Created by Tong on 2017/10/13.
 */
public class Main {
    public static void main(String[] args){
        int a[] = {5,2,4,6,1};

        int[] result = BubbleSort.bubbleSort(a);

        for (int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
