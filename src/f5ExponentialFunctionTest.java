import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * A class with test cases to check some functional and non-functional
 * requirements
 * 
 * @author Dhananjay Narayan
 *
 */
public class f5ExponentialFunctionTest {

	f5ExponentialFunction f5 = new f5ExponentialFunction();

	/**
	 * A test case to verify the Functional Requirement ID FR1
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRequirementFR1() throws Exception {
		double solutionWithRecursion = f5ExponentialFunction.recursiveExponentiation(3, 1, 5);
		assertTrue(solutionWithRecursion == 0.0);
	}

	/**
	 * A test case to verify the Functional Requirement ID FR2
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRequirementFR2() throws Exception {
		double solutionWithRecursion = f5ExponentialFunction.recursiveExponentiation(0, 2, 5);
		assertTrue(solutionWithRecursion == 0.0);
	}

	/**
	 * A test case to verify the Functional Requirement ID FR3
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRequirementFR4() throws Exception {
		double solutionWithRecursion = f5ExponentialFunction.recursiveExponentiation(0, -2, 5);
		assertTrue(solutionWithRecursion == 0.0);
	}

	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	/**
	 * A test case to verify the Non - Functional Requirement ID NFR2
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRequirementNFR2() throws Exception {
		exceptionRule.expect(StackOverflowError.class); // This test passes if such exception
		f5ExponentialFunction.recursiveExponentiation(1, 2, 50000);
	}

	/**
	 * A test case to verify the non-Functional Requirement ID NFR5
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRequirementNFR5() throws Exception {
		double solutionWithRecursion = f5ExponentialFunction.recursiveExponentiation(1, 2, 3);
		assertTrue(solutionWithRecursion == 8.0);
	}
}
