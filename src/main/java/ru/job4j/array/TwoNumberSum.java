package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (target - array[i] == array[j]) {
                return new int[]{i, j};
            }
            j--;
            if (j == i + 1) {
                i++;
                j = array.length - i;
            }
        }
        return new int[0];
    }
}