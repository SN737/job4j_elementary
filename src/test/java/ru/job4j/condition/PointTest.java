package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPointsMinus4Minus4And6And6Then14Dot14() {
        double expected = 14.14;
        Point pointA = new Point(-4, -4);
        Point pointB = new Point(6, 6);
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints00And20Then2() {
        double expected = 2.82;
        Point pointA = new Point(0, 0);
        Point pointB = new Point(2, 2);
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        double expected = 2.83;
        Point pointA = new Point(-1, -1);
        Point pointB = new Point(1, 1);
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        double expected = 5.66;
        Point pointA = new Point(-2, -2);
        Point pointB = new Point(2, 2);
        double output = pointA.distance(pointB);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}

