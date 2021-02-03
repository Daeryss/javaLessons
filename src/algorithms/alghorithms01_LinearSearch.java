package algorithms;

import java.util.Scanner;

/*
Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
If x matches with an element, return the index.
If x doesn’t match with any of elements, return -1.
 */

public class alghorithms01_LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {11, 22 , 13, 65, 5, 0, -34, 42};
        System.out.println("Enter number:\n");
        int x = s.nextInt();

        int result = search(arr, x);

        if(result == -1) {
            System.out.println("Element is not present in array");
        }
        else {
            System.out.println("Element is present at index " + result);
        }
    }

    public static int search (int[] arr, int x) {
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
