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

    // Q2. Given an array, arr[]. Sort the array using bubble sort algorithm.
    public void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        int swaps = 0;
        for(int i = 0; i < n-1; i++){ //n-1 pass
        
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                      swaps++;
                }
            }
            if(swaps == 0) break;
          }
    }

    // Q3. Given an array arr, use selection sort to sort arr[] in increasing order.
    void selectionSort(int[] arr) {
        
        int n = arr.length;
        for(int i = 0; i < n-1; i++){// n-1 pass
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j = i; j < n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIdx = j; //indexes exchange
                }
            }
            int temp= arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            
        }
        int minIdx = -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7};
        System.out.println(isSorted(arr));
    }
}
