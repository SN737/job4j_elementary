package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] fNumbers = new int[5];
        for (int i = 0; i < fNumbers.length; i++) {
            fNumbers[i] = i * 2 + 3;
        }
        for (int fNumber : fNumbers) {
            System.out.println(fNumber);
        }
    }
}
