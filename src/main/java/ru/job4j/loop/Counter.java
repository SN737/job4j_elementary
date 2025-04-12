package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        if (start <= finish) {
            for (; start <= finish; start++) {
                sum = sum + start;
            }
        } else {
            for (; start >= finish; start--) {
                sum = sum + start;
            }
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        if (start <= finish) {
            for (; start <= finish; start++) {
                if (start % 2 == 0) {
                    sum = sum + start;
                }
            }
        } else {
            for (; start >= finish; start--) {
            if (start % 2 == 0) {
                sum = sum + start;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(13, 10));
        System.out.println(sum(10, 10));

        System.out.println("evenSum " + sumByEven(0, 10));
        System.out.println("evenSum " + sumByEven(3, 8));
        System.out.println("evenSum " + sumByEven(1, 2));
        System.out.println("evenSum " + sumByEven(4, 2));
        System.out.println("evenSum " + sumByEven(-4, 2));
    }
}