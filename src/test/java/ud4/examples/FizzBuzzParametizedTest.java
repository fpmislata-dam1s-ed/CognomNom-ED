package ud4.examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzParametizedTest {
    @Test
    @DisplayName("FizzBuzz class should exist")
    void fizzBuzzClassShouldExist(){
        FizzBuzz fizzBuzz = new FizzBuzz();
    }

    /*
    @Test
    @DisplayName("FizzBuzz::transform() method should exist")
    void fizzBuzzTransformMethodShouldExist(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.transform();
    }
    */

    @Test
    @DisplayName("FizzBuzz::transfrom() should have an int parameter")
    void fizzBuzzTransformShouldHaveIntParameter(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.transform(1);
    }

    @ParameterizedTest(name = "FizzBuzz::transform({0}) should return {1}")
    @DisplayName("FizzBuzz::transform()")
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "5, Buzz",
            "6, Fizz",
            "10, Buzz",
            "15, FizzBuzz",
            "30, FizzBuzz"
    })
    void fizzBuzzTransform(int input, String expected){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.transform(input);
        assertEquals(expected, result);
    }
}
