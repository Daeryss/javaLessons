package algorithms;
/**
Like Binary Search, Jump Search is a searching
algorithm for sorted arrays. The basic idea is
to check fewer elements (than linear search) by
jumping ahead by fixed steps or skipping some
elements in place of searching all elements.

For example, suppose we have an array arr[] of
size n and block (to be jumped) size m. Then we
search at the indexes arr[0], arr[m], arr[2m]…..arr[km]
and so on. Once we find the interval
(arr[km] < x < arr[(k+1)m]), we perform a linear
search operation from the index km to find the
element x.

Let’s consider the following array:
(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610).
Length of the array is 16. Jump search
will find the value of 55 with the following
steps assuming that the block size to be
jumped is 4.
STEP 1: Jump from index 0 to index 4;
STEP 2: Jump from index 4 to index 8;
STEP 3: Jump from index 8 to index 12;
STEP 4: Since the element at index 12 is
greater than 55 we will jump back a step to
come to index 8.
STEP 5: Perform linear search from index 8 to
get the element 55.

What is the optimal block size to be skipped?
In the worst case, we have to do n/m jumps
and if the last checked value is greater
than the element to be searched for, we
perform m-1 comparisons more for linear search.
Therefore the total number of comparisons
in the worst case will be ((n/m) + m-1).
The value of the function ((n/m) + m-1)
will be minimum when m = √n. Therefore, the
best step size is m = √n.
 */

public class algorithms03_JumpSearch {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;

        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);

        // Print the index where 'x' is located
        System.out.println("\nNumber " + x + " is at index " + index);
    }

    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;

        // Finding block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;

        // Finding the block where element is
        // present (if it is present)
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n ){
                return -1;
            }
        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < x) {
            prev++;

            if(prev == Math.min(step, n)){
                return -1;
            }
        }
        if (arr[prev] == x) {
            return prev;
        }
        return -1;
    }
}
