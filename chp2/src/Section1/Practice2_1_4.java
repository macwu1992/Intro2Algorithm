package Section1;

/**
 * Created by Tong on 2017/10/13.
 */
public class Practice2_1_4 {
    public static int[] binaryAddition(int[] a, int[] b){
        int resultLength = a.length > b.length ? (a.length+1):(b.length+1);
        int[] result = new int[resultLength];

        int add = 0;

        for (int i = a.length-1,j = b.length-1; i>=0 && j>=0; i--, j--){
            result[i+1] = (a[i] + b[j] + add)%2;

            add = (a[i] + b[j] + add)/2;
        }

        result[0] = add;

        return result;
    }
}
