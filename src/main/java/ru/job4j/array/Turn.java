package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            int last = array.length - (i + 1);
            array[i] = array[last];
            array[last] = temp;
        }
        return array;
    }
}