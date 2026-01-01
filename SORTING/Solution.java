// SORTINGS - Bubble, Selection, and Insertion
public class Solution {
    // Q1. Check if array is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // order breaks
            }
        }
        return true; // never broke, so sorted
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7};
        System.out.println(isSorted(arr));
    }
}
