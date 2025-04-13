package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            /* Печатаем пробелы */
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            /* Печатаем числа в прямом порядке */
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            /* Печатаем числа в обратном порядке */
            for (int r = i - 1; r > 0; r--) {
                System.out.print(r);
            }
            /* Переход на новую строку */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 4:");
        draw(4);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
