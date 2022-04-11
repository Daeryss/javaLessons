package algorithms;

/**
The selection sort algorithm sorts an array by
repeatedly finding the minimum element (considering
ascending order) from unsorted part and putting it
at the beginning. The algorithm maintains two
subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum
element (considering ascending order) from the
unsorted subarray is picked and moved to the sorted subarray.

Time Complexity: O(n2) as there are two nested loops.

Auxiliary Space: O(1)
The good thing about selection sort is it never
makes more than O(n) swaps and can be useful when
memory write is a costly operation.
*/

public class algorithms04_SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        System.out.println("Unsorted array is: ");
        printArray(arr);
        arr = selectionSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length; i++){
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
