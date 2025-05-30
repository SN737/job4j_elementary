package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
              if ((row + cell) % 2 == 0) {
                  /* "X" и пробелы дают кривую шахматную доску, а тут красиво =) */
                  System.out.print("\u2B1C");
              } else {
                  System.out.print("\u2B1B");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(8, 8);
    }
}
