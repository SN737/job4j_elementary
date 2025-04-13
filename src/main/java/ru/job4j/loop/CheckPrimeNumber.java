package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isPrime = false;
        for (int index = 2; index <= number - 1; index++) {
            int  hold = number % index;
            if (hold == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}