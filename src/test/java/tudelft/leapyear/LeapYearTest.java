package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

	private LeapYear ly;
	private int candidateYear;

	@BeforeEach
	public void setup() {
		ly = new LeapYear();
	}

	@Test
	public void leapYearsThatAreNonCenturialYears() {
		// Test preparation
		candidateYear = 2016;

		// Test actual execution
		boolean actual = ly.isLeapYear(candidateYear);

		// Verification
		Assertions.assertTrue(actual);
	}

	@Test
	public void leapCenturialYears() {
		// Test preparation
		candidateYear = 2000;

		// Test actual execution
		boolean actual = ly.isLeapYear(candidateYear);

		// Verification
		Assertions.assertTrue(actual);
	}

	private void runTest_positive_cases(int candidateYear) {
		// Test actual execution
		boolean actual = ly.isLeapYear(candidateYear);

		// Verification
		Assertions.assertTrue(actual);
	}

	@Test
	public void nonLeapCenturialYears() {
		// Test preparation
		candidateYear = 1500;

		runTest_negative_cases(candidateYear);
	}

	@Test
	public void nonLeapYears() {
		// Test preparation
		candidateYear = 2017;

		runTest_negative_cases(candidateYear);
	}

	private void runTest_negative_cases(int candidateYear) {
		// Test actual execution
		boolean actual = ly.isLeapYear(candidateYear);

		// Verification
		Assertions.assertFalse(actual);
	}

}
