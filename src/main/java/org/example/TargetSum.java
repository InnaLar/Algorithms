package org.example;

//int[] intArray = {1,3,8,13}; int target = 26;
//{1,3,8,13,15,23,54,100}  target = 31;
@SuppressWarnings("uncommentedmain")
public class TargetSum {
    public static boolean existsTargetSum(final int[] intArray, final int targetSum) {
        int leftPointer = 0;
        final int lengthArray = intArray.length;
        int rightPointer = lengthArray - 1;
        while (leftPointer != rightPointer) {
            if (intArray[leftPointer] + intArray[rightPointer] > targetSum) {
                rightPointer--;
            } else if (intArray[leftPointer] + intArray[rightPointer] < targetSum) {
                leftPointer++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(final String[] args) {
        //final int[] intArray = {1, 3, 6, 7, 8, 13};
        final int[] intArray = {1, 4, 7, 13, 17, 26, 48, 70};
        final int targetSum = 29;
        if (existsTargetSum(intArray, targetSum)) {
            System.out.println("Сумма достижима");
        } else {
            System.out.println("Сумма недостижима");
        }
    }
}
