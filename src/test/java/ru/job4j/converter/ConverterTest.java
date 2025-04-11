package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        double input = 140;
        double expected = 2;
        double output = Converter.rubleToEuro(input);
        double value = 0.000f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void Convert180RblThen3Dollar(){
        double input = 180;
        double expected = 3;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}