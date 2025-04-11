package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfDivisionAndDiff(double first, double second) {
        return diff(first, second)
                + division(first, second);
    }

    public static double sumOfAll(double first, double second) {
        return diff(first, second)  + multiply(first, second)
                + division(first, second) + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOfDivisionAndDiff(10, 20));
        System.out.println("Результат расчета равен: " + sumOfAll(10, 20));
    }
}