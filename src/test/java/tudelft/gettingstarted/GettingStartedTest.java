package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int expected = 25;
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(expected,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int expected = 5;
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int expected = -15;
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(expected,result);
    }
}
