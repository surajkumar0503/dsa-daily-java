import java.util.Arrays;
public class ShallowAndDeepCopies {
    static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] x = arr; // x is shallow copy of arr
        x[2] = 50;
        System.out.println(arr[2]); // 50

        // deep copy
        int[] xDeep = Arrays.copyOf(arr, arr.length);
        xDeep[0] = 100;
        System.out.println(arr[0]);
    }
}
