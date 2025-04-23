package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPointsMinus4Minus4And6And6Then14Dot14() {
//        int x1 = -4, y1 = -4, x2 = 6, y2 = 6;
        double expected = 14.14;
        Point pointA = new Point(-4, -4);
        Point pointB = new Point(6, 6);
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints00And20Then2() {
//        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expected = 2.82;
        Point pointA = new Point(0, 0);
        Point pointB = new Point(2, 2);
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
//        int x1 = -1, y1 = -1, x2 = 1, y2 = 1;
        double expected = 2.83;
        Point pointA = new Point(-1, -1);
        Point pointB = new Point(1, 1);
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
//        int x1 = -2, y1 = -2, x2 = 2, y2 = 2;
        double expected = 5.66;
        Point pointA = new Point(-2, -2);
        Point pointB = new Point(2, 2);
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}

