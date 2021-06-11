package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several subs")
    @ParameterizedTest(name = "{5} - {2} = {3}")
    @CsvSource({
            "5,     1,      4",
            "-10,   -2,     -8",
            "0,     10,     -10",
            "15,     15,    0"
    })
    public void severalSubs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sub(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several mults")
    @ParameterizedTest(name = "{5} * {2} = {10}")
    @CsvSource({
            "5,     10,      50",
            "-10,   -2,      20",
            "0,     10,      0",
            "15,     5,     75"
    })
    public void severalMulti(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mult(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several divs")
    @ParameterizedTest(name = "{6} / {2} = {3}")
    @CsvSource({
            "10,     10,      1",
            "-10,   -2,      5",
            "25,     5,      5",
            "9,     3,     3"
    })
    public void severalDiv(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }

}