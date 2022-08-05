import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class f5ExponentialFunctionTest {

	f5ExponentialFunction f5 = new f5ExponentialFunction();
	
	@Test
	public void testRequirementFR1() throws Exception {
		double solutionWithRecursion = f5ExponentialFunction.recursiveExponentiation(3, 1, 5);
		assertTrue(solutionWithRecursion==0.0);		
	}
	
	@Test
	public void testRequirementFR2() throws Exception {
		double solutionWithRecursion = f5ExponentialFunction.recursiveExponentiation(0, 2, 5);
		assertTrue(solutionWithRecursion==0.0);		
	}

	@Test
	public void testRequirementFR4() throws Exception {
		double solutionWithRecursion = f5ExponentialFunction.recursiveExponentiation(0, -2, 5);
		assertTrue(solutionWithRecursion==0.0);		
	}
	
	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testRequirementNFR2() throws Exception {
		exceptionRule.expect(StackOverflowError.class);	 //This test passes if such exception		
		f5ExponentialFunction.recursiveExponentiation(1, 2, 50000);
	}
	
	@Test
	public void testCorrectness() throws Exception {
		double solutionWithRecursion = f5ExponentialFunction.recursiveExponentiation(1, 2, 3);
		assertTrue(solutionWithRecursion==8.0);	
	}
}
