package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        roman = new RomanNumeral();
    }

    @Test // a test must be annotated with this annotation
    public void singleNumber() {
        // Step 1. instantiate the test class (Unit under test).
//        RomanNumeral roman = new RomanNumeral();
        // Step 2. invoke the message we want to test.
        int result = roman.convert("I"); // "I" is the test input.
        // Step 3. use assertions to check for equality.
        Assertions.assertEquals(1, result);
    }

    // testing second test scenario, where there are multiple digits in roman numeral.
    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        // assertEquals parameters take an order of "expected" followed by "actual".
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void numberWithWrongRepresentation() {
        int result = roman.convert("VVV");
        Assertions.assertEquals(15, result);
    }

}
