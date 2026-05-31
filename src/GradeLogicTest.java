/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */
public class GradeLogicTest {
	
	@Test
	public void testGetTargetScore() {
		GradeLogic logic = new GradeLogic();
		// Test 1: "A" grade select karne par target score 85 aana chahiye
		assertEquals(85.0, logic.getTargetScore("A"), 0.001);
		// "F" grade par 0 aana chahiye
		assertEquals(0.0, logic.getTargetScore("F"), 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidWeightage() {
		GradeLogic logic = new GradeLogic();
		// Test 2: Agar weightage ka total 100 na ho (jaise yahan 90 hai), toh error aana chahiye
		logic.validateWeightage(20, 20, 20, 20, 10); 
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidMarks() {
		GradeLogic logic = new GradeLogic();
		// Test 3: Agar obtained marks (25) total marks (20) se zyada hon, toh error aana chahiye
		logic.validateInputs(25, 20, 10, 10, 10, 10, 10, 10); 
	}

	@Test
	public void testCalculateCurrentScore() {
		GradeLogic logic = new GradeLogic();
		// Test 4: Agar sab mein full marks hon (Mids 20%, Quiz 10%, Assign 10%, CP 10%), toh current score 50 banna chahiye
		double score = logic.calculateCurrentScore(20, 20, 20, 10, 10, 10, 10, 10, 10, 10, 10, 10);
		assertEquals(50.0, score, 0.001);
	}

}
