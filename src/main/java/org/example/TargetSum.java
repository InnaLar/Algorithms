package org.example;

//int[] intArray = {1,3,8,13}; int target = 26;
@SuppressWarnings("uncommentedmain")
public class TargetSum {
    public static boolean existsTargetSum(final int[] intArray, final int targetSum) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] + intArray[j] == targetSum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(final String[] args) {
        final int[] intArray = {1, 3, 8, 13};
        final int targetSum = 16;
        if (existsTargetSum(intArray, targetSum)) {
            System.out.println("Сумма достижима");
        } else {
            System.out.println("Сумма недостижима");
        }
    }
}
