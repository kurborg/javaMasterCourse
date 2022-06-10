package src.arrays;

import java.util.Scanner;

public class readMinNumArray {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter Count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);
        int min = findMin(array);

        System.out.println("Min number in array: " + min);
    }

    private static int[] readIntegers(int count)
    {
        int[] array = new int[count];

        System.out.println("Enter numbers:\r");
        for(int i = 0; i < count; i++)
        {
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int[] array)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < min)
                min = array[i];
        }

        return min;
    }
}
