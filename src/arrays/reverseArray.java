package src.arrays;

import java.util.Arrays;

public class reverseArray {
    
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Array: " + Arrays.toString(arr));

        arr = reverseArray(arr);
        
        System.out.println("Reversed Array: " + Arrays.toString(arr));

    }

    public static int[] reverseArray(int[] arr)
    {
        int maxIndex = arr.length - 1;
        int halfLen = arr.length / 2;

        for(int i = 0; i < halfLen; i++)
        {
            int temp = arr[i];
            arr[i] = arr[maxIndex-i];
            arr[maxIndex-i] = temp;
        }

        return arr;
    }
}
