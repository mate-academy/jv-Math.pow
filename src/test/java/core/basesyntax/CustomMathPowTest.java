package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class CustomMathPowTest {

    @Test
    public void pow() {
        for (int number = 0; number < 8; number++) {
            for (int exponential = 8; exponential > 0; exponential--) {
                CustomMathPow customMathPow = new CustomMathPow();
                int actualResult = customMathPow.pow(number, exponential);
                int expectedResult = (int) Math.pow(number, exponential);

                Assert.assertEquals(
                        "Test failed with number = " + number + " , exponential = " + exponential,
                        actualResult,
                        expectedResult);
            }
        }
    }
}
