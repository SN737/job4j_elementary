package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (i < array.length && j < array.length) {
            if (target - array[i] == array[j]) {
                return new int[]{i, j};
            }
            j++;
            if (j == array.length) {
                i++;
                j = i + 1;
            }
        }
        return new int[0];
    }
}