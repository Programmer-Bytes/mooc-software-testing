package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LeapYearTest {

	@ParameterizedTest
	// Test partitions
	@CsvSource({ "2016,true", "2020,true", "1500,false", "2017,false" })
	void leapYears(int candidateYear, boolean expected) {
		// Test preparation
		LeapYear uut = new LeapYear();

		// Test actual execution
		boolean actual = uut.isLeapYear(candidateYear);

		// Verification
		Assertions.assertEquals(expected, actual);
	}

}
