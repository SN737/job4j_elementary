package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static ru.job4j.loop.Counter.sum;
import static ru.job4j.loop.Counter.sumByEven;

class CounterTest {

    @Test
    void whenStart0Finish10Then55() {
        int start = 0;
        int finish = 10;
        double sum = sum(start, finish);
        double expected = 55;
        assertThat(sum).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenStart13Finish10Then46() {
        int start = 13;
        int finish = 10;
        double sum = sum(start, finish);
        double expected = 0;
        assertThat(sum).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenStart10Finish10Then10() {
        int start = 10;
        int finish = 10;
        double sum = sum(start, finish);
        double expected = 10;
        assertThat(sum).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    @DisplayName("sumByEvenTest")
    void whenStart0Finish10Then30() {
        int start = 0;
        int finish = 10;
        double sum = sumByEven(start, finish);
        double expected = 30;
        assertThat(sum).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    @DisplayName("sumByEvenTest")
    void whenStartMinus4Finish2ThenMinus4() {
        int start = -4;
        int finish = 2;
        double sum = sumByEven(start, finish);
        double expected = -4;
        assertThat(sum).isEqualTo(expected, withPrecision(0.01));
    }
}