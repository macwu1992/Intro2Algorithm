/**
 * Created by Tong on 2017/10/13.
 */
public class InsertSort {
    public static void main(String[] args){
        int a[] = {5,2,4,6,1};

        insertSort(a);

        for (int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

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
