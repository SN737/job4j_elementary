package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        /* Formula for man's weight: (height in cm - 100) * 1.15 */
        /* очень странный расчёт, бодтпозитивнй, - 1.15 должно быть же */
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        /* Formula for woman's weight: (height in cm - 110) * 1.15 */
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 175;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man " + height + "cm is " + man + " kg");
        System.out.println("Woman " + height + " cm is " + woman + " kg");
    }
}