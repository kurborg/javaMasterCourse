package src.arrays;

import java.util.Scanner;

public class sortedArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = getIntegers(5);
        sortIntegers(nums);
        printArray(nums);
    }

    public static int[] getIntegers(int n) {
        System.out.println("Please enter " + n + " numbers:\r");
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        return nums;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element " + i + ": " + nums[i]);
        }
    }

    public static int[] sortIntegers(int[] nums)
    {
        boolean flag = true;
        while(flag)
        {
            flag = false;

            for(int i = 0; i < nums.length - 1; i++){

                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return nums;
    }
}
