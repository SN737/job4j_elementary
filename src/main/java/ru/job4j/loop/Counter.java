package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /*sum by even*/
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
             if (i % 2 == 0) {
                    sum = sum + i;
             }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(-2, 1));
        System.out.println(sum(13, 10));
        System.out.println(sum(10, 10));

        System.out.println("evenSum " + sumByEven(0, 10));
        System.out.println("evenSum " + sumByEven(3, 8));
        System.out.println("evenSum " + sumByEven(1, 2));
        System.out.println("evenSum " + sumByEven(4, 2));
        System.out.println("evenSum " + sumByEven(-4, 2));
    }
}