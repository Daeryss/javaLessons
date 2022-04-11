package algorithms;
/**
Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].
A simple approach is to do linear search.The time complexity of above algorithm is O(n).
Another approach to perform the same task is using Binary Search.

Binary Search: Search a sorted array by repeatedly dividing
the search interval in half. Begin with an interval covering
the whole array. If the value of the search key is less than
the item in the middle of the interval, narrow the interval
to the lower half. Otherwise narrow it to the upper half.
Repeatedly check until the value is found or the interval is empty.
 */
public class algorithms02_BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }

    public static int binarySearch (int arr[], int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){
            int m = l + (r - l) / 2;
            if(arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            }
            else {
                 r = m - 1;
            }
        }
        return -1;
    }
}
