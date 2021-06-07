package fibonacci;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * fibTest
 *
 * @CreatedBy MKgn
 */
@Test
public class FibonacciTest {

    // should_return_0_when_0_passed()
    // should_return_1_when_1_passed()
    // should_return_1_when_2_passed()
    // should_return_2_when_3_passed()
    // should_return_3_when_4_passed()
//    @Test(dataProvider = "fibonacciSequence")
//    public void fibonacciSequenceHappyPath() {
//    }

//
//    @DataProvider
//    public static Object[][] fibonacciSequence() {
//        return new Object[][]{
//                {0, 0},
//                {1, 1},
//                {2, 1},
//                {3, 2}
//        };
//    }

    public void should_return_1_when_1_passed() {

        //given
        Fibonacci fibonacci = new Fibonacci();
        Integer input = 1;

        //when
        Integer result = fibonacci.fib(input);
        Integer expected = 1;

        //then
        assertEquals(expected, result);

    }


    public void should_return_3_when_4_passed() {

        //given
        Fibonacci fibonacci = new Fibonacci();
        Integer input = 4;

        //when
        Integer result = fibonacci.fib(input);
        Integer expected = 3;

        //then
        assertEquals(expected, result);
    }
}
